package com.example.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfig {
	@Bean
	public color getColor() {
		return new color();
	}
	@Bean
	public mi getMi(color getColor) {
		return new mi(getColor);
	}
	@Bean
	public IPhone getIphone(color getColor) {
		return new IPhone(getColor);
	}

}
