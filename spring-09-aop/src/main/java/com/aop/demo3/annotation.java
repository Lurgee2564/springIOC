package com.aop.demo3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现AOP
@Aspect//标注这个类为切面
public class annotation {
    @Before("execution(* com.aop.demo.UserService.*(..))")//切点之前执行，括号中设置切点
    public void before(){
        System.out.println("方法执行之前");
    }
    @After("execution(* com.aop.demo.UserService.*(..))")
    public void after(){
        System.out.println("方法执行之后");
    }

}
