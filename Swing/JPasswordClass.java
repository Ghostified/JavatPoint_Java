package Swing;
/**
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class JPasswordClass {

    public static void main(String[] args) {
    passExample.passwordFieldExample();
        
    }
}

class passExample {

    public static void passwordFieldExample() {

        JFrame f = new JFrame("Password Field Example");
        JPasswordField values = new JPasswordField();
        JLabel labels = new JLabel("Password: ");
        labels.setBounds(20,100,80,30);
        values.setBounds(100,100,100,30);
        f.add(values);
        f.add(labels);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);


    }
    

}
