package org.pratik.javabrains;

import java.util.List;

public class Triangle {

    Point pt1;
    Point pt2;
    Point pt3;

    public Point getPt1() {
        return pt1;
    }

    public void setPt1(Point pt1) {
        this.pt1 = pt1;
    }

    public Point getPt2() {
        return pt2;
    }

    public void setPt2(Point pt2) {
        this.pt2 = pt2;
    }

    public Point getPt3() {
        return pt3;
    }

    public void setPt3(Point pt3) {
        this.pt3 = pt3;
    }

    public void draw() {
        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt3);
    }
}
