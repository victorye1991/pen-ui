package org.six11.slippy;

import java.util.List;

/**
 * 
 *
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public abstract class MessageBus {

  public abstract void relay(List<Thing> paramValues, SymbolTable context);

}
