package Swing;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

/*
 * Used to add a vertical or Horizontal Scroll Bar 
 */
public class ScrollBar {

    public static void main(String[] args) {
       scrollBar(); 
    }

    //Scroll Bar Example 
    public static void scrollBar() {
        JFrame f = new JFrame("Scroll Bar Example");
        JScrollBar s = new JScrollBar();
        s.setBounds(11,100,50,100);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

