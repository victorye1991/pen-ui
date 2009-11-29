// $Id$

package org.six11.olive;

import org.six11.util.args.Arguments;
import org.six11.util.args.Arguments.ArgType;
import org.six11.util.args.Arguments.ValueType;
import org.six11.util.gui.ApplicationFrame;

public class Main {
  
  public static final String VERSION = "$Id$";
  
  public static void main(String[] in) {
    ApplicationFrame af = new ApplicationFrame("Olive");
    af.setSize(800, 600);
    af.center();

    Arguments args = new Arguments();
    args.addFlag("load-path", ArgType.ARG_REQUIRED, ValueType.VALUE_REQUIRED,
        "Specifies the root load path for Slippy code.");
    args.addFlag("help", ArgType.ARG_OPTIONAL, ValueType.VALUE_IGNORED, "Shows documentation.");
    args.addFlag("v", ArgType.ARG_OPTIONAL, ValueType.VALUE_IGNORED, "Display version.");
    args.parseArguments(in);
    if (args.hasFlag("help")) {
      System.out.println(args.getDocumentation());
      System.exit(0);
    }
    if (args.hasFlag("v")) {
      System.out.println(VERSION);
      System.exit(0);
    }
    try {
      args.validate();
    } catch (IllegalArgumentException ex) {
      System.out.println(args.getUsage());
      System.exit(-1);
    }

    String loadPath = args.hasValue("load-path") ? args.getValue("load-path") : ".";

    OliveIDE ide = new OliveIDE(false, loadPath);
    ide.init();
    af.add(ide);
    af.setVisible(true);
  }
}
