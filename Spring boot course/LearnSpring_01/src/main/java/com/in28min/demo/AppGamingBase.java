package com.in28min.demo;

import com.in28min.demo.looslycoupledgame.FreeFire;
import com.in28min.demo.looslycoupledgame.GamingConsole;
import com.in28min.demo.tightlycoupledgame.GameRunner;
import com.in28min.demo.tightlycoupledgame.MarioGame;
import com.in28min.demo.tightlycoupledgame.PubG;

public class AppGamingBase {

	public static void main(String[] args) {
		//Var: simplifies the code,  new feature in java 10, infer the type of the variable based on the value assigned.
		var pubG = new PubG();
		var marioGame = new MarioGame();
		//game runner is tightly coupled to MarioGame to make it usefull to pubg need to make changes again
		//to make use of both we have to go with the loosely coupled one.
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
		
		
		
		var game = new com.in28min.demo.looslycoupledgame.PubG();
		var game1 = new com.in28min.demo.looslycoupledgame.MarioGame();
		GamingConsole game2 = new FreeFire();
		
		
		//since its loosely coupled we can pass the any game which is implemented to gaming console
		//gaming console helps o make this possible.
		var gameRunnerLooselyCouple = new com.in28min.demo.looslycoupledgame.GameRunner(game2);
		
		//in above case if we observe the object is injecting into the GameRunner class.
		//object creation and wiring of dependency.
		//game is dependency of gamerunner.
		//we are doing it manually, we can make it inject using spring
		
		gameRunnerLooselyCouple.run();
		
		
		

	}

}
