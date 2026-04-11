package com.in28min.demo.a_springcontex.bean;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;


@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists. by default it will take the same packages
public class SampleSpringCotextLauncher {
	
	@Component
	class YourbusinessClass{
		//since we have added o the class as the component this will create a bean for the class and add this to ioc container
		
		//@Autowired 
		Dependency1 dependency1;
		
		//@Autowired
		Dependency2 dependency2;
		
		//setter based dependency injection
		@Autowired
		public void setDependency1(Dependency1 dependency1) {
			System.out.println("Setter based dependency injection 1");
			this.dependency1 = dependency1;
		}
		
		@Autowired
		public void setDependency2(Dependency2 dependency2) {
			System.out.println("Setter based dependency injection 2");
			this.dependency2 = dependency2;
		}
		
		public String toString() {
			return "it uses " +dependency1+" and "+dependency2;
		}
	}
	
	@Component
	class Dependency1{
		//since we have added o the class as the component this will create a bean for the class and add this to ioc container
	}
	
	@Component
    class Dependency2{
		//since we have added o the class as the component this will create a bean for the class and add this to ioc container
	}
	
	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context = new AnnotationConfigApplicationContext(SampleSpringCotextLauncher.class)){
		   //with a bean defnition names we will return all the beans which are there in spring context
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			YourbusinessClass buss =  context.getBean(YourbusinessClass.class);
			System.out.println(buss);
		
		}
	}
	
	
	
	

}
