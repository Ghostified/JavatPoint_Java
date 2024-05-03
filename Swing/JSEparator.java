package Swing;
import java.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/*
 * Provides a general component for implementing didvide lines
 * Used to draw a line to separate widgets in a layout
 */
public class JSEparator {

    public static void main(String[] args) {
        separatorExample();
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
}
