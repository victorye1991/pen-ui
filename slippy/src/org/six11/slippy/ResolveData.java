package org.six11.slippy;

/**
 * I would really love tuples in Java.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class ResolveData {
  private Thing thing;
  public SymbolTable table;
  public boolean valid;
  public String error;
  private Thing deref;

  public ResolveData(Thing thing, SymbolTable table) {
    this.thing = thing;
    this.table = table;
    this.valid = (table != null);
    this.error = null;
  }

  /**
   * 
   */
  public ResolveData() {
    this(Thing.NIL, null);
  }

  public String toString() {
    return thing.toString() + "(" + (table == null ? "No table" : "In: " + table.getName()) + ")";
  }
  
  public boolean containsTable(SymbolTable other) {
    boolean ret = false;
    SymbolTable cursor = table;
    while (cursor != null) {
      ret = (cursor == other);
      if (ret) {
        break;
      }
      cursor = cursor.parent;
    }
    return ret;
  }
  
  public Thing getThing() {
    return thing;
  }

  public Thing getDeref() {
    if (deref == null ) {
      deref = SlippyUtils.dereference(thing);
    }
    return deref;
  }
}
