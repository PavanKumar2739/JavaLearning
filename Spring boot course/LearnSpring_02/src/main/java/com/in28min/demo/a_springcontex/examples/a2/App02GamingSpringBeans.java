package com.in28min.demo.a_springcontex.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;


@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists
public class App02GamingSpringBeans {
	
//	@Bean
//	public GamingConsole game() {//commented because diretly creating the bean with component annotation. for this class
//		return new MarioGame();
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {//and this will auto inject the bean here as well, 
	//we can make spring to create a bean for this Game runner as well
//		
//		return new GameRunner(game);
//	}
	
	
	
	public static void main(String[] args) {
			//1: Launch Spring context
			//config is not sufficient we need below beans. we need contex to launch the config class
			
			try(var context = new AnnotationConfigApplicationContext(App02GamingSpringBeans.class)){
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			    BusnissCalculation bus = (BusnissCalculation) context.getBean("busnissCalculation");
			    System.out.println(bus.findMaxValue());
			    
			    
			    
			  //  context.getBean(GameRunner.class).run();
			
			
		}
	}
	
	
	
	

}
