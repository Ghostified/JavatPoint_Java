package Swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * JPanels is  a simple container class. It provides space in which an application can attach any other component
 * 
 */
public class JPanelClass {

    JPanelClass () {
        JFrame f = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.blue);
        JButton b1 = new JButton("Button One");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.green);
        JButton b2 = new JButton("Button Two");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.yellow);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelClass();
    }

}
