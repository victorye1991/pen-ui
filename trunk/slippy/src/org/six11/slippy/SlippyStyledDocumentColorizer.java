package org.six11.slippy;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.six11.util.gui.Colors;

/**
 * A Slippy syntax highlighter for StyledDocument objects in Java.
 *
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyStyledDocumentColorizer {

  private Map<String, AttributeSet> styles;

  enum FontStyle {
    plain, italic, bold, both
  }
  
  public SlippyStyledDocumentColorizer() {
    styles = new HashMap<String, AttributeSet>();
    styles.put("function name", mkStyle("#600", null, FontStyle.plain));
    styles.put("assign lval", mkStyle("#390", null, FontStyle.plain));
    styles.put("member lval", mkStyle("#003", null, FontStyle.plain));
    styles.put("constructor name", mkStyle("#660", null, FontStyle.plain));
    styles.put("class name", mkStyle("#660", null, FontStyle.bold));
    styles.put("extends class name", mkStyle("#660", null, FontStyle.plain));
    styles.put("formal param", mkStyle("#60c", null, FontStyle.italic));
    styles.put("class def name", mkStyle("#606", null, FontStyle.both));
    styles.put("function def name", mkStyle("#606", null, FontStyle.both));
    styles.put("field declaration", mkStyle("#606", null, FontStyle.both));
    styles.put("plain", mkStyle("#000", null, FontStyle.plain));

    // token types
    styles.put("COMMA", mkStyle("#300", null, FontStyle.plain));
    styles.put("MINUS", mkStyle("#060", null, FontStyle.plain));
    styles.put("HASH", mkStyle("#060", null, FontStyle.plain));
    styles.put("PERCENT", mkStyle("#060", null, FontStyle.plain));
    styles.put("LPAR", mkStyle("#300", null, FontStyle.plain));
    styles.put("MIXES", mkStyle("#000", null, FontStyle.plain));
    styles.put("FALSE", mkStyle("#000", null, FontStyle.plain));
    styles.put("DONE", mkStyle("#000", null, FontStyle.plain));
    styles.put("IMPORT", mkStyle("#000", null, FontStyle.plain));
    styles.put("OR", mkStyle("#20f", null, FontStyle.plain));
    styles.put("DOT", mkStyle("#000", null, FontStyle.bold));
    styles.put("AND", mkStyle("#20f", null, FontStyle.plain));
    styles.put("STR_LITERAL", mkStyle("#c60", null, FontStyle.italic));
    styles.put("PLUS", mkStyle("#060", null, FontStyle.plain));
    styles.put("EXTENDS", mkStyle("#000", null, FontStyle.plain));
    styles.put("ID", mkStyle("#000", null, FontStyle.italic));
    styles.put("NEQ", mkStyle("#060", null, FontStyle.plain));
    styles.put("LCB", mkStyle("#300", null, FontStyle.plain));
    styles.put("RPAR", mkStyle("#300", null, FontStyle.plain));
    styles.put("RCB", mkStyle("#300", null, FontStyle.plain));
    styles.put("WHILE", mkStyle("#000", null, FontStyle.plain));
    styles.put("LSB", mkStyle("#300", null, FontStyle.plain));
    styles.put("NEW", mkStyle("#20f", null, FontStyle.plain));
    styles.put("EQ", mkStyle("#060", null, FontStyle.plain));
    styles.put("LOOP", mkStyle("#20f", null, FontStyle.plain));
    styles.put("LT", mkStyle("#060", null, FontStyle.plain));
    styles.put("GT", mkStyle("#060", null, FontStyle.plain));
    styles.put("LINE_COMMENT", mkStyle("#999", null, FontStyle.italic));
    styles.put("GTEQ", mkStyle("#060", null, FontStyle.plain));
    styles.put("EQEQ", mkStyle("#060", null, FontStyle.plain));
    styles.put("LAMBDA", mkStyle("#20f", null, FontStyle.plain));
    styles.put("CLASS", mkStyle("#20f", null, FontStyle.plain));
    styles.put("DEFINE", mkStyle("#20f", null, FontStyle.plain));
    styles.put("ELSE", mkStyle("#20f", null, FontStyle.plain));
    styles.put("IF", mkStyle("#20f", null, FontStyle.plain));
    styles.put("LTEQ", mkStyle("#060", null, FontStyle.plain));
    styles.put("CODESET", mkStyle("#000", null, FontStyle.bold));
    styles.put("NUM", mkStyle("#000", null, FontStyle.plain));
    styles.put("ASTERISK", mkStyle("#060", null, FontStyle.plain));
    styles.put("COLON", mkStyle("#c00", null, FontStyle.bold));
    styles.put("RSB", mkStyle("#300", null, FontStyle.plain));
    styles.put("NOT", mkStyle("#20f", null, FontStyle.plain));
    styles.put("TRUE", mkStyle("#000", null, FontStyle.plain));
  }

  public AttributeSet mkStyle(String textColorStr, String bgColorStr, FontStyle font) {
    SimpleAttributeSet aset = new SimpleAttributeSet();
    if (textColorStr != null) {
      Color c = Colors.decodeHtmlHexTriplet(textColorStr);
      StyleConstants.setForeground(aset, c);
    }
    if (bgColorStr != null) {
      Color c = Colors.decodeHtmlHexTriplet(bgColorStr);
      StyleConstants.setBackground(aset, c);
    }
    if (font == FontStyle.bold || font == FontStyle.both) {
      StyleConstants.setBold(aset, true);
    }
    if (font == FontStyle.italic || font == FontStyle.both) {
      StyleConstants.setItalic(aset, true);
    }
    
    return aset;
  }

  @SuppressWarnings("unchecked")
  public void walk(StyledDocument document) throws Exception {
    int len = document.getLength();
    String programString = document.getText(0, document.getLength());
    CharStream cs = new ANTLRStringStream(programString);
    SlippySyntaxLexer myLexer = new SlippySyntaxLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(myLexer);
    SlippySyntaxParser myParser = new SlippySyntaxParser(tokens);
    CommonTree root = (CommonTree) myParser.prog().getTree();
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
    nodes.setTokenStream(tokens);
    SlippySyntaxWalker walker = new SlippySyntaxWalker(nodes);
    walker.prog();
    List<CommonToken> toks = (List<CommonToken>) tokens.getTokens();
    Map<Integer, String> tokenTypes = new HashMap<Integer, String>();
    Set<Map.Entry<CommonTree, String>> entries = walker.specialThings.entrySet();
    for (Map.Entry<CommonTree, String> en : entries) {
      int start = en.getKey().getTokenStartIndex();
      int end = en.getKey().getTokenStopIndex();
      for (int i = start; i <= end; i++) {
        tokenTypes.put(i, en.getValue());
      }
    }
    
    document.setCharacterAttributes(0, len, styles.get("plain"), true);
    AttributeSet aset;
    int charIdx = 0;
    for (int i = 0; i < toks.size(); i++) {
      CommonToken t = toks.get(i);
      if (tokenTypes.containsKey(i)) {
        aset = styles.get(tokenTypes.get(i));
        if (aset != null) {
          document.setCharacterAttributes(charIdx, t.getText().length(), aset, true);
        }
      } else {
        String tokenName = SlippySyntaxWalker.tokenNames[t.getType()];
        aset = styles.get(tokenName);
        if (aset != null) {
          document.setCharacterAttributes(charIdx, t.getText().length(), aset, true);
        }
      }
      charIdx = charIdx + t.getText().length();
    }
  }

  public static void bug(String what) {
    System.out.println(what);
  }
}
