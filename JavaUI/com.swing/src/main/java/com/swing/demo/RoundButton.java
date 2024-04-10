package com.swing.demo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoundButton extends JButton {
    
    public RoundButton(String label) {
        super(label);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(50, 50));
    }
    
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        Shape shape = new Ellipse2D.Float(0, 0, w, h);
        g2.setColor(getBackground());
        g2.fill(shape);
        super.paintComponent(g);
    }
    
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        int w = getWidth();
        int h = getHeight();
        Shape shape = new Ellipse2D.Float(0, 0, w, h);
        g.drawOval(0, 0, w-1, h-1);
    }
    public static void main(String[] args) {
		RoundButton r=new RoundButton("button");
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		//frame.add(r);
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.setBounds(250,100,40,40);
		panel.add(r);
		frame.add(panel);
		frame.setVisible(true);
	}
}

