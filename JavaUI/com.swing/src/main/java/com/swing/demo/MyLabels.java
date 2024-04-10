package com.swing.demo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabels extends JLabel{

	public MyLabels(){
		ImageIcon img2=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\mountain.png");
		this.setText("text is Added");
		this.setIcon(img2);
		
	}
}
