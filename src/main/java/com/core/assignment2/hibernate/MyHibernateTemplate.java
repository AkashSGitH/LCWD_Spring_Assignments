package com.core.assignment2.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyHibernateTemplate {

    private final MySessionFactory mySessionFactory;

    @Autowired
    public MyHibernateTemplate(MySessionFactory mySessionFactory) {
        System.out.println("MyHibernateTemplate 1-param constructor to set MySessionFactory");
        this.mySessionFactory = mySessionFactory;
    }

    public void useHibernateTemplate() {
        System.out.println("Using custom Hibernate Template object");
    }

}
