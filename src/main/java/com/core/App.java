package com.core;

import com.core.assignment1.controller.UserController;
import com.core.concepts.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.concepts.Car;
import com.core.concepts.Engine;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "LCWD Maven Project" );
//        Engine engine = new Engine();
//        Car car = new Car();  // still this is manual process
//        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // If we want to completely remove/ignore the XML file, then
        // now we must inform container to use the annotations to create beans, so use following

        ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);

        Car car = container.getBean("car", Car.class);

        car.start();

        System.out.println("=====================================================");

//        UserController userController = container.getBean("userController", UserController.class);
//
//        userController.handleUserRequest();

    }
}
