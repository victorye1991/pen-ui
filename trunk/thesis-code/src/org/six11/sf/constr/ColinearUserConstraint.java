package org.six11.sf.constr;

import java.awt.Color;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;
import org.six11.sf.DrawingBufferLayers;
import org.six11.sf.SketchBook;
import org.six11.util.data.Lists;
import org.six11.util.pen.DrawingBuffer;
import org.six11.util.pen.DrawingBufferRoutines;
import org.six11.util.pen.Functions;
import org.six11.util.pen.Line;
import org.six11.util.pen.Pt;
import org.six11.util.pen.Vec;
import org.six11.util.solve.AngleConstraint;
import org.six11.util.solve.Constraint;
import org.six11.util.solve.ConstraintSolver;
import org.six11.util.solve.OrientationConstraint;
import org.six11.util.solve.PointOnLineConstraint;

import static org.six11.util.Debug.bug;

public class ColinearUserConstraint extends UserConstraint {

  public static final String NAME = "Colinear";

  public ColinearUserConstraint(SketchBook model, Set<Pt> points) {
    super(model, NAME, new PointOnLineConstraint(points));
  }

  public ColinearUserConstraint(SketchBook model, JSONObject ucObj) throws JSONException {
    super(model, NAME, ucObj);
  }

  @Override
  public void removeInvalid() {
    Collection<Pt> pts = getConstrainedPoints();
    ConstraintSolver cs = model.getConstraints();
    Set<Pt> doomed = new HashSet<Pt>();
    for (Pt pt : pts) {
      if (!cs.hasPoints(pt)) {
        doomed.add(pt);
      }
    }
    if (!doomed.isEmpty()) {
      bug("Removing " + doomed.size() + " points from constraint solver");
    }
    PointOnLineConstraint pol = getPOLConstraint();
    for (Pt pt : doomed) {
      cs.removePoint(pt);
      pol.remove(pt);
    }
    if (!doomed.isEmpty() && getConstrainedPoints().size() < 3) {
      bug("Colinear User Constraint no longer valid because it has "
          + getConstrainedPoints().size() + " points.");
      removeConstraint(pol);
    }
  }

  @Override
  public boolean isValid() {
    Collection<Pt> pts = getConstrainedPoints();
    boolean ret = model.getConstraints().hasPoints(pts.toArray(new Pt[0]));
    return ret;
  }

  public void draw(DrawingBuffer buf, Pt hoverPoint) {
    if (hoverPoint != null) {
      if (getPOLConstraint() == null) {
        bug("Warning: POL constraint is null.");
      } else {
        Set<Pt> pts = getConstrainedPoints();
        Pt[] anti = getAntipodes(pts);
        if (anti[0] != null && anti[1] != null) {
          Vec dir = new Vec(anti[0], anti[1]).getVectorOfMagnitude(30);
          Vec flip = dir.getFlip();
          Pt a = anti[0].getTranslated(flip);
          Pt b = anti[1].getTranslated(dir);
          Line line = new Line(a, b);
          double dist = Functions.getDistanceBetweenPointAndLine(hoverPoint, line);
          double alpha = DrawingBufferLayers.getAlpha(dist, 5, 40, 0.1);
          Color color = new Color(1, 0, 0, (float) alpha);
          DrawingBufferRoutines.line(buf, a, b, color, 1.4);
        } else {
          bug("Warning: antipodes not available. What did you do, Ray?");
        }
      }
    }
  }

  public Set<Pt> getConstrainedPoints() {
    PointOnLineConstraint pol = getPOLConstraint();
    Set<Pt> ret = new HashSet<Pt>();
    ret.addAll(Lists.makeSet(pol.getRelatedPoints()));
    return ret;
  }

  private PointOnLineConstraint getPOLConstraint() {
    return (PointOnLineConstraint) Lists.getOne(getConstraints());
  }

  public void addPoint(Pt pt) {
    PointOnLineConstraint pol = getPOLConstraint();
    pol.addPoints(pt);
    bug("Added point " + SketchBook.n(pt) + " to list: " + SketchBook.n(getConstrainedPoints()));
  }

  public Pt[] getAntipodes(Set<Pt> sourcePoints) {
    Pt[] points = sourcePoints.toArray(new Pt[0]);
    Pt bestA = null;
    Pt bestB = null;
    double bestDist = 0;
    for (int i = 0; i < points.length; i++) {
      Pt a = points[i];
      for (int j = i + 1; j < points.length; j++) {
        Pt b = points[j];
        double thisDist = a.distance(b);
        if (thisDist > bestDist) {
          bestDist = thisDist;
          bestA = a;
          bestB = b;
        }
      }
    }
    Pt[] best = new Pt[] {
        bestA, bestB
    };
    return best;
  }

}