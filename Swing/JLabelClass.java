package Swing;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

/*
 * Jlabel is a component for placing text in a container
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelClass {

    public static void main(String[] args) {
        jlabelExample();
        
    }

    public static void jlabelExample () {
        JFrame f = new JFrame("JLabel Example");
        JLabel l1, l2, l3;
        l1 = new JLabel("First Label");
        l1.setBounds(00,50,100,30);
        l2 = new JLabel("Label Two");
        l2.setBounds(30,100,100,30);


        //Add a label with an image icon
        l3 = new JLabel();
        ImageIcon  icon = new ImageIcon("C:\\Users\\allan.branson\\Projects\\Java_Javat_Point\\Image Files\\9332300.png");
        l3.setIcon(icon);
        l3.setBounds(50, 200 , 100, 200);

        //Add components to the frame
        f.add(l3);
        f.add(l1);
        f.add(l2);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        
    }
}


