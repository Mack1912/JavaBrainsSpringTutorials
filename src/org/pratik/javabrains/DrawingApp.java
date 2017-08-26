package org.pratik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {

        // its and interface that reads the blueprint of configuration from a xml file
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle t = (Triangle) factory.getBean("triangle1");
        t.draw();
    }

}
