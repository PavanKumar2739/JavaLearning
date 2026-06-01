package com.in28min.demo.a_springcontex.examples.pre_post.a2;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	
	private SomeDependecy someDependency;
	
	public SomeClass(SomeDependecy someDependency) {
		this.someDependency = someDependency;
		System.out.println("All dependencies are injected(instances created and added) and ready!");
	}
	
	@PostConstruct
	public void initializer() {
		someDependency.getReay();//this will start befre injection happenss
	}
	
	@PreDestroy
	public void cleanup() {
		
	}
}


@Component
class SomeDependecy{
	
	public void getReay() {
		System.out.println("Some logic using dependency!");
	}
	
	
	
	
	
}
@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists
public class SampleSpringLauncherApp {
	

	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context = new AnnotationConfigApplicationContext(SampleSpringLauncherApp.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		
		}
	}
	
	
	
	

}
