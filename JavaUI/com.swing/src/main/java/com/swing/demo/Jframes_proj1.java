package com.swing.demo;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframes_proj1 {

	public static void main(String[] args) {
		/*JFrame frame=new JFrame();//creates a frame 
		frame.setTitle("Simple Frame");
		frame.setSize(400,500);//set the size in x and y dimensions
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program if we want to if we click close in page
		frame.setResizable(false);// it wont allow us to set the resize
		
		frame.setVisible(true);//makes frame vissible
        ImageIcon img=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\logo.png");
        frame.setIconImage(img.getImage());
    	//frame.getContentPane().setBackground(Color.BLUE);//give the color for the page.
        frame.getContentPane().setBackground(new Color(100,30,30));*/
		
		MyFrame frame= new MyFrame();
		//MyLabels lables=new MyLabels();
		//frame.add(lables);
		
	}

}
