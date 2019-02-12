package com.practice.personal.modules.sys.controller;

import com.practice.personal.modules.sys.service.SysUserRoleService;
import com.practice.personal.modules.sys.service.SysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @GetMapping("/test")
    @RequiresPermissions(value = "edit")
//    @RequiresPermissions(value = "query")
    public String test(){
        return "this is test。。";
    }

}
