package com.infy.irs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrsApplication.class, args);
		
	}
	@Bean
	public ModelMapper moderMapper() {
		
		return new ModelMapper();
	}
}
