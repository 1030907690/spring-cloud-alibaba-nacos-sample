package com.springcloudalibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerSampleApplication.class, args);
	}

}
