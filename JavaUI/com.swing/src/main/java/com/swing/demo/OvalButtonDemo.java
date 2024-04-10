package com.swing.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OvalButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Oval Button Demo");
        frame.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("D:\\programming\\JavaUI\\com.swing\\src\\main\\resources\\emoji.png");
        final JButton button = new JButton(icon);
        //final JButton button = new JButton("Click me");
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                // Change button appearance on mouse enter
                button.setBackground(Color.BLUE);
                button.setToolTipText("This button does something");
            }
            public void mouseExited(MouseEvent evt) {
                // Change button appearance on mouse exit
                button.setBackground(UIManager.getColor("control"));
            }
        });

button.addMouseListener(new MouseAdapter() {
	public void mouseEntered(MouseEvent evt) {
        // Change button appearance on mouse enter
        button.setBackground(Color.BLUE);
        button.setToolTipText("This button does something");
    }
	public void mouseExited(MouseEvent evt) {
        // Change button appearance on mouse exit
        button.setBackground(UIManager.getColor("control"));
    }
});
        button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        button.setBackground(null);
        button.setBorder(null);
        
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
