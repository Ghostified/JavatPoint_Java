package AWT;

import java.awt.Button;
import java.awt.Frame;

/*
 * To perform a button action, the ActionListener must be implemented by calling the addActionListener method
 */
public class AWTButton {

    public static void main(String[] args) {
        example1();
        
    }

    //AWT button Example 1
     public static void example1 () {

        //Create an instance of the Frame with the label
        Frame f = new Frame();

        //Create a button with label
        Button b = new Button("Click Here");

        //set position of the button in the Frame

        //Set Position of the button in the Frame
        b.setBounds(50,100,80,30);

        //add button 
        f.add(b);

        //set size, layout and visibility of frame

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setName("Example One");
     }
}
