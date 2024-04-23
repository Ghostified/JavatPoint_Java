package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * Is used to create a Radio Button
 */
public class JRadioButtonClass {

    public static void main(String[] args) {
       // new RadioButtonExample();
       new RadioButtonExample2();
    }
}
class RadioButtonExample {
        JFrame f;
        RadioButtonExample () {
            f = new JFrame();
            JRadioButton r1 = new JRadioButton("A) Male");
            JRadioButton r2 = new JRadioButton("B) Female");
            r1.setBounds(75,50,100,30);
            r2.setBounds(75,100,100,30);
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);
            bg.add(r2);
            f.add(r1);
            f.add(r2);
            f.setSize(300,300);
            f.setLayout(null);
            f.setVisible(true);

        }

}

//RadioButton with Action Listener
 
class RadioButtonExample2 extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton b;
    RadioButtonExample2 () {
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100,50,100,30);
        
        rb2 = new JRadioButton("Female");
        rb2.setBounds(100,150,80,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        b = new JButton("Click");
        b.setBounds(100,150,80,30);

        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e ) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this,"You are Male");
        }
        if (rb2.isSelected() ) {
            JOptionPane.showMessageDialog(this, "You are Female");
        }
    }
}