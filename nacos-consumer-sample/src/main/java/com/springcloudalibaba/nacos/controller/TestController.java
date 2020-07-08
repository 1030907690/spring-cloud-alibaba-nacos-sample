package com.springcloudalibaba.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController注解是@Controller+@ResponseBody
public class TestController {

    @RequestMapping("/test")  // 标记是该方法的请求
    public String test() {
        return null; // 暂且先返回null，下一步我们接入基本的远程调用，去调用提供者
    }
}
