package com.springcloudalibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController注解是@Controller+@ResponseBody
public class TestController {


    @Value("${server.port}")
    private String port; // 获取配置文件中写的程序端口号


    @RequestMapping("/test") // 标记是该方法的请求
    public String test() {
        return "hello world test " + port;  // 返回值是一个字符串，因为用了@RestController所以不必额外加@ResponseBody了
    }
}
