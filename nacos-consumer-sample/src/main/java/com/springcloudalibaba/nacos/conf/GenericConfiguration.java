package com.springcloudalibaba.nacos.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GenericConfiguration { // 常规配置类
    @LoadBalanced // 标注此注解后,RestTemplate就具有了客户端负载均衡能力
    @Bean
    public RestTemplate restTemplate(){ // 创建RestTemplate，并交个Spring容器管理
        return new RestTemplate();
    }
}
