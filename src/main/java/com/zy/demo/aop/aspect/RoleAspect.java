package com.zy.demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;

@Aspect
public class RoleAspect
{
    @Before("execution(* com.zy.demo.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void before(){
        System.out.println("before...");
    }

    @After("execution(* com.zy.demo.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning("execution(* com.zy.demo.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterReturning()
    {
        System.out.println("afterReturning...");
    }

    @AfterThrowing("execution(* com.zy.demo.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterThrowing()
    {
        System.out.println("afterThrowing...");
    }

    @Around("execution(* com.zy.demo.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void around(ProceedingJoinPoint pjp)
    {
        System.out.println("around before...");
        try
        {
            pjp.proceed();
        }
        catch (Throwable e)
        {
            System.out.println("around e..." + e);
        }

        System.out.println("around after...");
    }
}
