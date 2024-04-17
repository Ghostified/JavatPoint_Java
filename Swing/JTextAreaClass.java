package Swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaClass {
    public static void main(String[] args) {
       jTextAreaExample(); 
    }

    public static void jTextAreaExample () {

        JFrame f = new JFrame () ;
        JTextArea jtx = new JTextArea("Welcome to Hogwarts");
        jtx.setBounds(10,30,200,200);
        f.add(jtx);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

}
//JtextArea with an event listener
