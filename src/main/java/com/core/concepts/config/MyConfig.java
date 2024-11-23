package com.core.concepts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// this is truly the Java based Configurations( @Configuration + @Bean )
@Configuration
@ComponentScan(basePackages = {"com.core"})
public class MyConfig {

    // @Bean - This is used only for the classes for which we can't mark with @Component,
    // because we need the object but the class is created by some other third party.
    // So we simply get the object by marking RT as required object

}
