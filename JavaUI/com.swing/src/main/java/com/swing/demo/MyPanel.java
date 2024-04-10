package com.swing.demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel{
public static void main(String[] args) {
	ImageIcon img=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\gear.jpeg");
	JLabel label=new JLabel();
	label.setText("Gear");
	label.setIcon(img);
	label.setHorizontalTextPosition(JLabel.CENTER);//set the text Left,Right or center of the lab
	label.setForeground(new Color(100,200,100));//set the color for the text
	label.setFont(new Font("monospaced",Font.BOLD,30));//give font style and and size
	JPanel redPanel=new JPanel();
	redPanel.setBackground(Color.red);//give the color for the pannel we can go rgb too or 0x
	redPanel.setBounds(0,0,100,100);//set size and position of the pannel
	
	
	JPanel greenPanel=new JPanel();
	greenPanel.setBackground(Color.green);//give the color for the pannel we can go rgb too or 0x
	greenPanel.setBounds(100,0,100,100);//set size and position of the pannel

	JPanel bluePanel=new JPanel();
	bluePanel.setBackground(Color.blue);//give the color for the pannel we can go rgb too or 0x
	bluePanel.setBounds(0,100,500,500);//set size and position of the pannel
	bluePanel.add(label);
	bluePanel.setLayout(new BorderLayout());
	
	 
	JFrame frame=new JFrame();//creates a frame 
	frame.setTitle("Simple Frame");
	frame.setSize(8000,8000);//set the size in x and y dimensions
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program if we want to if we click close in page
	//frame.setResizable(false);// it wont allow us to set the resize
	frame.setVisible(true);//makes frame visible
	frame.setLayout(null);//make some boundary to layout
	
	frame.add(redPanel);//create or add the pannel to the frame
	frame.add(bluePanel);//create or add the pannel to the frame
	frame.add(greenPanel);//create or add the pannel to the frame
}
}
