package org.six11.slippy;

import static org.six11.slippy.SlippyUtils.mkList;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.six11.util.Debug;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class Thing {

  private static List<Thing> noArgs = new ArrayList<Thing>();
  private static List<String> nomixers;
  static {
    nomixers = new ArrayList<String>();
    nomixers.add("mix");
  }

  public Type type;

  public Thing(Type t) {
    type = t;
  }

  private static void bug(String what) {
    Debug.out("Thing", what);
  }

  public Thing copy() {
    bug("Error: Thing doesn't override 'copy'.");
    return null;
  }

  public static enum Type {
    Nil, Function, Number, String, Boolean, Variable, Array, Class, Instance, Codeset, Map, JavaObject, Annotation, Affine
  }

  public final static Thing NIL = new Thing(Type.Nil) {
    public String toString() {
      return "nil";
    }

    public Thing copy() {
      return this;
    }

    public int hashCode() {
      return "".hashCode();
    }

    public boolean equals(Object other) {
      return other == this;
    }
  };

  public static class Annotation extends Thing {
    private String name;
    private List<Tree> expressions;

    public Annotation(String name) {
      super(Type.Annotation);
      this.name = name;
      this.expressions = new ArrayList<Tree>();
    }

    public String toString() {
      return "@" + name + (expressions.size() > 0 ? "(" + expressions.size() + " expr" + ")" : "");
    }

    public Thing copy() {
      return this;
    }

    public int hashCode() {
      return expressions.hashCode();
    }

    public boolean equals(Object other) {
      return this == other;
    }

    public void addExpression(Tree child) {
      expressions.add(child);
    }

    public List<Tree> getExpressions() {
      return expressions;
    }

    public String getName() {
      return name;
    }
  }

  public static class Array extends Thing {
    private static int instanceCount = 0;
    private int instanceID = instanceCount++;
    private List<Thing.Variable> data;
    SymbolTable symbols;
    private SlippyInterpreter interp;

    public Array(final SlippyInterpreter interp) {
      super(Type.Array);
      this.interp = interp;
      this.data = new ArrayList<Thing.Variable>();
      this.symbols = new SymbolTable();
      symbols.setName("Array Symbol Table #" + instanceID);
      symbols.setThing("n", new Thing.Function("n", mkList(), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          return new Thing.Num(data.size());
        }
      });
      symbols.setThing("add", new Thing.Function("add", mkList("str"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing sorter = SlippyUtils.dereference(symbols.getThing("sort"));
          // bug("adding something with sorter: " + sorter);
          if (sorter.type != Thing.Type.Function) {
            sorter = null;
          }
          for (Thing t : paramValues) {
            if (sorter == null) {
              data.add(new Thing.Variable(t));
            } else {
              addSorted((Thing.Function) sorter, t, context, interp);
            }
          }
          return this; // TODO: pretty sure it should return 'Array.this' instead of just 'this'.
        }
      });
      symbols.setThing("remove", new Thing.Function("remove", mkList("obj"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          if (paramValues.size() == 1) {
            Thing kill = SlippyUtils.dereference(paramValues.get(0));
            Thing target = null;
            for (Thing t : data) {
              if (SlippyUtils.dereference(t).equals(kill)) {
                target = t;
                break;
              }
            }
            ret = target;
            data.remove(target);
          } else {
            bug("Error: Array's 'remove' function expects a single argument (I received "
                + paramValues.size() + ")");
          }
          return ret;
        }
      });
      symbols.setThing("removeAtIndex", new Thing.Function("removeAtIndex", mkList("idx"),
          "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          if (paramValues.size() == 1 && paramValues.get(0).type == Thing.Type.Number) {
            Thing.Num where = (Thing.Num) paramValues.get(0);
            ret = data.remove(where.getIntValue());
          } else {
            bug("Error: Array's 'removeAtIndex' function expects a single integer argument. "
                + " (I received " + paramValues.size() + ")");
          }
          return ret;
        }
      });

      symbols.setThing("indexOf", new Thing.Function("indexOf", mkList("element"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          if (paramValues.size() == 1 || paramValues.size() == 2) {
            Thing target = SlippyUtils.dereference(paramValues.get(0));
            int startIdx = 0;
            if (paramValues.size() == 2) {
              startIdx = (int) ((Thing.Num) SlippyUtils.dereference(paramValues.get(1))).v;
            }
            for (int i=startIdx; i < data.size(); i++) {
              try {
                Thing result = interp.equate(data.get(i).value, target, '=');
                if (SlippyUtils.isThingTrue(result)) {
                  ret = new Thing.Num(i);
                  break;
                }
              } catch (RuntimeException ignore) {
                // in case the target contains elements that we can't compare ours to.
              }
            }
          }
          return ret;
        }
      });
      symbols.setThing("resort", new Thing.Function("resort", mkList("lambda"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing.Array ret = new Thing.Array(interp);
          ret.symbols.setThing("sort", paramValues.get(0));
          // bug("Setting sorter on return array")
          Thing.Function addFunction = (Thing.Function) ret.symbols.getThing("add");
          for (Thing.Variable v : data) {
            Thing t = SlippyUtils.dereference(v);
            addFunction.eval(SlippyUtils.toThings(t), context);
          }
          return ret;
        }
      });
      symbols.setThing("each", new Thing.Function("each", mkList("lambda"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          // Debug.dumpStack("Thing", "Invoking each here. Context table follows.");
          // context.printDebugFull();
          for (Thing.Variable d : data) {
            for (Thing t : paramValues) {
              t = SlippyUtils.dereference(t);
              if (t instanceof Thing.Function) {
                Thing.Function lambda = (Thing.Function) t;
                List<Thing> lambdaParams = new ArrayList<Thing>();
                lambdaParams.add(d.value);
                interp.invokeFunction(lambda, lambdaParams, context); // TODO: 'context' was null
              } else {
                bug("NOT a function: " + t);
              }
            }
          }
          return this;
        }
      });
      symbols.setThing("filter", new Thing.Function("filter", mkList("lambda"), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing.Array ret = new Thing.Array(interp);
          Thing t = SlippyUtils.dereference(paramValues.get(0));
          if (t instanceof Thing.Function) {
            for (Thing.Variable d : data) {
              Thing.Function lambda = (Thing.Function) t;
              List<Thing> lambdaParams = new ArrayList<Thing>();
              lambdaParams.add(d.value);
              Thing result = interp.invokeFunction(lambda, lambdaParams, null);
              if (result != Thing.NIL) {
                ret.data.add(new Thing.Variable(result));
              }
            }
          } else {
            bug("NOT a function: " + t);
          }
          return ret;
        }
      });

      symbols.setThing("sum", new Thing.Function("sum", mkList(), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          double sum = 0.0;
          for (Thing.Variable d : data) {
            Thing elm = SlippyUtils.dereference(d);
            if (elm.type == Thing.Type.Number) {
              sum += ((Thing.Num) elm).v;
            }
          }
          ret = new Thing.Num(sum);
          return ret;
        }
      });

      symbols.setThing("min", new Thing.Function("min", mkList(), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          double min = Double.MAX_VALUE;
          for (Thing.Variable d : data) {
            Thing elm = SlippyUtils.dereference(d);
            if (elm.type == Thing.Type.Number) {
              min = Math.min(min, ((Thing.Num) elm).v);
            }
          }
          ret = new Thing.Num(min);
          return ret;
        }
      });

      symbols.setThing("max", new Thing.Function("max", mkList(), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing ret = Thing.NIL;
          double max = Double.MIN_VALUE;
          for (Thing.Variable d : data) {
            Thing elm = SlippyUtils.dereference(d);
            if (elm.type == Thing.Type.Number) {
              max = Math.max(max, ((Thing.Num) elm).v);
            }
          }
          ret = new Thing.Num(max);
          return ret;
        }
      });

      symbols.setThing("copy", new Thing.Function("copy", mkList(), "Thing.java") {
        public Thing eval(List<Thing> paramValues, SymbolTable context) {
          Thing.Array ret = new Thing.Array(interp);
          for (Thing.Variable d : data) {
            ret.data.add((Thing.Variable) d.copy());
          }
          return ret;
        }
      });
    }

    private int evalComparator(Thing.Function sorter, Thing a, Thing b, SymbolTable context,
        SlippyInterpreter interp) {
      int ret = 0;
      Thing result = interp.invokeFunction(sorter, SlippyUtils.toThings(a, b), context);
      if (result.type == Thing.Type.Number) {
        double v = ((Thing.Num) result).v;
        if (v < 0) {
          ret = -1;
        } else if (v > 0) {
          ret = 1;
        } else {
          ret = 0;
        }
      }
      return ret;
    }

    protected void addSorted(Thing.Function sorter, Thing t, SymbolTable context,
        SlippyInterpreter interp) {
      // do a binary search for the first index where 't' is >= indexed value.
      // corner case for no data:
      if (data.size() == 0) {
        data.add(new Thing.Variable(t));
      } else {
        int start = 0;
        int stop = data.size();
        int idx;
        // corner cases for insertion at beginning and end.
        if (evalComparator(sorter, t, SlippyUtils.dereference(data.get(0)), context, interp) <= 0) {
          idx = 0;
        } else if (evalComparator(sorter, t, SlippyUtils.dereference(data.get(data.size() - 1)),
            context, interp) >= 0) {
          idx = data.size();
        } else {
          while (true) {

            idx = (start + stop) / 2;
            int result = evalComparator(sorter, t, SlippyUtils.dereference(data.get(idx)), context,
                interp);
            if (result < 0) {
              stop = idx;
            } else if (result > 0) {
              start = idx;
            } else {
              break;
            }
            if (start + 1 == stop) {
              idx = stop;
              break;
            }
          }
        }
        data.add(idx, new Thing.Variable(t));
      }

    }

    public Thing.Variable getSlot(int idx) {
      return data.get(idx);
    }

    public Thing getValue(int idx) {
      Thing ret = Thing.NIL;
      Thing slot = getSlot(idx);
      if (slot.type == Thing.Type.Variable) {
        ret = ((Thing.Variable) slot).value;
      }
      return ret;
    }

    public void addValue(Thing v) {
      data.add(new Thing.Variable(v));
    }

    public int size() {
      return data.size();
    }

    public List<Thing.Variable> getData() {
      return data;
    }

    public String toString() {
      StringBuilder b = new StringBuilder();
      b.append("[");
      boolean first = true;
      for (int i = 0; i < data.size(); i++) {
        Thing t = getValue(i);
        String strVal = t.toString();
        if (t instanceof Thing.Instance) {
          Thing result = interp.invokeInstanceFunction((Thing.Instance) t, "to_s", noArgs);
          if (result != Thing.NIL) {
            strVal = result.toString();
          }
        }
        if (!first) {
          b.append(",");
        }
        b.append(" " + strVal);
        first = false;
      }
      b.append(" ]");
      return b.toString();
    }

    public int hashCode() {
      return data.hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Array) && ((Thing.Array) other).data.equals(data));
    }

    void accommodate(int idx) {
      while (data.size() <= idx) {
        data.add(new Thing.Variable("array slot"));
      }
    }

    public Thing copy() {
      return this;
    }
  }

  public static class Bool extends Thing {
    boolean v;

    public Bool(boolean value) {
      super(Type.Boolean);
      this.v = value;
    }

    public String toString() {
      return "" + v;
    }

    public Thing copy() {
      return new Bool(v);
    }

    public int hashCode() {
      return Boolean.valueOf(v).hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Bool) && ((Thing.Bool) other).v == v);
    }
  }

  public static class Clazz extends Thing {
    String name;
    SymbolTable symbols;
    Clazz superClass;
    String superClassName;
    Codeset codeset;
    List<Clazz> mixedClasses;
    List<String> mixedClassNames;
    String sourceFileName;
    boolean initialized;

    public Clazz(String name, Codeset codeset, String sourceFileName) {
      super(Type.Class);
      this.name = name;
      this.symbols = new SymbolTable();
      this.superClass = null;
      this.superClassName = null;
      this.mixedClasses = new ArrayList<Clazz>();
      this.mixedClassNames = new ArrayList<String>();
      this.sourceFileName = sourceFileName;
      this.codeset = codeset;

    }

    public String toString() {
      return "(class " + name + ")";
    }

    public Thing copy() {
      return this;
    }

    public int hashCode() {
      return (sourceFileName + name).hashCode();
    }

    public String getFullyQualifiedName() {
      String ret = "";
      if (codeset != null && codeset.toString().length() > 0) {
        ret = codeset.toString() + "." + toString();
      } else {
        ret = toString();
      }
      return ret;

    }

    public boolean equals(Object other) {
      return other == this;
    }
  }

  public static class Codeset extends Thing {
    String codesetStr;
    private java.util.Map<String, Clazz> classes;

    Codeset(String codesetStr) {
      super(Type.Codeset);
      this.codesetStr = codesetStr;
      this.classes = new HashMap<String, Clazz>();
    }

    public String getPathString() {
      return codesetStr.replace('.', File.separatorChar);
    }

    public String toString() {
      return codesetStr;
    }

    public Thing.Clazz getClass(String name) {
      return classes.get(name);
    }

    public void addClass(Clazz c) {
      classes.put(c.name, c);
    }

    public String showClasses() {
      StringBuilder buf = new StringBuilder();
      buf.append("\n--- codeset '" + codesetStr + "' knows about the following " + classes.size()
          + " classes:\n");
      for (java.util.Map.Entry<String, Clazz> en : classes.entrySet()) {
        buf.append("\t" + en.getKey() + " <==> " + en.getValue() + "\n");
      }
      buf.append("--- (done)\n");
      return buf.toString();
    }

    public int hashCode() {
      return codesetStr.hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Codeset) && other.toString().equals(toString()));
    }

    public boolean hasClass(String className) {
      return classes.containsKey(className);
    }
  }

  public static class Function extends Thing {

    public String name;
    public List<String> paramNames;
    public Tree block;
    public String sourceFileName;

    public Function(String name, List<String> paramNames, String fileName) {
      super(Type.Function);
      this.name = name;
      this.paramNames = paramNames;
      this.block = null;
      this.sourceFileName = fileName;
    }

    public boolean isBuiltin() {
      return block == null;
    }

    public Thing eval(@SuppressWarnings("unused") List<Thing> paramValues,
        @SuppressWarnings("unused") SymbolTable context) {
      throw new RuntimeException("Builtin functions must override Function.eval to be useful.");
    }

    public String toString() {
      StringBuilder signature = new StringBuilder();
      signature.append(name + " (");
      boolean first = true;
      for (String n : paramNames) {
        if (!first) {
          signature.append(", ");
        }
        signature.append(n);
        first = false;
      }
      signature.append(")");
      return signature.toString();
    }

    public int hashCode() {
      return toString().hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Function) && other.toString().equals(toString()));
    }

    public Thing copy() {
      return this;
    }
  }

  public static class Instance extends Thing {
    Clazz clazz;
    SymbolTable symbols;

    public Instance(Clazz c) {
      super(Type.Instance);
      this.clazz = c;
      symbols = clazz != null ? new SymbolTable(clazz.symbols) : new SymbolTable();
      symbols.setName("Table for " + clazz.name + " instance");
      symbols.setInstance(this);
      SymbolTable table = symbols.parent;
      while (table != null) {
        // copy the member fields from the parent class and all other ancestors
        copyMemberFields(table);
        table = table.parent;
      }

      symbols.setThing("printSymbolTable", new Thing.Function("printSymbolTable", mkList(),
          "Thing.java") {
        public Thing eval(List<Thing> arg0, SymbolTable arg1) {
          symbols.printDebugFull();
          return Thing.NIL;
        }
      });
      
      symbols.setThing("getClass", new Thing.Function("getClass", mkList(),
      "Thing.java") {
    public Thing eval(List<Thing> arg0, SymbolTable arg1) {
      return clazz;
    }
  });

    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Instance) && other.toString().equals(toString()));
    }

    public int hashCode() {
      return symbols.hashCode();
    }

    private final void copyMemberFields(SymbolTable table) {
      for (java.util.Map.Entry<String, Thing> entry : table.symbols.entrySet()) {
        if (entry.getValue().type != Thing.Type.Function
            && entry.getValue().type != Thing.Type.Class
            && table.getAnnotation(entry.getKey(), "static") == null) {
          symbols.setThing(entry.getKey(), entry.getValue().copy());
        }
      }
    }

    public String toString() {
      return "<" + clazz.name + "@" + symbols.hashCode() + ">";
    }

    public Thing copy() {
      return this;
    }

    public Thing getMember(String name) {
      Thing ret = Thing.NIL;
      if (symbols.hasThing(name)) {
        ret = symbols.getThing(name);
      }
      return ret;
    }
  }

  public static class JavaObject extends Thing {
    public Object obj;

    public JavaObject(Object obj) {
      super(Type.JavaObject);
      this.obj = obj;
    }

    public String toString() {
      return obj.toString();
    }

    public Thing copy() {
      return this;
    }

    public int hashCode() {
      return obj.hashCode();
    }

    public boolean equals(Object other) {
      return other.equals(obj);
    }
  }

  public static class Map extends Thing {
    java.util.Map<Thing, Thing.Variable> data;

    public Map() {
      super(Type.Map);
      data = new HashMap<Thing, Thing.Variable>();
    }

    public Thing get(Thing k) {
      Thing ret = Thing.NIL;
      if (data.containsKey(k)) {
        ret = data.get(k);
      }
      return ret;
    }

    public void put(Thing k, Thing v) {
      getSlot(k).value = v;
    }

    public String toString() {
      StringBuilder buf = new StringBuilder();
      buf.append("{");
      boolean first = true;
      for (Thing t : data.keySet()) {
        if (!first) {
          buf.append(",");
        }
        first = false;
        buf.append(" " + t + " : " + data.get(t).value);
      }
      buf.append(" }");
      return buf.toString();
    }

    public Thing.Variable getSlot(Thing key) {
      Thing.Variable ret = null;
      if (data.containsKey(key)) {
        ret = data.get(key);
      } else {
        ret = new Thing.Variable(Thing.NIL);
        data.put(key, ret);
      }
      return ret;
    }

    public int hashCode() {
      return data.hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Map) && ((Thing.Map) other).data.equals(data));
    }

    public Thing copy() {
      return this;
    }
  }

  public static class Num extends Thing {
    double v;

    public Num(String value) {
      super(Type.Number);
      v = SlippyUtils.toFloat(value);
    }

    public Num(double value) {
      super(Type.Number);
      v = value;
    }

    public Num(long value) {
      super(Type.Number);
      v = (double) value;
    }

    public double getDoubleValue() {
      return v;
    }

    public int getIntValue() {
      return (int) v;
    }

    public long getLongValue() {
      return (long) v;
    }

    public float getFloatValue() {
      return (float) v;
    }

    public String toString() {
      return "" + v;
    }

    public Thing copy() {
      return new Num(v);
    }

    public int hashCode() {
      return Double.valueOf(v).hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Num) && ((Thing.Num) other).v == v);
    }
  }

  public static class Str extends Thing {
    String v;

    public Str(String value) {
      super(Type.String);
      this.v = value;
    }

    public String toString() {
      return v;
    }

    public Thing copy() {
      return new Str(v);
    }

    public int hashCode() {
      return v.hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Str) && ((Thing.Str) other).v.equals(v));
    }
  }

  public static class Variable extends Thing {
    String localName;
    Thing value;

    public Variable(String localName) {
      super(Type.Variable);
      this.localName = localName;
      this.value = Thing.NIL;
    }

    public Variable(Thing value) {
      super(Type.Variable);
      this.localName = "anonymous";
      this.value = value;
    }

    public String toString() {
      return value.toString();
    }

    public Thing copy() {
      return new Variable(value);
    }

    public Thing getValue() {
      return value;
    }

    public int hashCode() {
      return value.hashCode();
    }

    public boolean equals(Object other) {
      return ((other instanceof Thing.Variable) && ((Thing.Variable) other).value.equals(value));
    }
  }
}
