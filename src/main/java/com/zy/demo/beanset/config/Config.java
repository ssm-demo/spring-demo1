package com.zy.demo.beanset.config;

import com.zy.demo.beanset.beans.BeanDemo1;
import com.zy.demo.beanset.beans.BeanDemo2;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.zy.demo.beanset"})
//@ComponentScan(basePackageClasses = {BeanDemo1.class, BeanDemo2.class})---- 重复报错，注释掉
public class Config
{
}
