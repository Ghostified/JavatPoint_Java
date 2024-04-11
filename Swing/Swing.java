package Swing;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  


import javax.swing.*;

/*
 * JFrames can be created by extending the Frame class Inheritance 
 * By craeting an object of the Frame class (Association)
 */

public class Swing {

    public static void main(String[] args) {

        //swingExample1();
        //buttonWithEvent();
        buttonWithImage();
        
    }

    public static void swingExample1 () {
        JFrame f = new JFrame ();//creating a new instance of a JFRAME

        //Add Buutons
        JButton b  = new JButton("Click");
        b.setBounds(130,100,100, 40);


        //add button to frame
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);


    }

    //jbutton with an actiuon listener

    public static void buttonWithEvent () {
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95 ,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Hogwarts");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(400,400);
        f.setVisible(true);
    }

    //Example of Adding an image to a buttomn
    public static void buttonWithImage  () {
        JFrame f = new JFrame("Example of a Button");
        JButton b = new JButton( new ImageIcon("C:\\Users\\allan.branson\\Projects\\Java_Javat_Point\\Image Files\\OIP (1).jpg"));

        b.setBounds(100,100,100,40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


