package com.zy.demo.aop.config;

import com.zy.demo.aop.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.zy.demo.aop")
public class Config
{
    @Bean
    public RoleAspect getRoleAspect()
    {
        return new RoleAspect();
    }
}
