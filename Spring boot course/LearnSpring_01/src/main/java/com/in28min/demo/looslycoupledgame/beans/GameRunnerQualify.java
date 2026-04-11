package com.in28min.demo.looslycoupledgame.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GameRunnerQualify {
	
	GamingConsole game;
	
	//now this game runner is loosely coupled to GamingConsole interface to make it usefull to all games. 
	public GameRunnerQualify(@Qualifier("GamingConsoleQulify1") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game sarted ... "+game);
		game.up();
		game.down();
		game.right();
		game.left();
		game.getSize();
	}

}
