package com.in28min.demo.looslycoupledgame.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PubG implements GamingConsole{
	public void up() {
		System.out.println("Go jump");
	}
	public void down() {
		System.out.println("sit");
	}
	public void right() {
		System.out.println("back");
	}
	public void left() {
		System.out.println("run");
	}
}
