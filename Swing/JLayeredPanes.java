package Swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

/*
 * JLayered pane is used to add depth to a swing container. 
 * Provides a third dimension for positioning copmponent and divide the depth range into several diffrent layers
 * 
 */
public class JLayeredPanes extends JFrame{
    public JLayeredPanes () {
        super ("LayeredPane Example");
        setSize (200,200);
        JLayeredPane pane = getLayeredPane ();

        //Creating buttons
        JButton top = new JButton();
        top.setBackground(Color.white);
        top.setBounds(20,20,50,50);
        JButton middle = new JButton();
        middle.setBackground(Color.RED);
        middle.setBounds(40,40,50,50);
        JButton bottom = new JButton();
        bottom.setBackground(Color.green);
        bottom.setBounds(60,60,50,50);
        //adding buttons on pane
        pane.add(bottom,new Integer(1));
        pane.add(middle,new Integer(2));
        pane.add(top,new Integer(3));
    }

    public static void main(String[] args) {
        JLayeredPanes panel = new JLayeredPanes();
        panel.setVisible(true);
    }

}
