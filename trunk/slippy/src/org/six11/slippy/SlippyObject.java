package org.six11.slippy;

import java.util.ArrayList;
import java.util.List;

import org.six11.util.Debug;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyObject {
  Thing.Instance instance;
  SlippyInterpreter interp;

  public SlippyObject(SlippyObjectType slippyObjectType, List<Thing> paramThings,
      SlippyInterpreter interp) {
    this.interp = interp;
    this.instance = new Thing.Instance(slippyObjectType.clazz);

    if (instance.symbols.hasThing("init")) {
      callWithParams("init", paramThings);
    }
  }

  public Thing getInstance() {
    return instance;
  }

  public static void bug(String what) {
    Debug.out("SlippyObject", what);
  }

  public Thing call(String functionName, Object... params) {
    return callWithParams(functionName, SlippyUtils.toThings(params));
  }

  public Thing callWithParams(String functionName, List<Thing> params) {
    Thing ret = Thing.NIL;
    Thing f = instance.symbols.getThing(functionName);
    if (f.type == Thing.Type.Function) {
      interp.getMachine().pushFileName(instance.clazz.sourceFileName);
      boolean error = false;
      try {
        ret = interp.invokeFunction((Thing.Function) f, params, instance.symbols);
      } catch (Exception ex) {
        error = true;
      } finally {
        interp.getMachine().popFileName(false);
        if (error) {
          SlippyMachine.outputStream.println("Tiny black hole created while calling function "
              + functionName);
        }
      }
    } else {
      throw new RuntimeException("No such method: " + functionName);
    }
    return ret;
  }

  public List<String> getSymbolNames() {
    List<String> ret = new ArrayList<String>();
    ret.addAll(instance.symbols.symbols.keySet());
    return ret;
  }
}
