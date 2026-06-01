package com.in28min.demo.a_springcontex.examples.jakarata.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
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
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component// the below annottions are alternatives for this, no need to use but its good to aware of..
@Named //its a CDI(Context and DependencyInjection annotations) replacement of component, part of jakarta lib
class SomeClass{
	
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection called..");
		this.dataService = dataService;
	}
	
	
	
	
}


//@Component
@Named
class DataService{
	
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
			System.out.println(context.getBean(SomeClass.class).getDataService());
		
		}
	}
	
	
	
	

}
