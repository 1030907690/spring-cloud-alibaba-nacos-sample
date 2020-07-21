package com.springcloudalibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// @RestController注解是@Controller+@ResponseBody
@RefreshScope //通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
public class ConfigController {

    @Value("${custom.info}")// 注解获取custom.info配置的值
    private String config;

    @RequestMapping("/getConfig")
    public String getConfig() {  // 获取配置的接口
        return config;
    }
}
