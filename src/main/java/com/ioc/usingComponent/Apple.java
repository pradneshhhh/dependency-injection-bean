package com.ioc.usingComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apple {
	
	@Autowired
	public Processor m1;
	
	public Processor getM1() {
		return m1;
	}

	public void setM1(Processor m1) {
		this.m1 = m1;
	}

	public void getConfig() {
		System.out.println("iPhone12 Mini, iOS 14");
	}
}
