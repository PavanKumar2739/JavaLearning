package com.in28min.demo.a_springcontex.examples.scopes.a1;

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

//same bean will be returned in while getting beans
@Component
class NormalClass{
	
}

//prototype class eveytime we get the bean new instance will be created.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass{
	
}
@Configuration
@ComponentScan//this will help the spring to identify the bean where its exists
public class BeanScopeLauncherApp {
	

	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		
		try(var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApp.class)){
			System.out.println("Object for Normal class : ");
			//everytime same instance will be returned, which is created at contet loadings
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
		    
		    System.out.println("Object for Prototype class : ");
		    //everytime new object will be returned
		    System.out.println(context.getBean(ProtoTypeClass.class));
		    System.out.println(context.getBean(ProtoTypeClass.class));
		    System.out.println(context.getBean(ProtoTypeClass.class));
		    System.out.println(context.getBean(ProtoTypeClass.class));
		    System.out.println(context.getBean(ProtoTypeClass.class));
		
		}
	}
	
	
	
	

}
