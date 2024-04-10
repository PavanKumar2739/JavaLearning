package com.example.springlearn;

public class mi implements mobiles {
color col;
	public mi() {
		System.out.println("obj created");
	}
	public mi(color colObj) {
		col=colObj;
		System.out.println("obj created");
	}
	@Override
	public void modelClolor() {
		System.out.println("mi");
		col.getMiColor();
		
	}

}
