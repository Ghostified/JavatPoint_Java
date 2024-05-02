package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.event.*;

/*
 * Used to add a vertical or Horizontal Scroll Bar 
 */
public class ScrollBar {

    public static void main(String[] args) {
       scrollBar(); 
       scrollBarExample2();
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

    //Scrollbar with adjustment Listener
    public static void scrollBarExample2 () {
        JFrame f = new JFrame("Scoll bar with Adjustments");
        final JLabel b = new JLabel();
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setSize(400,100);
        final JScrollBar s = new JScrollBar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                b.setText("Vertical ScrollBar Value is: " + s.getValue());
            }
        });

    }
}

