package com.spring.demo.service;

import com.spring.demo.ConfigDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {


	@Test
	public void applicationContextTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigDemo.class);
		System.out.println("====");
	}


}
