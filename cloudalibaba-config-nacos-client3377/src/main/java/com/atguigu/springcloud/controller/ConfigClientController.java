package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/6 8:02 下午
 */
@RestController
@RefreshScope               //支持nacos的动态刷新功能
public class ConfigClientController {

    @Value("${config.info}")
    private String config;

    @GetMapping("/config/info")
    public String getConfig(){
        return config;
    }

}
