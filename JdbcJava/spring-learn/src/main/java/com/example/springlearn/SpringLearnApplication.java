package com.example.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(myConfig.class);
		mobiles m=context.getBean("getIphone ",mobiles.class);
		m.modelClolor();
	}

}
