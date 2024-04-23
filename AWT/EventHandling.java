package AWT;
import java.awt.*;
import java.awt.event.*;

  

/*
 * Changing the state of an object - event e.g dragging a mouse
 * Example - adding an Action istener
 */
public class EventHandling {
    public static void main(String[] args) {

        AEvent obj = new AEvent();
        
    }

}
class AEvent extends Frame implements ActionListener {
    TextField tf;

    AEvent () {
        //Create components 
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Me");
        b.setBounds(100,120,80,30);

        //register Listener
        b.addActionListener(this);

        //Add components and set layout, size and visibility
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e) {
        tf.setText("Welcome");
    }
}
