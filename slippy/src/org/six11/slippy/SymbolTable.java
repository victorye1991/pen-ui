package org.six11.slippy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.six11.slippy.Thing.Annotation;
import org.six11.slippy.Thing.Clazz;
import org.six11.util.Debug;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SymbolTable {

  protected SymbolTable parent;
  protected HashMap<String, Thing> symbols;
  protected HashMap<String, List<Thing.Annotation>> annotations;
  private String name;
  protected Thing.Instance inst;
  protected Thing.Clazz clazz;

  SymbolTable() {
    this((SymbolTable) null);
  }
  
  SymbolTable(SymbolTable parent) {
    symbols = new HashMap<String, Thing>();
    this.parent = parent;
    this.name = "anonymous_symbol_table";
    this.annotations = new HashMap<String, List<Thing.Annotation>>();
  }

  public Thing.Instance getInstance() {
    Thing.Instance ret = null;
    if (inst != null) {
      ret = inst;
    } else {
      ret = parent.getInstance();
    }
    return ret;
  }
  
  public void setInstance(Thing.Instance inst) {
    this.inst = inst;
  }
  
  public boolean isInstance() {
    return (inst != null || (parent != null && parent.isInstance()));
  }
  
  public void setThing(String name, Thing value) {
    if (parent != null && (null != parent.getThing(name))) {
      // TODO: we are shadowing a parent's symbol, which might trigger a warning.
    }
    symbols.put(name, value);
  }
  
  public boolean isSlippyClass() {
    return (clazz != null || (parent != null && parent.isSlippyClass()));
  }

  public Thing.Clazz getSlippyClass() {
    Thing.Clazz ret = null;
    if (clazz != null) {
      ret = clazz;
    } else {
      ret = parent.getSlippyClass();
    }
    return ret;
  }
  

  public void setSlippyClass(Clazz c) {
    this.clazz = c;
  }

  public Thing getThing(String name) {
    Thing ret = symbols.get(name);
    if (ret == null && parent != null) {
      ret = parent.getThing(name);
    }
    if (ret == null) {
      ret = Thing.NIL;
    }
    return ret;
  }

  public boolean hasThing(String name) {
    return symbols.containsKey(name) || (parent != null && parent.hasThing(name));
  }

  void setName(String n) {
    this.name = n;
  }

  public void printDebug() {
    SlippyMachine.outputStream.println(getDebug());
  }

  public void printDebugFull() {
    SlippyMachine.outputStream.println(getDebugFull());
  }

  public String getDebugFull() {
    return (parent != null ? parent.getDebugFull() + "\n" : "") + getDebug();
  }

  public String getDebug() {
    StringBuilder buf = new StringBuilder();
    List<String> varNames = new ArrayList<String>();
    List<String> values = new ArrayList<String>();
    List<String> annotes = new ArrayList<String>();

    int longestVarName = 0;
    int longestValue = 0;
    int longestAnnote = 0;

    for (Map.Entry<String, Thing> entry : symbols.entrySet()) {
      String s = "";

      s = entry.getKey();
      longestVarName = Math.max(s.length(), longestVarName);
      varNames.add(s);

      s = entry.getValue().toString();
      longestValue = Math.max(s.length(), longestValue);
      values.add(s);

      StringBuilder annoteBuf = new StringBuilder(" ");
      for (Annotation an : getAnnotations(entry.getKey())) {
        annoteBuf.append(an.toString() + " ");
      }
      s = annoteBuf.toString().trim();
      longestAnnote = Math.max(s.length(), longestAnnote);
      annotes.add(s);
    }
    int totalLength = longestVarName + longestValue + longestAnnote + 10;
    buf.append("+");
    for (int i = 1; i < (totalLength - 1); i++) {
      buf.append("-");
    }
    buf.append("+");
    if (name != null && name.length() > 0) {
      buf.append("  (" + name + ") (hash: " + hashCode() + ")");
    }
    if (parent != null) {
      buf.append(" (parent: " + parent.hashCode() + ")");
    }
    buf.append("\n");
    for (int i = 0; i < varNames.size(); i++) {
      buf.append("| ");
      buf.append(varNames.get(i));
      for (int j = varNames.get(i).length(); j < longestVarName + 1; j++) {
        buf.append(" ");
      }
      buf.append("| ");
      buf.append(values.get(i));
      for (int j = values.get(i).length(); j < longestValue + 1; j++) {
        buf.append(" ");
      }
      buf.append("| ");
      buf.append(annotes.get(i));
      for (int j = annotes.get(i).length(); j < longestAnnote + 1; j++) {
        buf.append(" ");
      }
      buf.append("|\n");
    }
    buf.append("+");
    for (int i = 1; i < (totalLength - 1); i++) {
      buf.append("-");
    }
    buf.append("+\n");
    return buf.toString();
  }

  @SuppressWarnings("unused")
  private void bug(String what) {
    Debug.out("SymbolTable", what);
  }

  public void addAnnotation(String symbolName, Annotation annotation) {
    if (!getAnnotations(symbolName).contains(annotation)) {
      getAnnotations(symbolName).add(annotation);
    }
  }

  public Thing.Annotation getAnnotation(String symbolName, String annotationName) {
    Thing.Annotation ret = null;
    for (Thing.Annotation ann : getAnnotations(symbolName)) {
      if (ann.getName().equals(annotationName)) {
        ret = ann;
        break;
      }
    }
    if (ret == null && parent != null) {
      ret = parent.getAnnotation(symbolName, annotationName);
    }
    return ret;
  }

  public List<Annotation> getAnnotations(String symbolName) {
    if (annotations.get(symbolName) == null) {
      annotations.put(symbolName, new ArrayList<Annotation>());
    }
    return annotations.get(symbolName);
  }
 
  public List<String> getNamesWithAnnotation(String annotationType) {
    List<String> ret = new ArrayList<String>();
    for (String symbolName : annotations.keySet()) {
      for (Annotation annote : getAnnotations(symbolName)) {
        if (annote.getName().equals(annotationType)) {
          ret.add(symbolName);
          break;
        }
      }
    }
    return ret;
  }
  
  /**
   * Copy all symbols and annotations from the source table.
   */
  public void copyFrom(SymbolTable source) {
    // symbols
    for (Map.Entry<String, Thing> entry : source.symbols.entrySet()) {
      symbols.put(entry.getKey(), entry.getValue().copy());
    }
    
    // annotations
   for (Map.Entry<String, List<Thing.Annotation>> entry : source.annotations.entrySet()) {
     for (Thing.Annotation ann : entry.getValue()) {
       addAnnotation(entry.getKey(), ann);
     }
   }
  }
  
  public int hashCode() {
    return symbols.hashCode();
  }

  public boolean equals(Object obj) {
    return obj == this;
  }

  public String getName() {
    return name;
  }

  
}
