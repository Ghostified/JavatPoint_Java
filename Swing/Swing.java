package Swing;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.*;

import javax.swing.JButton;

/*
 * JFrames can be created by extending the Frame class Inheritance 
 * By craeting an object of the Frame class (Association)
 */

public class Swing {

    public static void main(String[] args) {

        //swingExample1();
        buttonWithEvent();
        
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
}
