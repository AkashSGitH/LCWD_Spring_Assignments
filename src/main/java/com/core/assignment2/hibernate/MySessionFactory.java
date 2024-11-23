package com.core.assignment2.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {

    private final MyDataSource myDataSource;

    @Autowired
    public MySessionFactory(MyDataSource myDataSource) {
        System.out.println("MySessionFactory 1-param constructor to set MyDataSource");
        this.myDataSource = myDataSource;
    }

}
