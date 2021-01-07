package com.huazheng.controller;

import com.huazheng.config.ChxConfig;
import com.huazheng.config.ZhzConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @projectName:springboot-demo
 * @see:com.huazheng.controller
 * @author:zhanghuazheng
 * @createTime:2021/1/7 21:05
 * @version:1.0
 */

@RestController
public class ProperController {

    private final ZhzConfig zhzConfig;

    private final ChxConfig chxConfig;

    @Autowired
    public ProperController(ZhzConfig zhzConfig,ChxConfig chxConfig){
        this.zhzConfig =zhzConfig;
        this.chxConfig =chxConfig;
    }


    @GetMapping("/zhz")
    public String getZhzConfig() {
        return zhzConfig.toString();
    }

    @GetMapping("chx")
    public String getChxConfig() {
        return chxConfig.toString();
    }
}
