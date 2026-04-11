package com.in28min.demo.looslycoupledgame.beans;

public class FreeFire implements GamingConsole{
	
	String size;
	
	public void up() {
		System.out.println("Go front");
	}
	public void down() {
		System.out.println("sit");
	}
	public void right() {
		System.out.println("go right");
	}
	public void left() {
		System.out.println("go left");
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
