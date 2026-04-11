package com.in28min.demo.a_springcontex.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;

@Configuration
public class GamingConfiguration {
	
	@Bean(name="game1")
	public GamingConsole game() {//taken from loosly coupled
		return new MarioGame();
	}
	
	
	
//	@Bean(name="game3")
//	//@Primary
//	public GamingConsole game3() {//taken from loosly coupled
//		return new MarioGame("20MB");
//	}
	
	
	@Bean
	public GameRunner gameRunner(GamingConsole game1) {//taken from loosly coupled, 
		//based on the game is there as abean this will inject into the bean
		return new GameRunner(game1);
	}
//	
	
	//just chacking the qualifier works outside this class
//	@Bean(name="gameQualify")
//	public GamingConsole gameQualify() {//taken from loosly coupled
//		return new MarioGame();
//	}
//	
//	
//	@Bean(name="gameQualify2")
//	@Qualifier("GamingConsoleQulify2")
//	public GamingConsole gameQualify2() {//taken from loosly coupled
//		return new MarioGame("10MB");
//	}
//	
//	@Bean(name="gameQualify3")
//	//@Primary
//	public GamingConsole gameQualify3() {//taken from loosly coupled
//		return new MarioGame("20MB");
//	}
	

	

}
