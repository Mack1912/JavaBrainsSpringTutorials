package org.pratik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {

        // its and interface that reads the blueprint of configuration from a xml file
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // important if we are overriding the destroy() method of DisposableBean interface
        context.registerShutdownHook();
        Triangle t = (Triangle) context.getBean("triangle");
        t.draw();
    }

}
