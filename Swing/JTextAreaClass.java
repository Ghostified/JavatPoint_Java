package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaClass {
    public static void main(String[] args) {
       //jTextAreaExample(); 
       new TextAreaExample();
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

class TextAreaExample  implements ActionListener {
    JLabel l1, l2;
    JTextArea area;
    JButton b ;
    TextAreaExample () {

        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        area = new JTextArea();
        area.setBounds(20,75,250,200);
        b = new JButton("Count Words");
        b.setBounds(100,300,120,30);
        b.addActionListener((ActionListener) this);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words [] = text.split("\\s");
        l1.setText("words: " + words.length);
        l2.setText("Characters: " + text.length());
    }
}
