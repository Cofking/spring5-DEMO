package com.AOP.AspectJ注解实现;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages={"com.AOP.AspectJ注解实现"})
@EnableAspectJAutoProxy//开启AOP    proxyTargetClass = true 为cglib  false 为 JDK接口代理 默认 自动
public class AOPConfig {

}
