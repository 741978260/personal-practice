package com.practice.personal.modules.test.controller;

import com.practice.personal.modules.test.entity.ThreadIndex;
import com.practice.personal.modules.test.service.ThreadIndexService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/index")
public class ThreadIndexController {

    @Autowired
    private ThreadIndexService threadIndexService;

    @GetMapping("/create")
//    @RequiresPermissions(value = "edit")
    @RequiresPermissions(value = "query")
    public String test() {
        String[] str = {"手机", "电饭煲", "镜子", "钢笔", "电灯", "笔记本", "暖宝宝", "煮茶器", "电熨斗",
                "梳子", "移动电源", "雨伞", "毛巾", "牙刷", "雨衣", "餐巾纸", "棉拖鞋", "茶杯", "电风扇", "取暖器"};
        for (int i = 0; i < 10; i++) {
//            System.out.println("==============" + i);
//            System.out.println("随机浮点数：" + Math.random() * 100);
//            System.out.println("随机数：" + (int) (Math.random() * 20));
            ThreadIndex threadIndex = new ThreadIndex();
//            threadIndex.setId();
            threadIndex.setName(str[(int) (Math.random() * 20)] + i);
            threadIndex.setDescription("该产品" + i + "由xxx生产，具备什么什么功能...");
            threadIndexService.insert(threadIndex);
        }
        return "this is test。。";
    }

    /*@RequestMapping("/create")
    @RequiresPermissions(value = "query")
    public String test2() {
        return "";
    }*/


}
