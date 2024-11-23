package com.core;

import com.core.assignment2.hibernate.MyHibernateTemplate;
import com.core.assignment2.hibernate.configs.CustomHibernateConfiguration;
import com.core.assignment2.service.Customer;
import com.core.assignment2.service.config.CustomNotificationConfiguration;
import com.core.concepts.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment2
{
    public static void main( String[] args )
    {
        System.out.println( "LCWD Maven Project - Assignment 2" );

        System.out.println("\nQuestion - 1 \n");

        ApplicationContext container = new AnnotationConfigApplicationContext(CustomHibernateConfiguration.class);

        MyHibernateTemplate hibernateTemplate = container.getBean("myHibernateTemplate", MyHibernateTemplate.class);

        hibernateTemplate.useHibernateTemplate();

        System.out.println("\nQuestion - 2 \n");

        container = new AnnotationConfigApplicationContext(CustomNotificationConfiguration.class);

        Customer customer = container.getBean("customer", Customer.class);

        customer.purchaseItems();
    }
}
