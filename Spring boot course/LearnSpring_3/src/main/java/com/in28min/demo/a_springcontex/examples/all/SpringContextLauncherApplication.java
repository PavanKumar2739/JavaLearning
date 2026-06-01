package com.in28min.demo.a_springcontex.examples.all;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;


@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists in the same package(with component annotation)
public class SpringContextLauncherApplication {
	
	public static void main(String[] args) {
			//1: Launch Spring context
			//config is not sufficient we need below beans. we need contex to launch the config class
			
			try(var context = new AnnotationConfigApplicationContext(SpringContextLauncherApplication.class)){
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			    BusnissCalculation bus = (BusnissCalculation) context.getBean("busnissCalculation");
			    System.out.println("Max value from the data "+bus.findMaxValue());
		}
	}
	
	
	
	

}
