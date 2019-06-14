package com.zy.demo.aop.service.impl;

import com.zy.demo.aop.service.RoleService;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
@Component
public class RoleServiceImpl implements RoleService
{
    public void printRole(Role role)
    {
        System.out.println("Role.roleName:" + role.getRoleName());
    }

    public void printRoleXml(Role role)
    {
        System.out.println("Role.roleName:" + role.getRoleName());
    }
}
