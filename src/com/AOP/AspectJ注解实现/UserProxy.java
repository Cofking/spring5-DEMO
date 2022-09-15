package com.AOP.AspectJ注解实现;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Aspect //生成代理对象
@Component//增强类对象
public class UserProxy {

    //提取相同的切入点
    @Pointcut("execution(* com.AOP.AspectJ注解实现.User.add(..))")
    public void all(){

    }

    //前置通知

    @Before("all()")//相同的切入点直接调用方法
    public void befor(){
        System.out.println("前置通知");
    }

    @After(("execution(* com.AOP.AspectJ注解实现.User.add(..))"))
    public void after(){
        System.out.println("最终通知");
    }

    //后置通知/返回通知
    @AfterReturning(("execution(* com.AOP.AspectJ注解实现.User.add(..))"))
    public void afterReturning(){
        System.out.println("后置通知");
    }

    @AfterThrowing(("execution(* com.AOP.AspectJ注解实现.User.add(..))"))
    public void afterThrowing(){
        System.out.println("异常通知");
    }

    @Around(("execution(* com.AOP.AspectJ注解实现.User.add(..))"))
    public  void  around(ProceedingJoinPoint pj) throws  Throwable{

        System.out.println("环绕通知前");
        pj.proceed();
        System.out.println("环绕通知后");


    }


}



