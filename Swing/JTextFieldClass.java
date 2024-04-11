package Swing;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * The JTextfield is a text component that allows the editing of a single line text
 */
public class JTextFieldClass {

    public static void main(String[] args) {
        textFieldExample();
        
    }

    public static void textFieldExample () {
        JFrame f = new JFrame("TextFied Example");
        JTextField t1, t2;
        t1 = new JTextField("Welcome to Hogwarts");
        t1.setBounds(50,100,200,30);
        t2 = new JTextField("Welcome to Griffindor");
        t2.setBounds(50,150,200,30);
       // Font f = new Font(f);

       f.add(t1);
       f.add(t2);

       f.setSize(400,400);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
      
    }
}
