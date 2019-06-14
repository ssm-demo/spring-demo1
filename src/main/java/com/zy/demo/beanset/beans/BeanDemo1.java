package com.zy.demo.beanset.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanDemo1
{
     @Value("#{T(Math).random()}")
    public  Double id;
     @Value("test")
    public  String name;

}
