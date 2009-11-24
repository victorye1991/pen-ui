package org.six11.slippy;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by Java programs that want to dynamically load and use Slippy classes.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyObjectType {

  Thing.Clazz clazz;
  SlippyInterpreter interp;

  public SlippyObjectType(Thing in, SlippyInterpreter interp) {
    this.interp = interp;
    if (in.type != Thing.Type.Class) {
      IllegalArgumentException e = new IllegalArgumentException("SlippyObjectType constructor received Thing of type "
          + in.type);
      e.printStackTrace(SlippyMachine.outputStream);
      throw e; 
      
    }
    clazz = (Thing.Clazz) in;
  }

  public String getTypeName() {
    return clazz.name;
  }

  public String getCodeset() {
    return clazz.codeset.codesetStr;
  }

  public List<String> getSymbolNames() {
    List<String> ret = new ArrayList<String>();
    ret.addAll(clazz.symbols.symbols.keySet());
    return ret;
  }

  /**
   * Instantiates a slippy object using the given parameters which are all converted into Thing
   * objects.
   */
  public SlippyObject make(List<Object> params) {
    List<Thing> paramThings = new ArrayList<Thing>();
    for (Object p : params) {
      paramThings.add(SlippyUtils.toThing(p));
    }
    SlippyObject ret = new SlippyObject(this, paramThings, interp);
    return ret;
  }
}
