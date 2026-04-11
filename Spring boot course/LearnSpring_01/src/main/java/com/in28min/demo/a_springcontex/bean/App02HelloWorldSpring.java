package com.in28min.demo.a_springcontex.bean;

import java.net.Socket;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		    context.getBean(GamingConsole.class).up();
		    
		    context.getBean(GameRunner.class).run();
		    
		    //learn
		    System.out.println( context.getBean(GamingConsole.class).getSize());
		    
		
		}
	}
	
	
	
	

}
