package com.practice.personal.modules.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/method1")
    @RequiresPermissions(value = "query")
    public String method1(){
        log.info("调用method1...");
        return "调用method1...";
    }


}
