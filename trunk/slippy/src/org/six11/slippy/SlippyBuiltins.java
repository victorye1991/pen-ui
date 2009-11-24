package org.six11.slippy;

import static org.six11.slippy.SlippyUtils.mkList;

import java.util.List;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public abstract class SlippyBuiltins {

  public static void initBuiltins(final SlippyInterpreter interp, final SlippyMachine machine,
      final SymbolTable globalTable) {
    globalTable.setThing("print", new Thing.Function("print", mkList("str"), "SlippyMachine.java") {
      @Override
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        StringBuilder buf = new StringBuilder();
        for (Thing t : paramValues) {
          if (t instanceof Thing.Instance) {
            Thing result = interp.invokeInstanceFunction((Thing.Instance) t, "to_s", interp.noArgs);
            if (result != Thing.NIL) {
              buf.append(result.toString() + " ");
            } else {
              buf.append(t.toString() + " ");
            }
          } else {
            buf.append(t.toString() + " ");
          }
        }
        SlippyMachine.outputStream.println(buf.toString().trim());
        return Thing.NIL;
      }
    });
    globalTable.setThing("printMembers", new Thing.Function("printMembers", mkList("str"),
        "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        for (Thing t : paramValues) {
          SlippyUtils.printMembers(t);
        }
        if (paramValues.size() == 0) {
          SlippyMachine.outputStream.println("Global symbols:");
          SlippyMachine.outputStream.println(globalTable.getDebug());
        }
        return Thing.NIL;
      }
    });
    globalTable.setThing("getType", new Thing.Function("getType", mkList("obj"),
        "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        if (paramValues.size() == 1) {
          ret = new Thing.Str("" + paramValues.get(0).type);
        }
        return ret;
      }
    });

    globalTable.setThing("signal", new Thing.Function("signal", mkList("args"),
        "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        if (machine.messageBus != null) {
          machine.messageBus.relay(paramValues, context);
        }
        return Thing.NIL;
      }
    });

    globalTable.setThing("abs", new Thing.Function("abs", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.abs(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("sqrt", new Thing.Function("sqrt", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.sqrt(num.v));
        }
        return ret;
      }
    });

    
    globalTable.setThing("pow", new Thing.Function("pow", mkList("base", "exponent"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        try {
        Thing.Num base = (Thing.Num) SlippyUtils.dereference(paramValues.get(0));
        Thing.Num exponent = (Thing.Num) SlippyUtils.dereference(paramValues.get(1));
        double retDouble = Math.pow(base.v, exponent.v);
        ret = new Thing.Num(retDouble);
        } catch (Exception ex) {
          SlippyMachine.outputStream.println("Got " + ex);
          SlippyMachine.outputStream.println("param 1 class: " + paramValues.get(0).getClass());
          SlippyMachine.outputStream.println("param 1 slippy type: " + paramValues.get(0).type);
          SlippyMachine.outputStream.println("param 1 slippy as string: " + paramValues.get(0));
          SlippyMachine.outputStream.println("param 2 class: " + paramValues.get(1).getClass());
          SlippyMachine.outputStream.println("param 2 slippy type: " + paramValues.get(1).type);
          SlippyMachine.outputStream.println("param 2 slippy as string: " + paramValues.get(1));
        }
        return ret;
      }
    });
    globalTable.setThing("sin", new Thing.Function("sin", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.sin(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("cos", new Thing.Function("cos", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.cos(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("tan", new Thing.Function("tan", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.tan(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("arcsin", new Thing.Function("arcsin", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.asin(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("arccos", new Thing.Function("arccos", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.acos(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("min", new Thing.Function("min", mkList("a", "b"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num a = (Thing.Num) SlippyUtils.dereference(paramValues.get(0));
        Thing.Num b = (Thing.Num) SlippyUtils.dereference(paramValues.get(1));
        double retDouble = Math.min(a.v, b.v);
        ret = new Thing.Num(retDouble);
        return ret;
      }
    });

    globalTable.setThing("max", new Thing.Function("max", mkList("a", "b"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num a = (Thing.Num) SlippyUtils.dereference(paramValues.get(0));
        Thing.Num b = (Thing.Num) SlippyUtils.dereference(paramValues.get(1));
        double retDouble = Math.max(a.v, b.v);
        ret = new Thing.Num(retDouble);
        return ret;
      }
    });

    globalTable.setThing("arctan", new Thing.Function("arctan", mkList("v"), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        Thing.Num num = getNumber(paramValues);
        if (num != null) {
          ret = new Thing.Num(Math.atan(num.v));
        }
        return ret;
      }
    });

    globalTable.setThing("PI", new Thing.Num(Math.PI));
    globalTable.setThing("E", new Thing.Num(Math.E));

    globalTable.setThing("showTables", new Thing.Function("showTables", mkList(),
        "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        if (context != null) {
          SlippyMachine.outputStream.println("Using context symbol table:");
          context.printDebugFull();
          // SlippyMachine.outputStream
          // .println("For grins, here is the machine's current symbol table:");
          machine.getSymbolTable().printDebugFull();
        } else {
          SlippyMachine.outputStream.println("Using machine's current symbol table:");
          machine.getSymbolTable().printDebugFull();
        }
        return Thing.NIL;
      }
    });
    globalTable.setThing("showStacktrace", new Thing.Function("showStacktrace", mkList(),
        "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        String st = interp.getStacktrace();
        SlippyMachine.outputStream.println(st);
        return Thing.NIL;
      }
    });
    globalTable.setThing("now", new Thing.Function("now", mkList(), "SlippyMachine.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
         return new Thing.Num(System.currentTimeMillis());
      }
    });

    globalTable.setThing("Object", new Thing.Clazz("Object", machine.getCodeset(), "__default__"));
  }

  private static Thing.Num getNumber(List<Thing> params) {
    Thing.Num ret = null;
    if (params.size() == 1) {
      Thing t = SlippyUtils.dereference(params.get(0));
      if (t.type == Thing.Type.Number) {
        ret = (Thing.Num) t;
      }
    }
    return ret;
  }
}
