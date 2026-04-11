package com.in28min.demo.a_springcontex.examples.a1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;
import com.in28min.demo.looslycoupledgame.beans.MarioGame;

//@Configuration
public class GamingConfiguration {
	// in this case we are neglecting this and copy all beans to main class and make it as a configuration
	
//	@Bean
//	public GamingConsole game() {//taken from loosly coupled
//		return new MarioGame();
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {//taken from loosly coupled, 
//		//based on the game is there as abean this will inject into the bean
//		return new GameRunner(game);
//	}
//	
	

}
