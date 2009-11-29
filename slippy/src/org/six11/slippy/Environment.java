package org.six11.slippy;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Represents an operating environment for the Olive IDE. This could be a web-based environment
 * where all Slippy code resides on a server, or it could be a local computer with unfettered
 * filesystem access.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public abstract class Environment {
  private String loadPath;

  /**
   * Sets the load path for finding Slippy code. The interpretation of this is
   * implementation-dependent.
   */
  public void setLoadPath(String loadPath) {
    this.loadPath = loadPath;
  }

  /**
   * Gives the load path (also implementation dependent).
   */
  public String getLoadPath() {
    return loadPath;
  }

  public abstract String loadStringFromFile(String fullFileName) throws FileNotFoundException,
      IOException;

  public abstract String getFullFileName(String className, String codesetStr);

  public abstract String classNameToFileName(String fqClass);

  public abstract void save(String fqClassName, String programString);

}
