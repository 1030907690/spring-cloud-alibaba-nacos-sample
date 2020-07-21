package com.springcloudalibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController // @RestController注解是@Controller+@ResponseBody
public class TestController {

    private final String SERVER_URL = "http://nacos-provider-sample"; // 这里的服务地址填写注册到Nacos的应用名称
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/test")  // 标记是该方法的请求
    public String test() {
        return restTemplate.getForObject(SERVER_URL + "/test", String.class);//调用提供者/test接口
    }


}
