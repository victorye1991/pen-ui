package org.six11.slippy;

import java.awt.geom.AffineTransform;
import static org.six11.slippy.SlippyUtils.mkList;
import java.awt.geom.Point2D;
import java.util.List;

import org.six11.util.Debug;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class Affine extends SlippyJavaClass {

  public Affine(SlippyInterpreter interp) {
    super("Affine", interp.getMachine().getCodeset("org.six11.slippy"), "Affine.java", interp);

    // add an entry for the 'xform' variable
    symbols.setThing("xform", new Thing.JavaObject(new AffineTransform()));

    addSymbol(new Thing.Function("init", mkList(), "Thing.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing maybeJavaType = symbols.getThing("xform");
        AffineTransform xform = new AffineTransform();
        ((Thing.JavaObject) maybeJavaType).obj = xform;
        return Thing.NIL;
      }
    });

    addSymbol(new Thing.Function("translate", mkList("dx, dy"), "Thing.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        if (paramValues.size() == 2) {
          Thing maybeDx = SlippyUtils.dereference(paramValues.get(0));
          Thing maybeDy = SlippyUtils.dereference(paramValues.get(1));
          if (maybeDx instanceof Thing.Num && maybeDy instanceof Thing.Num) {
            double dx = ((Thing.Num) maybeDx).v;
            double dy = ((Thing.Num) maybeDy).v;
            AffineTransform xform = getInstanceAffine();
            xform.translate(dx, dy);
          }
        }
        return ret;
      }
    });
    addSymbol(new Thing.Function("scale", mkList("sx, sy"), "Thing.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        if (paramValues.size() == 2) {
          Thing maybeSx = SlippyUtils.dereference(paramValues.get(0));
          Thing maybeSy = SlippyUtils.dereference(paramValues.get(1));
          if (maybeSx instanceof Thing.Num && maybeSy instanceof Thing.Num) {
            double dx = ((Thing.Num) maybeSx).v;
            double dy = ((Thing.Num) maybeSy).v;
            AffineTransform xform = getInstanceAffine();
            xform.scale(dx, dy);
          }
        }
        return ret;
      }
    });
    addSymbol(new Thing.Function("rotate", mkList("radians"), "Thing.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        if (paramValues.size() == 1) {
          Thing maybeNum = SlippyUtils.dereference(paramValues.get(0));
          if (maybeNum instanceof Thing.Num) {
            double radians = ((Thing.Num) maybeNum).v;
            AffineTransform xform = getInstanceAffine();
            xform.rotate(radians);
          }
        }
        return ret;
      }
    });

    addSymbol(new Thing.Function("transformPoint", mkList("x", "y"), "Thing.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        Thing ret = Thing.NIL;
        if (paramValues.size() == 2) {
          Thing maybeX = SlippyUtils.dereference(paramValues.get(0));
          Thing maybeY = SlippyUtils.dereference(paramValues.get(1));
          if (maybeX instanceof Thing.Num && maybeY instanceof Thing.Num) {
            AffineTransform xform = getInstanceAffine();
            double x = ((Thing.Num) maybeX).v;
            double y = ((Thing.Num) maybeY).v;
            Point2D input = new Point2D.Double(x, y);
            Point2D result = xform.transform(input, null);
            Thing.Map resultMap = new Thing.Map();
            resultMap.put(new Thing.Str("x"), new Thing.Num(result.getX()));
            resultMap.put(new Thing.Str("y"), new Thing.Num(result.getY()));
            double[] numbers = new double[6];
            xform.getMatrix(numbers);
            ret = resultMap;
          }
        }
        return ret;
      }
    });
  }

  private AffineTransform getInstanceAffine() {
    AffineTransform ret = null;
    Thing maybeJavaObj = symbols.getThing("xform");
    if (maybeJavaObj instanceof Thing.JavaObject) {
      ret = (AffineTransform) ((Thing.JavaObject) maybeJavaObj).obj;
    }
    return ret;
  }

  @SuppressWarnings("unused")
  private static void bug(String what) {
    Debug.out("Affine", what);
  }
}
