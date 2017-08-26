package org.pratik.javabrains;

import java.util.List;

public class Triangle {

    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
//        System.out.println(pt1);
//        System.out.println(pt2);
//        System.out.println(pt3);

        for (Point p : points
             ) {
            System.out.println(p);
        }

    }
}
