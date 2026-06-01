package com.in28min.demo.a_springcontex.bean.lazy;

import java.util.Arrays;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;

@Component
class ClassA{
	
	public String returnSomething() {
		return "Something";
	}
	
}

@Component
@Lazy//this will make the compnent to stop loading the beans while initialze time itself
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some other initialization logics ");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Returned "+classA.returnSomething());
	}
}

@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists
public class LazyInitializationLauncherApp {
	
	
	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context =
				new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApp.class)){//just by launching the application spring will automatically crate or initialize the bean automatically
			//to avoid loading the bean by default we can use LAzy annotation
			//with a bean defnition names we will return all the beans which are there in spring context
			
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("initialization of context completed ");
			
			context.getBean(ClassB.class).doSomething();//in case of lazy this has been initialize the beans.
			
			
			
			
		}
	}
	
	
	
	

}
