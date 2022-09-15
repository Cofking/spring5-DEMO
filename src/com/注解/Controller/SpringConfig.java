package com.注解.Controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.注解"})

public class SpringConfig {

    public  void  abc(){

        System.out.println("全注解开发...");
    }
}
