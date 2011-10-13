package org.six11.sf;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;

import org.six11.util.Debug;
import org.six11.util.pen.PenEvent;
import org.six11.util.pen.PenListener;
import org.six11.util.pen.Pt;

import static org.six11.util.Debug.bug;
import static org.six11.util.Debug.warn;
import static org.six11.util.Debug.num;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class GlassPane extends JComponent implements MouseMotionListener, MouseListener {

  SkruiFabEditor editor;
  Component prevComponent;
  Component dragStartComponent;
  Component dragEndComponent;

  boolean dragging = false;
  Point dragPoint = null;
  private Collection<GestureListener> gestureListeners;

  public GlassPane(SkruiFabEditor editor) {
    this.editor = editor;
    gestureListeners = new ArrayList<GestureListener>();
    addMouseListener(this);
    addMouseMotionListener(this);
    setOpaque(false);
  }

  public void addGestureListener(GestureListener lis) {
    if (!gestureListeners.contains(lis)) {
      gestureListeners.add(lis);
    }
  }

  public Component getDragEndComponent() {
    return dragEndComponent;
  }

  private class MouseEventInfo {
    Point glassPanePoint;
    Container container;
    Point containerPoint;
    Component component;
    Point componentPoint;

    MouseEventInfo(MouseEvent ev) {
      glassPanePoint = ev.getPoint();
      container = editor.getContentPane();
      containerPoint = SwingUtilities.convertPoint(GlassPane.this, glassPanePoint, container);
      component = SwingUtilities.getDeepestComponentAt(container, containerPoint.x,
          containerPoint.y);
      componentPoint = null;
      if (component != null) {
        componentPoint = SwingUtilities.convertPoint(GlassPane.this, glassPanePoint, component);
      }
    }
  }

  private void givePenEvent(Component component, PenEvent ev) {
    if (component instanceof PenListener) {
      ((PenListener) component).handlePenEvent(ev);
    } else if (component != null) {
      warn(this, "Component not a pen listener: " + component.toString());
    }
  }

  void fire(GestureEvent ev) {
    for (GestureListener lis : gestureListeners) {
      switch (ev.getType()) {
        case Start:
          lis.gestureStart(ev);
          break;
        case Progress:
          lis.gestureProgress(ev);
          break;
        case End:
          lis.gestureComplete(ev);
          break;
      }
    }
  }

  private void giveTo(Component component, MouseEvent ev, Point componentPoint) {
    component.dispatchEvent(new MouseEvent(component, ev.getID(), ev.getWhen(), ev.getModifiers(),
        componentPoint.x, componentPoint.y, ev.getClickCount(), ev.isPopupTrigger()));
  }

  public void paintComponent(Graphics g) {
    if (dragging && dragPoint != null) {
      SketchBook mod = editor.getModel();
      Gesture gest;
      if ((gest = mod.getGestures().getGesture()) != null) {
        if (gest.drawThumbOnDrag && gest.thumb != null) {
          g.setClip(new Rectangle(dragPoint, new Dimension(gest.thumb.getWidth(null), gest.thumb
              .getHeight(null))));
          g.drawImage(gest.thumb, dragPoint.x, dragPoint.y, null);
          editor.getContentPane().repaint();
        }
      }
    }
  }

  public void mouseDragged(MouseEvent ev) {
    dragPoint = ev.getPoint();
    SketchBook mod = editor.getModel();
    MouseEventInfo mei = new MouseEventInfo(ev);
    if (prevComponent != mei.component) {
      if (prevComponent != null) {
        givePenEvent(prevComponent, PenEvent.buildExitEvent(this, ev));
      }
      if (mei.component != null) {
        givePenEvent(mei.component, PenEvent.buildEnterEvent(this, ev));
      }
    }
    prevComponent = mei.component;
    if (mod.getGestures().hasActualGesture()) {
      Gesture gesture = mod.getGestures().getGesture();
      mod.getGestures().restartGestureTimer();
      GestureEvent gprog = GestureEvent.buildProgressEvent(this, mei.component, mei.componentPoint,
          gesture);
      fire(gprog);
    } else {
      Pt pt = new Pt(mei.componentPoint, ev.getWhen());
      givePenEvent(mei.component, PenEvent.buildDragEvent(this, pt, null, 0, null, ev));
    }
    if (dragging && dragPoint != null && mod.getGestures().getGesture() != null) {
      repaint();
    }
  }

  public void mouseMoved(MouseEvent ev) {
    MouseEventInfo mei = new MouseEventInfo(ev);
    SketchBook mod = editor.getModel();
    if (prevComponent != mei.component) {
      if (prevComponent != null) {
        givePenEvent(prevComponent, PenEvent.buildExitEvent(this, ev));
      }
      if (mei.component != null) {
        givePenEvent(mei.component, PenEvent.buildEnterEvent(this, ev));
      }
    }
    prevComponent = mei.component;
    if (mod.getGestures().hasActualGesture()) {

    } else {
      Pt translated = new Pt(ev);
      translated.setLocation(mei.componentPoint.getX(), mei.componentPoint.getY());
      givePenEvent(mei.component, PenEvent.buildHoverEvent(this, translated));
    }
  }

  /**
   * This will never be implemented, because a click is mouse-centric.
   */
  public void mouseClicked(MouseEvent ev) {
    //    give(ev);
  }

  public void mouseEntered(MouseEvent ev) {
    // This means the mouse entered the glass pane---it is somewhere over the app, but if you want more info you have to look
    SketchBook mod = editor.getModel();
    MouseEventInfo mei = new MouseEventInfo(ev);
    if (mod.getGestures().hasActualGesture()) {
      // TODO: need to notify target component by firing gesture event
    } else {
      givePenEvent(mei.component, PenEvent.buildEnterEvent(this, ev));
    }
  }

  public void mouseExited(MouseEvent ev) {
    // This means the mouse exited the glass pane---it is somewhere over the app, but if you want more info you have to look
    SketchBook mod = editor.getModel();
    MouseEventInfo mei = new MouseEventInfo(ev);
    if (mod.getGestures().hasActualGesture()) {
      // TODO: need to notify target component by firing gesture event
    } else {
      givePenEvent(mei.component, PenEvent.buildExitEvent(this, ev));
    }
  }

  public void mousePressed(MouseEvent ev) {
    MouseEventInfo mei = new MouseEventInfo(ev);
    SketchBook mod = editor.getModel();
    GestureController gests = mod.getGestures();
    gests.reportState("Mouse Press");
    Gesture pot = gests.getPotentialGesture();
    dragging = true;
    dragPoint = ev.getPoint();
    if (mei.componentPoint == null) {
      bug("mei.componentPoint is null");
    }
    if (pot != null && pot.isPointNearHotspot(new Pt(mei.componentPoint, ev.getWhen()))) {
      // enter gesture ON mode
      pot.setActualGesture(true);
      Gesture gest = gests.getPotentialGesture().createSubsequentGesture(mei.component,
          mei.componentPoint);
      gests.setGesture(gest);
      GestureEvent gestStart = GestureEvent.buildStartEvent(this, mei.component,
          mei.componentPoint, gest);
      fire(gestStart);
    } else {
      if (pot != null) {
        gests.revertPotentialGesture();
        gests.clearGestureTimer();
        gests.clearPotentialGesture();
      }
      // now give it to component if we can.
      givePenEvent(mei.component,
          PenEvent.buildDownEvent(this, new Pt(mei.componentPoint, ev.getWhen()), ev));
    }
    dragStartComponent = mei.component;
  }

  public void mouseReleased(MouseEvent ev) {
    dragPoint = null;
    MouseEventInfo mei = new MouseEventInfo(ev);
    SketchBook mod = editor.getModel();
    if (mod.getGestures().hasActualGesture()) {
      Gesture gest = mod.getGestures().getGesture();
      mod.getGestures().restartGestureTimer();
      GestureEvent gestEnd = GestureEvent.buildEndEvent(this, mei.component, mei.componentPoint,
          gest);
      fire(gestEnd);
      mod.getGestures().clearGesture();
    } else {
      givePenEvent(mei.component, PenEvent.buildIdleEvent(this, ev));
    }
    dragging = false; // drag completed.
    dragStartComponent = null;
  }

  //  private void oldGive(MouseEvent ev) {
  //    Point glassPanePoint = ev.getPoint();
  //    Container container = editor.getContentPane();
  //    Point containerPoint = SwingUtilities.convertPoint(this, glassPanePoint, container);
  //    Component component = SwingUtilities.getDeepestComponentAt(container, containerPoint.x,
  //        containerPoint.y);
  //    if (ev.getID() == MouseEvent.MOUSE_RELEASED) {
  //      dragEndComponent = component;
  //    }
  //
  //    // handle exit, then enter
  //    if (prevComponent != null && prevComponent != component) {
  //      Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, prevComponent);
  //      MouseEvent exitEvent = new MouseEvent(prevComponent, MouseEvent.MOUSE_EXITED, ev.getWhen(),
  //          ev.getModifiers(), componentPoint.x, componentPoint.y, ev.getClickCount(),
  //          ev.isPopupTrigger());
  //      prevComponent.dispatchEvent(exitEvent);
  //    }
  //
  //    if (component != null && prevComponent != component) {
  //      Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, component);
  //      MouseEvent enterEvent = new MouseEvent(component, MouseEvent.MOUSE_ENTERED, ev.getWhen(),
  //          ev.getModifiers(), componentPoint.x, componentPoint.y, ev.getClickCount(),
  //          ev.isPopupTrigger());
  //      component.dispatchEvent(enterEvent);
  //    }
  //
  //    // handle gesture
  //    if (dragging && ev.getID() == MouseEvent.MOUSE_DRAGGED
  //        && editor.getModel().getGestures().isGesturing()) {
  //      // give to whichever component the mouse is over, or previous component if out of bounds
  //      if (component != null) {
  //        Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, component);
  //        giveTo(component, ev, componentPoint);
  //      } else if (prevComponent != null) {
  //        Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, prevComponent);
  //        giveTo(prevComponent, ev, componentPoint);
  //      }
  //    }
  //
  //    // handle non-gesture dragging
  //    else if (dragging && ev.getID() == MouseEvent.MOUSE_DRAGGED) {
  //      Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, dragStartComponent);
  //      giveTo(dragStartComponent, ev, componentPoint);
  //    }
  //
  //    // handle non-drag
  //    else {
  //      GestureEvent gcev = null;
  //      // up/down, hover
  //      // when a gesture ends, tell the originating component there has been a mouse up.
  //      if (dragStartComponent != null && ev.getID() == MouseEvent.MOUSE_RELEASED
  //          && editor.getModel().getGestures().isGesturing()) {
  //        Point startComponentPoint = SwingUtilities.convertPoint(this, glassPanePoint,
  //            dragStartComponent);
  //        Point dropComponentPoint = SwingUtilities.convertPoint(this, glassPanePoint, component);
  //        giveTo(dragStartComponent, ev, startComponentPoint);
  //        // commented out because it doesn't compile
  //        //        gcev = new GestureEvent(this, dragStartComponent, component, dropComponentPoint, editor
  //        //            .getModel().getGestures().getPotentialGesture());
  //      }
  //      if (component != null) {
  //        Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, component);
  //        giveTo(component, ev, componentPoint);
  //      }
  //      if (gcev != null) {
  //        fire(gcev);
  //      }
  //    }
  //
  //    prevComponent = component;
  //  }

}