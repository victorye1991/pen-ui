package org.six11.olive;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JComponent;

import org.six11.util.Debug;
import org.six11.util.gui.ApplicationFrame;
import org.six11.util.gui.BoundingBox;
import org.six11.util.gui.Components;
import org.six11.util.gui.Strokes;
import org.six11.util.io.HttpUtil;

/**
 * A simple thumbnail of a sketch. It will trim whitespace and shrink (or expand) the image to fit
 * into a square (e.g. a 64x64 pixel square).
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SketchThumbnail extends JComponent {

  // this is the non-scaled value. on-screen strokes will most likely be thinner than this.
  private static final float DEFAULT_STROKE_THICKNESS = 5.0f;
  private static final float PAD = 2.0f;
  private static final Color DEFAULT_COLOR = Color.BLACK;

  public static void main(String[] args) throws IOException {
    Debug.useColor = false;
    if (args.length > 0) {
      String url = args[0];
      String size = "100";
      if (args.length > 1) {
        size = args[1];
      }
      ApplicationFrame af = new ApplicationFrame("Sketch from " + args[0] + " (" + size + "x"
          + size + ")");
      HttpUtil web = new HttpUtil();
      String sketchString = web.downloadUrlToString(url);
      SketchThumbnail thumb = new SketchThumbnail(sketchString, Integer.parseInt(size), "id?");
      af.add(thumb);
      af.pack();
      af.center();
      af.setVisible(true);
    } else {
      bug("usage: java org.six11.olive.SketchThumbnail sketch-url [thumbsize]");
    }
  }

  private static void bug(String what) {
    Debug.out("SketchThumbnail", what);
  }

  private BufferedImage img;
  private Color color = DEFAULT_COLOR;
  private float strokeThickness = DEFAULT_STROKE_THICKNESS;
  private String id;
  private boolean over = false;

  /**
   * Create a new thumbnail. The sketchString contains pen_down, pen_move, and pen_up statements
   * that specify pen movement. The size indicates how big the resulting thumbnail will be. The id
   * is a short unique identifier such as "1234.sketch".
   */
  public SketchThumbnail(String sketchString, int size, String id) {
    this.setId(id);
    StringTokenizer lines = new StringTokenizer(sketchString, "\n");
    List<Shape> shapes = new ArrayList<Shape>();
    GeneralPath seq = new GeneralPath();
    BoundingBox bb = new BoundingBox();
    while (lines.hasMoreTokens()) {
      String line = lines.nextToken();
      if (line.startsWith("pen_up")) {
        seq = new GeneralPath();
      } else if (line.startsWith("pen_move") || line.startsWith("pen_down")) {
        StringTokenizer lineToks = new StringTokenizer(line);
        String op = lineToks.nextToken();
        float x = Float.parseFloat(lineToks.nextToken());
        float y = Float.parseFloat(lineToks.nextToken());
        if (op.equals("pen_down")) {
          seq.moveTo(x, y);
        } else {
          seq.lineTo(x, y);
        }
        bb.add(new Point2D.Float(x, y));
        if (op.equals("pen_down")) {
          shapes.add(seq);
        }
      }
    }
    double desiredWidth = bb.getWidth() + strokeThickness + PAD;
    double desiredHeight = bb.getHeight() + strokeThickness + PAD;
    double scale = ((double) size) / Math.max(desiredWidth, desiredHeight);
    img = new BufferedImage((int) (scale * desiredWidth), (int) (desiredHeight * scale),
        BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = (Graphics2D) img.getGraphics();
    Components.antialias(g);
    g.setColor(color);
    g.scale(scale, scale);
    g.translate(-bb.getX() + (strokeThickness / 2.0f) + (PAD / 2.0f), -bb.getY()
        + (strokeThickness / 2.0f) + (PAD / 2.0f));
    g.setStroke(Strokes.get(strokeThickness));
    for (Shape s : shapes) {
      g.draw(s);
    }
    setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
    addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent e) {
        over = true;
        repaint();
      }

      public void mouseExited(MouseEvent e) {
       over = false;
       repaint();
      }
    });
  }

  public void paintComponent(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    if (over) {
      g.setColor(Color.DARK_GRAY);
      g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
    }
    g.drawImage(img, 0, 0, null);
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public float getStrokeThickness() {
    return strokeThickness;
  }

  public void setStrokeThickness(float strokeThickness) {
    this.strokeThickness = strokeThickness;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
