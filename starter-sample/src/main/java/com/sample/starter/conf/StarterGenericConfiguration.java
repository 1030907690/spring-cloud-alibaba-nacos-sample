package com.sample.starter.conf;

import com.sample.starter.bean.Users;
import com.sample.starter.init.ApplicationInitialize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 标记为配置类
public class StarterGenericConfiguration {
	@Bean // 把Bean交给spring容器管理
	public Users users(){
		System.out.println("创建Users对象");
		Users users = new Users();
		users.setName("zzq");
		return users;
	}

	@Bean // 把Bean交给spring容器管理
	public ApplicationInitialize applicationInitialize(){
		return new ApplicationInitialize();
	}
}
