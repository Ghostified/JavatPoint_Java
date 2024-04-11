package AWT;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;

import ControlStatements.override;


public class EventHandlingAnonymousClass extends Frame {

   private  TextField tf ;
    
    public EventHandlingAnonymousClass () {
        tf = new TextField ();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Here");
        b.setBounds(50,120,80,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent  e) {
                tf.setText("Hello");
            }
        });

        add(b);
        add(tf);
        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);

    }

    public static void main(String[] args) {
        new EventHandlingAnonymousClass();
    }
}
