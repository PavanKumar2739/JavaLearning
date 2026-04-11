package com.in28min.demo.looslycoupledgame.beans;

public class MarioGame implements GamingConsole{
	String size = null;
	
	public MarioGame(String size) {
		this.size = size;
	}
	
	public MarioGame() {}
	
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
	
	public String getSize() {
		return size;
	}
	

}
