package com.ioc.usingBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Apple getPhoneBean() {
		return new Apple();
	}
	
	@Bean
	public Processor getProcessorBean() {
		return new Processor();
	}
}
