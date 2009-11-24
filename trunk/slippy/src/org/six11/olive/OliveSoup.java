package org.six11.olive;

import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

import org.six11.slippy.SlippyObject;
import org.six11.slippy.Thing;

/**
 * This is a thin wrapper for a Slippy class of the same name.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class OliveSoup {

  private SlippyObject soup;
  private List<DrawingBuffer> drawingBuffers;

  // The currentSeq and last index are for managing the currently-in-progress ink stroke
  private GeneralPath currentSeq;
  private int lastCurrentSequenceIdx;

  public OliveSoup(SlippyObject impl) {
    soup = impl;
    drawingBuffers = new ArrayList<DrawingBuffer>();
  }

  protected Thing getSlippyThing() {
    return soup.getInstance();
  }

  protected SlippyObject getSlippyObject() {
    return soup;
  }

  /**
   * Draws the portion of the current sequence that has not yet been drawn. The input parameter is
   * expected to contain variables that refer to 'Pt' instances. Each Pt instance has an x and y
   * member that can be resolved to an integer. This is an efficient implementation minimizes the
   * amount of time spent in the drawing routine. It does this by caching the index of the last
   * drawn Pt object. To reset this cache use the forgetCurrentSequence() method.
   */
  protected void drawCurrentSequence(Thing.Array arr) {
    for (int i = lastCurrentSequenceIdx; i < arr.size(); i++) {
      Thing t = arr.getSlot(i).getValue();
      if (t.type == Thing.Type.Instance) {
        Thing.Instance inst = (Thing.Instance) t;
        Thing.Num xThing = (Thing.Num) ((Thing.Variable) inst.getMember("x")).getValue();
        Thing.Num yThing = (Thing.Num) ((Thing.Variable) inst.getMember("y")).getValue();
        float x = xThing.getFloatValue();
        float y = yThing.getFloatValue();
        if (i == 0) {
          currentSeq = new GeneralPath();
          currentSeq.moveTo(x, y);
        } else {
          currentSeq.lineTo(x, y);
        }
      }
      lastCurrentSequenceIdx = i;
    }
  }

  /**
   * Erase knowledge of the currently in-progress stroke (probably because the stroke has finished
   * and is now cached as a full drawing buffer).
   */
  protected void forgetCurrentSequence() {
    lastCurrentSequenceIdx = 0;
    currentSeq = null;
  }

  /**
   * Adds a complete visual element: perhaps a raw Sequence, but it could be something else such as
   * a filled region or a rectified shape.
   */
  public void addBuffer(DrawingBuffer buf) {
    if (!drawingBuffers.contains(buf)) {
      drawingBuffers.add(buf);
    }
  }
  
  /**
   * Resets the display list by removing all elements.
   */
  public void clearBuffers() {
    drawingBuffers.clear();
  }

  /**
   * Indicates the user has pressed the pen to the surface and that a new, unfinished stroke should
   * begin. Calls 'addRawSequence' and 'addRawPoint(x,y,t)' on the underlying Slippy object.
   */
  public void addRawInputBegin(int x, int y, long t) {
    soup.call("addRawSequence");
    soup.call("addRawPoint", x, y, t);
  }

  /**
   * Indicates the user has dragged the pen and is adding ink to the current stroke. Calls
   * 'addRawPoint(x,y,t)' on the underlying Slippy object.
   */
  public void addRawInputProgress(int x, int y, long t) {
    soup.call("addRawPoint", x, y, t);
  }

  /**
   * Indicates the user has lifted the pen and the current stroke has finished. Calls
   * 'endawSequence' on the underlying Slippy object.
   */
  public void addRawInputEnd() {
    soup.call("endRawSequence");
  }
  
  /**
   * Clears all sketch data and any rectified objects based on that data.
   */
  public void clearDrawing() {
    soup.call("clearDrawing");
  }

  /**
   * Returns a reference to the currently in-progress scribble, suitable for efficient drawing.
   */
  public Shape getCurrentSequence() {
    return currentSeq;
  }

  /**
   * Returns a list of all cached drawing buffers.
   */
  public List<DrawingBuffer> getDrawingBuffers() {
    return drawingBuffers;
  }

}
