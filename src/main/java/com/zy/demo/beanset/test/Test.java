package com.zy.demo.beanset.test;

import com.zy.demo.beanset.beans.BeanDemo1;
import com.zy.demo.beanset.beans.BeanDemo2;
import com.zy.demo.beanset.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String [] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(
            Config.class);
        BeanDemo1 b1 = context.getBean(BeanDemo1.class);
        BeanDemo1 b2 = context.getBean(BeanDemo1.class);
        System.out.println("b1 == b2 ?" + (b1 == b2) + "b1.id :" + b1.id);

        BeanDemo2 m1 = context.getBean(BeanDemo2.class);
        System.out.println("BeanDemo2: id=" + m1.getId());

    }
}
