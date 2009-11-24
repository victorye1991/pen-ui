package org.six11.slippy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.*;

import org.six11.slippy.Thing.Annotation;
import org.six11.slippy.Thing.Function;
import org.six11.util.Debug;
import org.six11.util.io.FileUtil;
import org.six11.util.io.HttpUtil;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyMachine {

  public static PrintStream outputStream = System.out;

  private Stack<SymbolTable> symbolStack;
  private Stack<String> fileNames;
  private Stack<String> functionNames;
  private Set<String> loadedFiles;
  private Map<String, Thing.Codeset> namedCodesets;
  private Map<String, Map<String, Thing.Clazz>> importedClasses; // maps files to a list of imports
  private Map<Annotation, Map<SymbolTable, Map<List<Thing>, Thing>>> caches;

  boolean debugging = false; // set to false to supress table printouts.

  private Thing retVal;
  private SymbolTable globalTable;
  private String loadPath;
  private boolean webEnvironment = false;
  private HttpUtil web;
  private Map<String, Thing.Codeset> fileToCodeset; // maps filenames to codesets
  MessageBus messageBus;

  SlippyInterpreter interp;

  /**
   * Gives the global table. Please use this with care.
   */
  public SymbolTable getGlobalTable() {
    return globalTable;
  }

  public boolean isWebEnvironment() {
    return webEnvironment;
  }

  public void setWebEnvironment(boolean v) {
    this.webEnvironment = v;
  }

  public SlippyMachine(final SlippyInterpreter interp) {
    this.interp = interp;
    resetRuntimeState();
  }

  public void resetRuntimeState() {
    globalTable = new SymbolTable();
    globalTable.setName("Global symbol table");
    symbolStack = new Stack<SymbolTable>();
    fileNames = new Stack<String>();
    functionNames = new Stack<String>();
    loadedFiles = new HashSet<String>();
    fileToCodeset = new HashMap<String, Thing.Codeset>();
    namedCodesets = new HashMap<String, Thing.Codeset>();
    importedClasses = new HashMap<String, Map<String, Thing.Clazz>>();
    caches = new HashMap<Annotation, Map<SymbolTable, Map<List<Thing>, Thing>>>();

    pushFileName("__default__");
    SlippyBuiltins.initBuiltins(interp, this, globalTable);

    popFileName(true);
    symbolStack.push(globalTable);
  }

  public void setMessageBus(MessageBus bus) {
    this.messageBus = bus;
  }

  public Thing getReturnValue() {
    return retVal;
  }

  private void bug(String what) {
    Debug.out("SlippyMachine", what);
  }

  // private void err(String what) {
  // Debug.out("> SlippyMachine", what);
  // }

  public Thing find(String name) {
    Thing ret = Thing.NIL;
    ret = getSymbolTable().getThing(name);
    if (ret == Thing.NIL) {
      ret = globalTable.getThing(name);
    }
    return ret;
  }

  public void addGlobal(String name, Thing value) {
    globalTable.setThing(name, value);
  }

  /**
   * Attempts to locate the named class. First it looks in the current file's symbol table, then in
   * the import table. If it still isn't found it tries to find the source file based on the name
   * ("name.slippy") in the current file's codeset. If it is still not found, it looks in the
   * __default__ table.
   */
  public Thing.Clazz findClass(String name) {
    Thing.Clazz ret = null;

    // checks the current symbol table. It will find classes defined in this file.
    Thing maybeClass = find(name);
    // if not found, check the current file's import list.
    if (maybeClass == Thing.NIL && importedClasses.get(getCurrentFile()) != null
        && importedClasses.get(getCurrentFile()).get(name) != null) {
      maybeClass = importedClasses.get(getCurrentFile()).get(name);
    }

    // if still not found, look in the current file's codeset. E.g., if our file declares it is in
    // "codeset org.foobar.stuff", this block gets the org.foobar.stuff Thing.Codeset and looks for
    // a Clazz identified by 'name' there.
    //
    // An important caveat is that the class indicated by the codeset/name might be defined in Java.
    // In this case, it will not find a slippy file. In that case, in order for the class to be
    // found, it must first be put there. Therefore it is advised that all Java-defined slippy
    // classes be bound before interpreting any slippy code. See the
    // org.six11.slippy.example.Example and examine the use of SampleJavaBinding.java.
    if (maybeClass == Thing.NIL) {
      Thing.Codeset currentCodeset = getCodeset();
      if (currentCodeset != null) {
        Thing.Clazz c2 = currentCodeset.getClass(name);
        // it could be a java-binding object
        if (c2 != null) {
          maybeClass = c2;
        } else {
          maybeClass = interp.importFromFile(name, currentCodeset.codesetStr);
        }
      }
    }

    // if the class has been found, initialize it. This will resolve all the things it depends on as
    // well, such as its superclass and mixed-in classes.
    if (maybeClass.type == Thing.Type.Class) {
      Thing.Clazz c = (Thing.Clazz) maybeClass;
      ret = initializeClass(c);
    }
    if (ret == null) {
      throw new RuntimeException("Can't find class '" + name + "'. Did you import it?");
    }
    return ret;
  }

  /**
   * Performs an absolute lookup for the given class and returns it IF IT HAS ALREADY BEEN LOADED.
   * It does not load files itself; that must be done earlier via an import statement.
   */
  public Thing.Clazz findClass(String codesetName, String baseName) {
    Thing.Clazz ret = null;
    if (namedCodesets.containsKey(codesetName)) {
      Thing.Codeset codeset = namedCodesets.get(codesetName);
      ret = codeset.getClass(baseName);
    }
    return ret;
  }

  public Thing.Clazz initializeClass(Thing.Clazz c) {
    try {
      pushFileName(c.sourceFileName);
      if (!c.initialized) {
        if (c.superClassName != null) {
          c.superClass = findClass(c.superClassName);
          c.symbols.parent = c.superClass.symbols;
        }
        for (String s : c.mixedClassNames) {
          Thing.Clazz mixme = findClass(s);
          c.symbols.copyFrom(mixme.symbols);
          c.mixedClasses.add(mixme);
        }
        c.initialized = true;
      }
    } finally {
      popFileName(false);
    }
    return c;
  }

  public Thing.Variable initializeVariable(String varName) {
    Thing.Variable t = new Thing.Variable(varName);
    getSymbolTable().setThing(varName, t);
    return t;
  }

  public void set(String name, Thing value) {
    getSymbolTable().setThing(name, value);
  }

  public void addAnnotation(String symbolName, Annotation annotation) {
    getSymbolTable().addAnnotation(symbolName, annotation);
  }

  @SuppressWarnings("unchecked")
  public void setCachedVersion(Function function, List<Thing> argVals, SymbolTable context,
      Thing val) {
    if (context != null) {
      Thing.Annotation ann = context.getAnnotation(function.name, "cacheable");
      if (ann != null) {
        if (!caches.containsKey(ann)) {
          caches.put(ann, new HashMap<SymbolTable, Map<List<Thing>, Thing>>());
        }
        if (!caches.get(ann).containsKey(context)) {
          caches.get(ann).put(context, new HashMap<List<Thing>, Thing>());
        }
        Map<List<Thing>, Thing> values = caches.get(ann).get(context);
        if (values.size() > 10) {
          // TODO: the values should be chronologically ordered.
          List<Thing> removeMe = (List<Thing>) values.keySet().toArray()[10];
          values.remove(removeMe);
        }
        values.put(argVals, val);
      }
    }
  }

  public Thing getCachedVersion(Function function, List<Thing> argVals, SymbolTable context) {
    Thing ret = null;
    if (context != null) {
      Thing.Annotation ann = context.getAnnotation(function.name, "cacheable");
      if (ann != null && caches.get(ann) != null && caches.get(ann).get(context) != null) {
        Map<List<Thing>, Thing> pastResults = caches.get(ann).get(context);
        for (List<Thing> params : pastResults.keySet()) {
          boolean ok = true;
          for (int i = 0; i < params.size(); i++) {
            if (!params.get(i).equals(argVals.get(i))) {
              ok = false;
              break;
            }
          }
          if (ok) {
            ret = pastResults.get(params);
            break;
          }
        }
      }
    }
    return ret;
  }

  public boolean hasCachedVersion(Function function, List<Thing> argVals, SymbolTable context) {
    Thing cachedVersion = getCachedVersion(function, argVals, context);
    return cachedVersion != null;
  }

  public void showSymbolTables_() {
    showSymbolTables(null);
  }

  public void showTables(String when) {
    if (debugging) {
      outputStream.println(" /~");
      showSymbolTables(when);
      outputStream.println(" \\_");
    }
  }

  public void showSymbolTables(String when) {
    SymbolTable top = getSymbolTable();
    outputStream.println("     Symbol Tables " + (when == null ? "" : " < " + when + " >"));
    for (SymbolTable st : symbolStack) {
      outputStream.println("--- " + st.hashCode() + " --------" + (st == top ? " (top)" : "------")
          + (st.parent == null ? "(no parent)" : "(parent: " + st.parent.hashCode() + ")"));
      st.printDebug();
      outputStream.println("----------------------------------------------------");
    }
  }

  public SymbolTable getSymbolTable() {
    return symbolStack.peek();
  }

  /**
   * Pushes scope onto the symbol table using the given parent. This is used when variables already
   * defined are NOT available in the new context, e.g. in function calls. The provided symbol table
   * is probably going to belong to an instance or class or the global table. (Remember symbols like
   * 'print' live in the global table.)
   */
  public SymbolTable pushSymbolTable(SymbolTable parent) {
    SymbolTable newSymbols = new SymbolTable(parent);
    symbolStack.push(newSymbols);
    showTables("after symbol push");
    return newSymbols;
  }

  /**
   * Pushes a layer of scope onto the symbol table. This is suitable for use in loop structures
   * where variables already in use remain available.
   */
  public void pushSymbolTable() {
    SymbolTable parent = getSymbolTable();
    pushSymbolTable(parent);
  }

  public void popSymbolTable() {
    symbolStack.pop();
    if (symbolStack.isEmpty()) {
      Debug.dumpStack("SlippyMachine", "Symbol stack is now empty. That should not happen.");
    }
    showTables("after symbol pop");
  }

  public void setReturnValue(Thing ret) {
    retVal = ret;
  }

  public void setLoadPath(String path) {
    loadPath = path;
    bug("Set load path to " + path);
  }

  public String getLoadPath() {
    return loadPath;
  }

  public void pushFileName(String n) {
    if (n == null) {
      Debug.dumpStack("SlippyMachine", "you shouldn't push a null file name. Where am I?");
    }
    fileNames.push(n);
  }

  /**
   * Removes the current file, and optionally setting it as loaded or not. Once a file is loaded, it
   * won't be re-loaded unless you jump through hoops.
   */
  public String popFileName(boolean load) {
    String fileLoaded = fileNames.pop();
    if (load) {
      loadedFiles.add(fileLoaded);
    }
    return fileLoaded;
  }

  public HttpUtil getWebClassLoader() throws MalformedURLException {
    if (web == null) {
      web = new HttpUtil();
    }
    return web;
  }

  public boolean isFileLoaded(String fileName) {
    return loadedFiles.contains(fileName);
  }

  public String getCurrentFile() {
    return fileNames.peek();
  }

  public String getCallingFile() {
    String ret = null;
    if (fileNames.size() > 1) {
      ret = fileNames.get(fileNames.size() - 2);
    }
    return ret;
  }

  public void setCodeset(Thing.Codeset codeset) {
    if (!namedCodesets.containsKey(codeset.codesetStr)) {
      namedCodesets.put(codeset.codesetStr, codeset);
    }
    fileToCodeset.put(getCurrentFile(), codeset);
  }

  public Thing.Codeset getCodeset(String codesetStr) {
    if (!namedCodesets.containsKey(codesetStr)) {
      namedCodesets.put(codesetStr, new Thing.Codeset(codesetStr));
    }
    return namedCodesets.get(codesetStr);
  }

  public Thing.Codeset getCodeset() {
    return fileToCodeset.get(getCurrentFile());
  }

  public void addImport(String fileName, Thing.Clazz clazz) {
    if (!importedClasses.containsKey(fileName)) {
      importedClasses.put(fileName, new HashMap<String, Thing.Clazz>());
    }
    if (!importedClasses.get(fileName).containsKey(clazz.name)) {
      importedClasses.get(fileName).put(clazz.name, clazz);
    }
  }

  public void showNamedCodesets() {
    bug("Listing " + namedCodesets.size() + " named codesets.");
    for (Map.Entry<String, Thing.Codeset> en : namedCodesets.entrySet()) {
      bug(en.getKey() + " <==> " + en.getValue());
    }
  }

  public static void setOutputStream(PrintStream outputStream) {
    SlippyMachine.outputStream = outputStream;
  }

  public String loadStringFromFile(String fullFileName) throws FileNotFoundException, IOException {
    String ret = "";
    if (isWebEnvironment()) {
      try {
        HttpUtil wcl = getWebClassLoader();
        ret = wcl.downloadUrlToString(fullFileName);
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    } else {
      ret = FileUtil.loadStringFromFile(fullFileName);
    }
    return ret;
  }

  public String getFullFileName(String className, String codesetStr) {
    String ret = "";
    if (isWebEnvironment()) {
      ret = getLoadPath() + "request/" + (codesetStr.length() > 0 ? codesetStr + "." : "")
          + className;
    } else {
      ret = getLoadPath() + File.separatorChar + codesetStr.replace('.', File.separatorChar)
          + File.separator + className + ".slippy";
    }
    return ret;
  }

  public void pushFunctionName(String name) {
    functionNames.push(name);
  }
  
  public String popFunctionName() {
    return functionNames.pop();
  }
  
  public String getCurrentFunction() {
    return functionNames.isEmpty() ? null : functionNames.peek();
  }

}
