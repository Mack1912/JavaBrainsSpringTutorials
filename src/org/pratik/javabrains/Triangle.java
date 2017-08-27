package org.pratik.javabrains;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {

//    List<Point> points;
    Point p1;
    Point p2;
    Point p3;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void draw() {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

//        for (Point p : points
//             ) {
//            System.out.println(p);
//        }

    }

    // this method gets priority
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying by the interface method: destroy");
    }


    // this method gets priority
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing by the interface method: afterPropertiesSet");
    }

    // myInit is a standard name used for init methods
    public void myInit() {
        System.out.println("Init method from the spring config file called");
    }

    // cleanUp is a standard name used for destroy methods
    public void cleanUp() {
        System.out.println("cleanUp method from the spring config file called");
    }
}