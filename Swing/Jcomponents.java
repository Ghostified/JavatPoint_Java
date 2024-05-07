package Swing;
/*
 * Its the base class of all swing components except JFrame and JButton
 */

import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyJComponent extends JComponent {
    public void paint (Graphics g) {
        g.setColor (Color.green);
        g.fillRect(30,30,100,100);
    }
 }
public class Jcomponents {
    public static void main(String[] args) {
        MyJComponent com = new MyJComponent();
        //Create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);
    }

}
