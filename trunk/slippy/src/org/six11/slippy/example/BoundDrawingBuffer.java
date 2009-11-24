package org.six11.slippy.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.six11.olive.DrawingBuffer;
import org.six11.slippy.SlippyInterpreter;
import org.six11.slippy.SlippyJavaClass;
import org.six11.slippy.SlippyUtils;
import org.six11.slippy.Thing;
import org.six11.slippy.SymbolTable;
import org.six11.util.Debug;

// import org.six11.slippy.Thing.Codeset;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class BoundDrawingBuffer extends SlippyJavaClass {

  public static int ID_COUNTER = 1;
  public static Collection<DrawingBuffer> buffers = new HashSet<DrawingBuffer>();

  /**
   * Instantiating this class (or any other subclass of SlippyJavaClass) causes the Slippy machine
   * to learn about a new Clazz. The best place to use this is right before the interpreter is
   * invoked.
   * 
   * @param interp
   */
  public BoundDrawingBuffer(SlippyInterpreter interp) {
    super("BoundDrawingBuffer", interp.getMachine().getCodeset("org.six11.slippy.example"),
        "BoundDrawingBuffer.java", interp);
    bug("Note: there are two versions of BoundDrawingBuffer. This one should only be used by "
        + "the example demos. Normally you should use the one in org.six11.olive.");
    addSymbol(new Thing.Function("init", SlippyUtils.mkList(),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        DrawingBuffer b = new DrawingBuffer();
        buffers.add(b);
        context.setThing("buffer", new Thing.JavaObject(b));
        context.setThing("id", new Thing.Str("" + ID_COUNTER++));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("turn", SlippyUtils.mkList("v"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).turn(SlippyUtils.toDouble(paramValues.get(0).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("forward", SlippyUtils.mkList("v"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).forward(SlippyUtils.toDouble(paramValues.get(0).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("up", SlippyUtils.mkList(),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).up();
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("down", SlippyUtils.mkList(),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).down();
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("up", SlippyUtils.mkList(),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).up();
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("moveTo", SlippyUtils.mkList("x", "y"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).moveTo(SlippyUtils.toDouble(paramValues.get(0).toString()),
            SlippyUtils.toDouble(paramValues.get(1).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("setColor", SlippyUtils.mkList("r", "g", "b", "a"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).setColor(SlippyUtils.toDouble(paramValues.get(0).toString()),
            SlippyUtils.toDouble(paramValues.get(1).toString()),
            SlippyUtils.toDouble(paramValues.get(2).toString()),
            SlippyUtils.toDouble(paramValues.get(3).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("setThickness", SlippyUtils.mkList("t"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).setThickness(SlippyUtils.toDouble(paramValues.get(0).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("setFillColor", SlippyUtils.mkList("r", "g", "b", "a"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).setFillColor(SlippyUtils.toDouble(paramValues.get(0).toString()),
            SlippyUtils.toDouble(paramValues.get(1).toString()),
            SlippyUtils.toDouble(paramValues.get(2).toString()),
            SlippyUtils.toDouble(paramValues.get(3).toString()));
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("setFilling", SlippyUtils.mkList("f"),
        "org.six11.slippy.example.BoundDrawingBuffer.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        buffer(context).setFilling(SlippyUtils.toTruth(paramValues.get(0).toString()));
        return Thing.NIL;
      }
    });

    bug("Created BoundDrawingBuffer");
  }

  private static void bug(String what) {
    Debug.out("deprecated BoundDrawingBuffer", what);
  }

  private DrawingBuffer buffer(SymbolTable context) {
    return (DrawingBuffer) ((JavaObject) context.getThing("buffer")).obj;
  }

  // private String id(SymbolTable context) {
  // return ((Thing.Str) context.getThing("id")).toString();
  // }
}
