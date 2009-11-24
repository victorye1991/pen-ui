package org.six11.olive;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

import org.six11.util.Debug;
import org.six11.util.pen.MouseThing;

/**
 * A mouse motion and click adapter that sends events to an OliveSoup instance. It an also perform
 * simulated events (e.g. to open a sketch).
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class OliveMouseThing extends MouseThing {

  private OliveSoup soup;

  public OliveMouseThing(OliveSoup soup) {
    this.soup = soup;
  }

  public void mousePressed(MouseEvent ev) {
    soup.addRawInputBegin(ev.getX(), ev.getY(), ev.getWhen());
  }

  public void mouseDragged(MouseEvent ev) {
    soup.addRawInputProgress(ev.getX(), ev.getY(), ev.getWhen());
  }

  public void mouseReleased(MouseEvent ev) {
    soup.addRawInputEnd();
  }

  @SuppressWarnings("unused")
  private void bug(final String what) {
    Debug.out("OliveMouseThing", what);
  }

  /**
   * Simulates the actions taken when the user draws. The parameter is a string indicating when the
   * user presses the pen, moves it, or lifts up. Here is a simple example:
   * 
   * <pre>
   * pen_down 305 297 1244073306220
   * pen_move 305 297 1244073306229
   * pen_move 308 291 1244073306244
   * pen_move 312 284 1244073306260
   * pen_move 318 276 1244073306277
   * pen_up
   * </pre>
   * 
   * pen_down and pen_move lines are followed by x, y, and t coordinates; pen_up lines have no
   * additional information. It is expected the pen_move events are entirely between pen_up and and
   * pen_down events.
   */
  public void simulateUserInput(String sketchString, Component repaintMe) {
    StringTokenizer tokens = new StringTokenizer(sketchString, "\n");
    while (tokens.hasMoreTokens()) {
      String line = tokens.nextToken();
      if (line.startsWith("pen_up")) {
        soup.addRawInputEnd();
      } else if (line.startsWith("pen_down")) {
        StringTokenizer lineToks = new StringTokenizer(line);
        lineToks.nextToken(); // throw away
        int x = Integer.parseInt(lineToks.nextToken());
        int y = Integer.parseInt(lineToks.nextToken());
        long t = Long.parseLong(lineToks.nextToken());
        soup.addRawInputBegin(x, y, t);
      } else if (line.startsWith("pen_move")) {
        StringTokenizer lineToks = new StringTokenizer(line);
        lineToks.nextToken(); // throw away
        int x = Integer.parseInt(lineToks.nextToken());
        int y = Integer.parseInt(lineToks.nextToken());
        long t = Long.parseLong(lineToks.nextToken());
        soup.addRawInputProgress(x, y, t);
      }
      if (repaintMe != null) {
        repaintMe.repaint();
      }
    }
  }
}
