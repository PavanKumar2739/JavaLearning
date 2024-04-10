package com.swing.demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class BorderLayoutPractice {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setLayout(new BorderLayout(5,5));//helps to set the borders inside the frame and we can send margins
		frame.setVisible(true);
		
		JPanel panel=new JPanel();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		
		//give the colors to the borders
		panel.setBackground(Color.red);
		panel1.setBackground(Color.green);

		panel2.setBackground(Color.yellow);

		panel3.setBackground(Color.gray);

		panel4.setBackground(Color.blue);
		
		//give size for the pannels the thing is only thickness.
		panel.setPreferredSize(new Dimension(50,50));
		panel1.setPreferredSize(new Dimension(50,50));
		panel2.setPreferredSize(new Dimension(50,50));
		panel3.setPreferredSize(new Dimension(50,50));
		panel4.setPreferredSize(new Dimension(50,50));
		
		//set the which side borders should need to be
		frame.add(panel,BorderLayout.EAST);
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.CENTER);
		
		//-----sub panels---
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9=new JPanel();

		panel4.setLayout(new BorderLayout());
		panel5.setBackground(Color.orange);
		panel6.setBackground(Color.PINK);
		panel7.setBackground(Color.MAGENTA);

		panel8.setBackground(Color.WHITE);

		panel9.setBackground(Color.BLACK);
		
		//give size for the pannels the thing is only thickness.
		panel5.setPreferredSize(new Dimension(20,20));
		panel6.setPreferredSize(new Dimension(20,20));
		panel7.setPreferredSize(new Dimension(20,20));
		panel8.setPreferredSize(new Dimension(20,20));
		panel9.setPreferredSize(new Dimension(20,20));
		
		panel4.add(panel5,BorderLayout.EAST);
		panel4.add(panel8,BorderLayout.WEST);
		panel4.add(panel6,BorderLayout.NORTH);
		panel4.add(panel7,BorderLayout.SOUTH);
		//panel4.add(panel5,BorderLayout.EAST);
		
		
	}
	
}
