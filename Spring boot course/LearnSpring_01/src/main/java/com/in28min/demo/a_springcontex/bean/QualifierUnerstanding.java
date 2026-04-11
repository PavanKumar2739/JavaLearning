package com.in28min.demo.a_springcontex.bean;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GameRunnerQualify;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;

public class QualifierUnerstanding {
	
	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfigurationMess.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		    context.getBean(GamingConsole.class).up();
		    
		    context.getBean(GameRunnerQualify.class).run();
		    // it dosent matter if we use the qualifier or not it will only pic the bean which is passed in class itself while manual creating he bean
		    //first of all its not allowing to crate a multiplle beans and pass the one while creating the object. 
		    
		    //learn
		    System.out.println("Game size is "+context.getBean(GamingConsole.class).getSize());
		    
		
		}
	}
	
	
	
	

}
