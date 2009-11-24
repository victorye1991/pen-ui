package org.six11.slippy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public abstract class SlippyJavaClass extends Thing.Clazz {

  /**
   * @param name
   * @param codeset
   */
  public SlippyJavaClass(String name, Codeset codeset, String sourceFileName,
      SlippyInterpreter interp) {
    super(name, null, sourceFileName);
    Codeset existingCS = interp.getMachine().getCodeset(codeset.codesetStr);
    if (existingCS != null) {
      this.codeset = existingCS;
    } else {
      this.codeset = codeset;
    }

    interp.getMachine().pushFileName(sourceFileName);
    interp.getMachine().addImport(sourceFileName, this);
    interp.getMachine().setCodeset(this.codeset);
    interp.getMachine().getCodeset().addClass(this);
    interp.getMachine().popFileName(true);
  }
  
  public List<String> getSymbolNames() {
    List<String> ret = new ArrayList<String>();
    ret.addAll(symbols.symbols.keySet());
    return ret;
  }

  protected void addSymbol(Function function) {
    symbols.setThing(function.name, function);
  }
  
  public String getTypeName() {
    return this.name;
  }

  public String getCodeset() {
    return this.codeset.codesetStr;
  }

}
