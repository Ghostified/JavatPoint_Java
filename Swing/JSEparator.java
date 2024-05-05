package Swing;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
/*
 * Provides a general component for implementing didvide lines
 * Used to draw a line to separate widgets in a layout
 */
public class JSEparator {

    public static void main(String[] args) {
       separatorExample();
       example2();
    }

    public static void separatorExample() {
        JMenu  menu = new JMenu("Menu");
        JMenu subMenu = new JMenu();
        JMenuItem i1,i2,i3,i4,i5;
        JFrame f = new JFrame("Separator Example");
        JMenuBar mb = new JMenuBar();
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem ("Item 2");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void example2() {
        JFrame f = new JFrame();
        f.setLayout( new GridLayout(0,1));
        JLabel l1 = new JLabel("Above Separator");
        f.add(l1);
        JSeparator sep = new JSeparator();
        f.add(sep);
        JLabel l2 = new JLabel("Below Separator");
        f.add(l2);
        f.setSize(400,100);
        f.setVisible(true);
    }
}
