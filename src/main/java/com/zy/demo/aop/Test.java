package com.zy.demo.aop;

import com.zy.demo.aop.config.Config;
import com.zy.demo.aop.service.RoleService;
import com.zy.demo.aop.service.impl.RoleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.ObjectName;
import javax.management.relation.Role;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        // 简单aop通过注解实现测试
       //testAopAnnotation();
       // 简单aop通过xml实现
        testAopXML();

    }

    public static void  testAopAnnotation()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(
            Config.class);
        RoleService rs= (RoleService)context.getBean(RoleService.class);
        Role role = new Role("hello", new ArrayList<ObjectName>());
        rs.printRole(role);
        System.out.println("test exceptions...");
        role = null;
        rs.printRole(role);
    }
    public static void  testAopXML()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "spring-aop.xml");
        RoleService rs= (RoleService)context.getBean("roleService");
        Role role = new Role("hello", new ArrayList<ObjectName>());
        rs.printRole(role);
        System.out.println("test exceptions...");
        role = null;
        rs.printRole(role);
    }
}
