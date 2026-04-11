package com.in28min.demo.tightlycoupledgame;

public class GameRunner {
	
	MarioGame game;
	
	//now this game runner is tightly coupled to MarioGame to make it usefull to pubg need to make changes again
	//this is called 
	public GameRunner(MarioGame game) {
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
