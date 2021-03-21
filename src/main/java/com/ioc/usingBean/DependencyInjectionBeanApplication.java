package com.ioc.usingBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionBeanApplication.class, args);
		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Apple phone = factory.getBean(Apple.class);
		phone.getConfig();
		Processor processor = factory.getBean(Processor.class);
		processor.getProcessor();
		factory.close();
		System.exit(0);
	}
}
