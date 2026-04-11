package com.in28min.demo.looslycoupledgame.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FreeFireQualify")
public class FreeFire implements GamingConsole{
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

}
