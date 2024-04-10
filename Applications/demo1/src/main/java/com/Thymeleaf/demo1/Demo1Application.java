package com.Thymeleaf.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Thymeleaf.demo1.entity.ans;
import com.Thymeleaf.demo1.entity.questions;
import com.Thymeleaf.demo1.repo.AnsRepo;
import com.Thymeleaf.demo1.repo.QuestionsRepo;

@SpringBootApplication
public class Demo1Application {

	
	public static void main(String[] args) {
		
		
		SpringApplication.run(Demo1Application.class, args);
		
		questions q=new questions();
		q.setId(1);
		q.setSub("java");
	}

}
