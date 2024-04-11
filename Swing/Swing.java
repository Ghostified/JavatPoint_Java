package Swing;
import javax.swing.*;

import javax.swing.JButton;

public class Swing {

    public static void main(String[] args) {

        swingExample1();
        
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
}
