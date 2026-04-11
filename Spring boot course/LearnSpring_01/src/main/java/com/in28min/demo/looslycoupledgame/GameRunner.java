package com.in28min.demo.looslycoupledgame;

public class GameRunner {
	
	GamingConsole game;
	
	//now this game runner is loosely coupled to GamingConsole interface to make it usefull to all games.
	//all other games will implement this GamingConsole  interface 
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game sarted ... "+game);
		game.up();
		game.down();
		game.right();
		game.left();
		
	}

}
