package com.example.springlearn;

public class IPhone implements mobiles{
	color col;
	public IPhone(color colObj) {
		col=colObj;
		System.out.println("obj created");
	}
	@Override
	public void modelClolor() {
		col.getIphoneColor();
		System.out.println("iphone");
		
	}

}
