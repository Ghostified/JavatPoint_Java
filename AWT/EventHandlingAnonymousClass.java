package AWT;
import java.awt.*;
import java.awt.event.ActionListener;

public class EventHandlingAnonymousClass extends Frame {

    TextField tf ;
    
    EventHandlingAnonymousClass () {
        tf = new TextField ();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Here");
        b.setBounds(50,120,80,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed () {
                tf.setText("Hello");
            }
        });

        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new EventHandlingAnonymousClass();
    }
}
