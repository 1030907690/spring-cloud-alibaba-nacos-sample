package com.sample.starter.init;


import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

public class ApplicationInitialize implements ApplicationListener<WebServerInitializedEvent> {
	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		System.out.println("应用初始化onApplicationEvent");
	}
}
