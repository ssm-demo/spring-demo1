package com.zy.demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlRoleAspect
{
    public void before()
    {
       System.out.println("Xml test before...");
    }

    public void after()
    {
        System.out.println("Xml test after...");
    }

    public void afterReturning()
    {
        System.out.println("Xml test afterReturning...");
    }

    public void afterThrowing()
    {
        System.out.println("Xml test afterThrowing...");
    }

    public void around(ProceedingJoinPoint pj)
    {
        System.out.println("Xml test around before...");
        try
        {
            pj.proceed();
        }
        catch (Throwable e)
        {
            System.out.println("Xml test around has some errors..");
        }

        System.out.println("Xml test around after...");
    }
}

