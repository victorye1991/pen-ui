package org.six11.olive;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.six11.util.Debug;
import org.six11.util.gui.ApplicationFrame;
import org.six11.util.io.HttpUtil;
import org.six11.util.lev.NamedAction;

/**
 * This shows a grid of sketch thumbnails. There are two buttons (prev and next) that lets the user
 * page through the server's supply of possible sketches. Double clicking on any sketch will trigger
 * an ActionEvent that any registered ActionListeners will receive. The action event's "source"
 * object is the SketchThumbnail instance in question.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SketchThumbnailBrowser extends JPanel {

//  public static void main(String[] args) {
//    Debug.useColor = false;
//
//    if (args.length != 0) {
//      String url = args[0];
//      String limitStr = args.length > 1 ? args[1] : "10";
//      String startIDStr = args.length > 2 ? args[2] : "0";
//      ApplicationFrame af = new ApplicationFrame("SketchThumbnailBrowser Demo");
//      SketchThumbnailBrowser browser = new SketchThumbnailBrowser();
//      browser.setBaseURL(url);
//      browser.setLimit(Integer.parseInt(limitStr));
//      browser.setVisibleRange(Integer.parseInt(startIDStr), Integer.parseInt(startIDStr));
//      browser.fetch();
//      browser.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent ev) {
//          System.out.println("Yay. Open sketch " + ((SketchThumbnail) ev.getSource()).getId());
//        }
//      });
//      af.add(browser);
//      af.pack();
//      af.center();
//      af.setVisible(true);
//    } else {
//      System.out.println("Usage: org.six11.olive.SketchThumbnailBrowser url [limit [startID]]");
//    }
//  }
//
//  private String baseUrl;
//  private int limit;
//  private int startId; // the smallest id of sketches currently (or pending) in view
//  private int endId; // the largest id of sketches currently in view.
//  private int cursor; // used to request where the next fetch should begin.
//  private boolean atEnd;
//  private Runnable fetcher;
//  private JPanel top;
//  private JButton nextButton;
//  private JButton prevButton;
//  private JLabel whereLabel;
//  private JPanel sketchGrid;
//  private Map<String, String> sketchSources; // maps id to sketch source code strings
//  private MouseAdapter clicker;
//  private Set<ActionListener> actionListeners; // listens for selection events.
//  private int thumbSize = 64;
//  private int numCols = 6;
//  private int numVisibleThumbs = 0;
//
//  /**
//   * Makes a new thumbnail browser using default values for start/limit/thumbSize.
//   */
//  public SketchThumbnailBrowser() {
//    clicker = new MouseAdapter() {
//      public void mouseClicked(MouseEvent e) {
//        if (e.getClickCount() == 2 && e.getSource() instanceof SketchThumbnail) {
//          SketchThumbnail t = (SketchThumbnail) e.getSource();
//          select(t);
//        }
//      }
//    };
//    NamedAction prevAction = new NamedAction("< Prev") {
//      public void activate() {
//        fetchPrev();
//      }
//    };
//    NamedAction nextAction = new NamedAction("Next >") {
//      public void activate() {
//        fetchNext();
//      }
//    };
//    fetcher = new Fetcher();
//    top = new JPanel();
//    top.setLayout(new BorderLayout());
//    top.setPreferredSize(new Dimension(200, 40));
//    prevButton = new JButton(prevAction);
//    nextButton = new JButton(nextAction);
//    top.add(prevButton, BorderLayout.WEST);
//    top.add(nextButton, BorderLayout.EAST);
//    whereLabel = new JLabel();
//    whereLabel.setFont(new Font("Dialog", Font.BOLD, 12));
//    whereLabel.setHorizontalAlignment(JLabel.CENTER);
//    top.add(whereLabel, BorderLayout.CENTER);
//    sketchGrid = new JPanel();
//    sketchGrid.setLayout(new GridLayout(0, numCols));
//    setLayout(new BorderLayout());
//    add(top, BorderLayout.NORTH);
//    add(sketchGrid, BorderLayout.SOUTH);
//  }
//
//  /**
//   * Allocates enough space for the button bar at top and the tightly packed sketch grid.
//   */
//  public Dimension getPreferredSize() {
//
//    GridLayout gl = (GridLayout) sketchGrid.getLayout();
//    int w = gl.getColumns() * thumbSize;
//    int rows;
//    if (numVisibleThumbs == 0) {
//      rows = limit / gl.getColumns() + (limit % gl.getColumns() > 0 ? 1 : 0);
//    } else {
//      rows = numVisibleThumbs / gl.getColumns() + (numVisibleThumbs % gl.getColumns() > 0 ? 1 : 0);
//    }
//    int h = (rows * thumbSize) + top.getPreferredSize().height;
//    return new Dimension(w, h);
//  }
//
//  private void select(SketchThumbnail t) {
//    ActionEvent ev = new ActionEvent(t, 0, "select thumbnail");
//    if (actionListeners != null) {
//      for (ActionListener al : actionListeners) {
//        al.actionPerformed(ev);
//      }
//    }
//  }
//
//  public void addActionListener(ActionListener al) {
//    if (actionListeners == null) {
//      actionListeners = new HashSet<ActionListener>();
//    }
//    actionListeners.add(al);
//  }
//
//  public void removeActionListener(ActionListener al) {
//    if (actionListeners != null) {
//      actionListeners.remove(al);
//    }
//  }
//
//  /**
//   * Provides a cache for sketches.
//   */
//  public void setSources(Map<String, String> sources) {
//    sketchSources = sources;
//  }
//
//  /**
//   * This is the workhorse for fetching data from the server, creating (or getting cached versions)
//   * of thumbnails, and (re)populating the sketch grid. This should be done in a non-AWT thread
//   * unless you like flickering screens.
//   */
//  private class Fetcher implements Runnable {
//    public void run() {
//      try {
//        String url = baseUrl + "?start=" + cursor + "&limit=" + limit;
//        HttpUtil web = new HttpUtil();
//        String idList = web.downloadUrlToString(url);
//        StringTokenizer toks = new StringTokenizer(idList + "\n");
//        int minId = Integer.MAX_VALUE;
//        int maxId = Integer.MIN_VALUE;
//        List<SketchThumbnail> thumbs = new ArrayList<SketchThumbnail>();
//        while (toks.hasMoreTokens()) {
//          String id = toks.nextToken();
//          minId = Math.min(minId, Integer.parseInt(id));
//          maxId = Math.max(maxId, Integer.parseInt(id));
//          SketchThumbnail thumb = getThumb(id);
//          thumbs.add(thumb);
//        }
//        numVisibleThumbs = thumbs.size();
//        if (!thumbs.isEmpty()) {
//          sketchGrid.removeAll();
//          sketchGrid.revalidate();
//          for (SketchThumbnail t : thumbs) {
//            sketchGrid.add(t);
//          }
//          setVisibleRange(minId, maxId);
//          sketchGrid.revalidate();
//          sketchGrid.repaint();
//        }
//        setAtEnd(atEnd = thumbs.size() < limit);
//      } catch (IOException ex) {
//        ex.printStackTrace();
//      }
//    }
//
//  }
//
//  @SuppressWarnings("unused")
//  private static void bug(String what) {
//    Debug.out("SketchThumbnailBrowser", what);
//  }
//
//  /**
//   * Produces a SketchThumbnail for the given id, possibly taken from a cache if one is present.
//   */
//  public SketchThumbnail getThumb(String id) throws IOException {
//    String sketchSource = null;
//    if (sketchSources == null || !sketchSources.containsKey(id)) {
//      String sketchSourceUrl = baseUrl + id + ".sketch";
//      HttpUtil web = new HttpUtil();
//      sketchSource = web.downloadUrlToString(sketchSourceUrl);
//    } else {
//      sketchSource = sketchSources.get(id);
//      if (sketchSources != null) {
//        sketchSources.put(id, sketchSource);
//      }
//    }
//    SketchThumbnail thumb = new SketchThumbnail(sketchSource, thumbSize, id);
//    thumb.addMouseListener(clicker);
//    return thumb;
//  }
//
//  /**
//   * Sets the desired size of the (square-shaped) thumbnails.
//   */
//  public void setThumbSize(int s) {
//    thumbSize = s;
//  }
//
//  private void setVisibleRange(int s, int e) {
//    startId = s;
//    endId = e;
//    whackLabel();
//  }
//
//  private void setAtEnd(boolean e) {
//    atEnd = e;
//    whackLabel();
//  }
//
//  private void whackLabel() {
//    whereLabel.setText("Showing " + startId + " to " + endId + " " + (atEnd ? " (at end)" : ""));
//  }
//
//  public void setLimit(int lim) {
//    limit = lim;
//  }
//
//  public void setBaseURL(String url) {
//    baseUrl = url;
//  }
//
//  /**
//   * Equivalent to clicking the 'next' button.
//   */
//  public void fetchNext() {
//    cursor = endId + 1;
//    fetch();
//  }
//
//  /**
//   * Equivalent to clicking the 'prev' button.
//   */
//  public void fetchPrev() {
//    cursor = Math.max(0, startId - limit);
//    fetch();
//  }
//
//  /**
//   * Forces the display to download sketch source based on the current cursor and limit and
//   * displaying them if possible. This will update the start/end values as well.
//   */
//  public void fetch() {
//    new Thread(fetcher).start();
//  }
//
//  public int getNumCols() {
//    return numCols;
//  }
//
//  public void setNumCols(int numCols) {
//    this.numCols = numCols;
//  }
//
//  public int getThumbSize() {
//    return thumbSize;
//  }
}
