package com.swing.demo;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyButton implements ActionListener{
	JButton button;
	JLabel label;
public static void main(String[] args) {
	ImageIcon img=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\click.jpg");
	ImageIcon img1=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\emoji.png");
	
	MyButton b=new MyButton();
	b.label=new JLabel();
	b.label.setIcon(img1);
	b.label.setBounds(400,400,100,100);
	b.label.setVisible(false);
	
	
	b.button = new JButton();
	b.button.setBounds(200,100,400,200);//make the button
	b.button.addActionListener(b);
	b.button.setText("I'm a button.!");
	b.button.setFocusable(false);
	b.button.setIcon(img);//set icon in button
	b.button.setHorizontalTextPosition(JButton.CENTER);//middle of img
	b.button.setVerticalTextPosition(JButton.BOTTOM);// text move to bottom of img
    b.button.setForeground(new Color(100,100,200));
    b.button.setBackground(Color.ORANGE);//color for button
	b.button.setBorder(BorderFactory.createEmptyBorder());// give bit border 
	
	
	JFrame frame=new JFrame();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setSize(600,600);
	frame.setVisible(true);
	frame.add(b.button);
	frame.add(b.label);
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		System.out.println("Button Clicked");
		button.setEnabled(false);
		label.setVisible(true);
	}
	
}
}
