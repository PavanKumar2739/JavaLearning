package com.swing.demo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class MyFrame extends JFrame{

	public MyFrame() {
	JLabel labeles=new JLabel();
	ImageIcon img2=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\download.jpeg");
	Border border=BorderFactory.createLineBorder(Color.BLACK,4);//we can able to generate border later we can use it
	labeles.setText("text is Added");
	labeles.setIcon(img2);
	labeles.setHorizontalTextPosition(JLabel.CENTER);//set the text Left,Right or center of the label
	labeles.setVerticalTextPosition(JLabel.TOP);//set the text on top, bottom or middle of the image
	labeles.setForeground(new Color(100,200,100));//set the color for the text
	labeles.setFont(new Font("monospaced",Font.BOLD,30));//give font style and and size
	labeles.setIconTextGap(0);// give the gap between img and text
	labeles.setBackground(new Color(50,80,200));// give the background color for the img
	labeles.setOpaque(true);// here it will set the color in background 
	labeles.setBorder(border);// apply the border here
	labeles.setVerticalAlignment(JLabel.CENTER);//set the Image in in center in vertical top or bottom. 
	labeles.setHorizontalAlignment(JLabel.CENTER); //set the Image in in center in horizontal left or right
	labeles.setBounds(0,0,300,350);//set the size of the label inside the app
	
	
		this.setTitle("Simple Tittle");
		this.setSize(500,600);//set the size in x and y dimensions
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//close the program if we want to if we click close in page
		 //this.setResizable(false);// it wont allow us to set the resize
		
		this.setVisible(true);//makes this visible
        ImageIcon img=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\logo.png");
        this.setIconImage(img.getImage());
    	//this.getContentPane().setBackground(Color.BLUE);//give the color for the page.
        //this.getContentPane().setBackground(new Color(100,30,30));
        this.setLayout(null);
        this.add(labeles);
	}
}
