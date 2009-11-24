package org.six11.slippy;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyLocation {
  private String fileName;
  private String functionName;
  private int lineNumber;
  private int colNumber;

  public SlippyLocation(String fileName, String functionName, int lineNumber, int colNumber) {
    this.fileName = fileName;
    this.functionName = functionName;
    this.lineNumber = lineNumber;
    this.colNumber = colNumber;
  }

  public String getFileName() {
    return fileName;
  }

  public int getLineNumber() {
    return lineNumber;
  }

  public int getColNumber() {
    return colNumber;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  public String toString() {
    return fileName + (functionName == null ? "" : (":" + functionName)) + ":" + lineNumber + ":"
        + colNumber;
  }
}
