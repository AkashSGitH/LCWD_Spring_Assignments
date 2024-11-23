package com.core.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

//    Engine engine = new Engine();  // avoid this by creating constructor and making spring-xml configuration to create a bean.

    Engine engine;

    @Autowired
    public Car(Engine engine) {  // no longer needed since coded using config.xml
        System.out.println("Parameterized Constructor");
        this.engine = engine;
    }

//    public Car() {
//        System.out.println("Zero arg Constructor");
//    }

    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        System.out.println("Setter method");
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
        System.out.println("Car started");
    }

}
