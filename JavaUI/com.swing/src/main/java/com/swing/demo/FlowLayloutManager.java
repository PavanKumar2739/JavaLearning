package com.swing.demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayloutManager {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(400,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	//frame.setLayout(new BorderLayout());
	ImageIcon icon=new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\backButton.png");
	Image img = icon.getImage(); // Get the image from the ImageIcon
	Image scaledImg = img.getScaledInstance(30, 20, Image.SCALE_SMOOTH); // Resize the image
	ImageIcon scaledIcon = new ImageIcon(scaledImg); // Create a new ImageIcon with the scaled image

	JButton b1=new JButton(scaledIcon);
	//b1.setBackground(null);
	//b1.setBorderPainted(false);
	b1.setFocusPainted(false);
	b1.setContentAreaFilled(false);
	b1.setOpaque(false);
	
	JPanel panel =new JPanel();
	panel.setPreferredSize(new Dimension(350,250));
	panel.setBackground(Color.black);
	panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	panel.add(b1);
	panel.add(new Button(" 2 "));
	panel.add(new Button(" 3 "));
	panel.add(new Button(" 4 "));
	panel.add(new Button(" 5 "));
	panel.add(new Button(" 6 "));
	panel.add(new Button(" 7 "));
	panel.add(new Button(" 8 "));
	panel.add(new Button(" 9 "));
	panel.add(new Button(" 10 "));
	
	b1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("button clicked");
			
		}
	});
	
	//frame.add(panel,BorderLayout.CENTER);
	frame.add(panel);
	frame.setVisible(true);
}
	
	
}
