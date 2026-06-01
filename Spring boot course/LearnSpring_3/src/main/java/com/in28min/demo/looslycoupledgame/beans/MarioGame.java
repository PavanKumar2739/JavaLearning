package com.in28min.demo.looslycoupledgame.beans;

import org.springframework.stereotype.Component;

//for xml confiuration no need to mention annotations
public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Go UP");
	}
	public void down() {
		System.out.println("Go into Hole");
	}
	public void right() {
		System.out.println("accelerate");
	}
	public void left() {
		System.out.println("run");
	}
	

}
