package org.six11.slippy.example;

import java.util.List;

import org.six11.slippy.SlippyInterpreter;
import org.six11.slippy.SlippyJavaClass;
import org.six11.slippy.SlippyUtils;
import org.six11.slippy.SymbolTable;
import org.six11.slippy.Thing;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SampleJavaBinding extends SlippyJavaClass {

  public SampleJavaBinding(SlippyInterpreter interp) {
    super("SampleJavaBinding", interp.getMachine().getCodeset("org.six11.slippy.example"),
        "SampleJavaBinding.java", interp);
    addSymbol(new Thing.Function("sayHello", SlippyUtils.mkList("name"), "SampleJavaBinding.java") {
      public Thing eval(List<Thing> paramValues, SymbolTable context) {
        System.out.println("Hello, " + paramValues.get(0));
        return Thing.NIL;
      }

    });
  }

}
