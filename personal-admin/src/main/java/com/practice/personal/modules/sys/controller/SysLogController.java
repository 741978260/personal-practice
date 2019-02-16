package com.practice.personal.modules.sys.controller;

import com.practice.personal.common.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sys/log")
public class SysLogController {

    @ResponseBody
    @RequestMapping("/list")
    public R list(){
        return R.ok();
    }


}
