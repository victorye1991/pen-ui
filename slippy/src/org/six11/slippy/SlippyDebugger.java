package org.six11.slippy;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyDebugger {
  public static void main(String[] args) throws Exception {

    CharStream cs = new ANTLRFileStream(args[0]);
    SlippyLexer flatLexer = new SlippyLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(flatLexer);
    SlippyParser flatParser = new SlippyParser(tokens);

    SlippyParser.prog_return r = flatParser.prog();
    CommonTree root = ((CommonTree) r.tree);

    CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
    nodes.setTokenStream(tokens);

    processTree(root, 1);
  }

  public static Map<Integer, String> spaceMap = new HashMap<Integer, String>();

  public static String spaces(int n) {
    if (!spaceMap.containsKey(n)) {
      StringBuffer buf = new StringBuffer();
      for (int i = 0; i < n; i++) {
        buf.append(" ");
      }
      spaceMap.put(n, buf.toString());
    }
    return spaceMap.get(n);
  }

  public static String bug(Tree t, boolean bugChildrenTypes) {
    String childString = "" + t.getChildCount();

    if (bugChildrenTypes) {
      childString = "[";
      for (int i = 0; i < t.getChildCount(); i++) {
        childString += t.getChild(i).getText();
        if (i < (t.getChildCount() - 1)) {
          childString += ", ";
        }
      }
      childString += "]";
    }

    return t.getText() + " line: " + t.getLine() + ", " + "col: " + t.getCharPositionInLine()
        + " type: " + SlippyParser.tokenNames[t.getType()] + " children: " + childString;
  }

  public static void processTree(Tree t, int indent) {

    System.out.println(spaces(3* indent) + bug(t, true));

    for (int i = 0; i < t.getChildCount(); i++) {
      processTree(t.getChild(i), indent + 1);
    }
  }
}
