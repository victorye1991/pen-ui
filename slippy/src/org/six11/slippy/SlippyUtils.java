package org.six11.slippy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.six11.slippy.Thing.Clazz;
import org.six11.util.Debug;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public abstract class SlippyUtils {
  public static boolean toTruth(String n) {
    return "true".equals(n);
  }

  /**
   * Given ANY string, produce a floating point value. If the string doesn't parse to a float, just
   * return zero.
   */
  public static float toFloat(String n) {
    float ret = 0;
    try {
      ret = (float) Double.parseDouble(n);
    } catch (Exception ignore) {
      Debug.out("SlippyUtils", "Error converting string '" + n + "' to float. returning 0.");
      Debug.dumpStack("SlippyUtils", "where");
    }
    return ret;
  }

  public static int toInt(String n) {
    return (int) toFloat(n);
  }

  public static List<String> mkList(String... in) {
    List<String> ret = new ArrayList<String>();
    for (String s : in) {
      ret.add(s);
    }
    return ret;
  }

  public static String stripQuotes(String orig) {
    String ret = orig;
    if (ret.equals("\"\"")) {
      ret = "";
    } else {
      if (ret.length() > 1 && ret.startsWith("\"")) {
        ret = ret.substring(1, ret.length());
      }
      if (ret.length() > 1 && ret.endsWith("\"")) {
        ret = ret.substring(0, ret.length() - 1);
      }
    }
    return ret;
  }

  public static boolean isThingTrue(Thing r) {
    boolean ret = false;
    if (r.type == Thing.Type.String) {
      ret = r.toString().length() > 0;// MathUtils.toTruth(r.toString());
    } else if (r.type == Thing.Type.Function || r.type == Thing.Type.Class
        || r.type == Thing.Type.Array) {
      ret = true; // since it isn't nil...
    } else if (r.type == Thing.Type.Boolean) {
      ret = ((Thing.Bool) r).v;
    } else if (r.type == Thing.Type.Nil) {
      ret = false;
    } else if (r.type == Thing.Type.Number) {
      ret = ((Thing.Num) r).v != 0d;
    } else if (r.type == Thing.Type.Variable) {
      ret = isThingTrue(((Thing.Variable) r).value);
    } else if (r.type == Thing.Type.Instance) {
      ret = true; // all instances are 'true' in that they are non-nil.
    } else {
      bug("I don't know how to determine if '" + r + "' is true or not.");
      ret = false;
    }
    return ret;
  }

  static SymbolTable getSymbolTable(Thing thing, SymbolTable defaultRetValue) {
    SymbolTable ret = defaultRetValue;
    if (thing.type == Thing.Type.Class) {
      ret = ((Thing.Clazz) thing).symbols;
    } else if (thing.type == Thing.Type.Instance) {
      ret = ((Thing.Instance) thing).symbols;
    } else if (thing.type == Thing.Type.Variable) {
      ret = getSymbolTable(((Thing.Variable) thing).value, defaultRetValue);
    } else if (thing.type == Thing.Type.Array) {
      ret = ((Thing.Array) thing).symbols;
    }
    return ret;
  }

  public static void printMembers(Thing t) {
    SymbolTable table = getSymbolTable(t, null);
    while (table != null) {
      if (table.symbols.size() > 0) {
        SlippyMachine.outputStream.println(table.getDebug());
      }
      table = table.parent;
    }
  }

  public static void bug(String what) {
    Debug.out("SlippyUtils", what);
  }

  /**
   * Create a shallow copy of this symbol table including symbols and annotations. This is shallow
   * because it ignores the parent table.
   */
  public static SymbolTable shallowCopy(SymbolTable orig) {
    SymbolTable table = new SymbolTable();
    for (Map.Entry<String, Thing> entry : orig.symbols.entrySet()) {
      table.symbols.put(entry.getKey(), entry.getValue());
    }
    for (Map.Entry<String, List<Thing.Annotation>> annotations : orig.annotations.entrySet()) {
      for (Thing.Annotation ann : annotations.getValue()) {
        table.addAnnotation(annotations.getKey(), (Thing.Annotation) ann.copy());
      }
    }
    table.inst = orig.inst;
    table.clazz = orig.clazz;
    return table;
  }

  public static boolean isCorrectCodeset(Clazz c, String currentFile, String loadPath) {
    boolean ret = false;

    if (currentFile.startsWith(loadPath) && currentFile.length() > loadPath.length()) {
      String p1 = currentFile.substring(loadPath.length() + 1);
      int stop = p1.lastIndexOf(File.separator);
      if (stop < 0) {
        stop = 0;
      }
      String p2 = p1.substring(0, stop);
      ret = p2.equals(c.codeset.getPathString());
    }
    return ret;
  }

  public static Thing dereference(Thing thing) {
    Thing ret = thing;
    if (thing.type == Thing.Type.Variable) {
      ret = ((Thing.Variable) thing).value;
    }
    return ret;
  }

  public static Thing toThing(Object p) {
    Thing ret = Thing.NIL;
    if (p instanceof Thing) {
      ret = (Thing) p;
    } else if (p instanceof Boolean) {
      ret = new Thing.Bool(((Boolean) p).booleanValue());
    } else if (p instanceof String) {
      ret = new Thing.Str((String) p);
    } else if (p instanceof Double) {
      ret = new Thing.Num(((Double) p).doubleValue());
    } else if (p instanceof Float) {
      ret = new Thing.Num(((Float) p).doubleValue());
    } else if (p instanceof Integer) {
      ret = new Thing.Num(((Integer) p).doubleValue());
    } else if (p instanceof Long) {
      ret = new Thing.Num(((Long) p).doubleValue());
    }
    return ret;
  }

  public static List<Thing> toThings(Object... objs) {
    List<Thing> ret = new ArrayList<Thing>();
    for (Object p : objs) {
      ret.add(toThing(p));
    }
    return ret;
  }

  /**
   * Given a string such as "org.six11.foo.MyThing", returns a string such as
   * "org/six11/foo/MyThing.slippy".
   */
  public static String codesetStrToFileStr(String codesetStr) {
    return codesetStr.replace('.', File.separatorChar) + ".slippy";
  }

  /**
   * Given a string such as "/org/six11/foo/MyThing.slippy" or "org/six11/foo/MyThing.slippy",
   * return "org.six11.foo.MyThing"
   */
  public static String fileStrToCodestStr(String fileStr) {
    int lastDot = fileStr.indexOf(".slippy");
    String cs = fileStr.substring(0, lastDot);
    if (cs.startsWith(File.separator)) {
      cs = cs.substring(1);
    }
    return cs.replace(File.separatorChar, '.');
  }

  public static String getFileName() {
    return Thread.currentThread().getStackTrace()[3].getFileName();
  }

  @SuppressWarnings("unchecked")
  public static String toSourceFileName(Class c) {
    return c.getPackage().getName().replace('.', File.separatorChar) + File.separator + c.getName()
        + ".java";
  }

  /**
   * Converts a full codeset and classname into a path string.
   * 
   * Example: if 'fullCodesetAndClassName' is 'org.six11.olive.OliveSoup' and the current load path
   * is 'src', this will return "src/org/six11/olive/OliveSoup.slippy".
   */
  public static String getFullFileName(SlippyInterpreter interp, String fullCodesetAndClassName) {
    StringBuilder buf = new StringBuilder();
    buf.append(interp.getMachine().getEnvironment().getLoadPath());
    if (!buf.toString().endsWith(File.separator)) {
      buf.append("/");
    }
    buf.append(fullCodesetAndClassName.replace('.', File.separatorChar) + ".slippy");
    return buf.toString();
  }

  public static double toDouble(String v) {
    double ret = 0;
    try {
      ret = Double.parseDouble(v);
    } catch (Exception ignore) {
      Debug.out("SlippyUtils", "Error converting string '" + v + "' to double. returning 0.");
      Debug.dumpStack("SlippyUtils", "where");
    }
    return ret;
  }

  /**
   * Given a string such as "org.mypeople.MyThing" or "MyThing", returns the unqualified class name
   * such as "MyThing".
   */
  public static String getClassName(String fqClassName) {
    String ret = fqClassName;
    int idx = fqClassName.lastIndexOf('.');
    if (idx > 0) {
      ret = fqClassName.substring(idx + 1);
    }
    return ret;
  }

  /**
   * Given a string such as "org.mypeople.MyThing" or "MyThing", returns the codeset portion. In
   * this case, either "org.mypeople" or "". It will not return null.
   */
  public static String getCodesetName(String fqClassName) {
    String ret = "";
    int idx = fqClassName.lastIndexOf('.');
    if (idx > 0) {
      ret = fqClassName.substring(0, idx);
    }
    return ret;
  }
}
