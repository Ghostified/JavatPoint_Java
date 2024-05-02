package Swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * JMenuBar is used to display a menu bay on a window, it may have have several menus
 * The Object of JMenu class is a pull down menu displayed from the menu bar
 * JMenuItem class object adds a labeled muni item. 
 * Items used ina menu must belong to JMenuItem or its subclasses
 */
public class MenuItems {

    public static void main(String[] args) {
        menuItemExample();
    }

    /*
     * JMenuItem and JMenu Example
     */

     public static void menuItemExample() {

        JFrame f = new JFrame("Menu with Menu Items Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu();
        JMenu subMenu = new JMenu();
        JMenuItem item1 = new JMenuItem(); 
        JMenuItem item2 = new JMenuItem(); 
        JMenuItem item3 = new JMenuItem(); 
        JMenuItem item4 = new JMenuItem(); 
        JMenuItem item5 = new JMenuItem(); 
        JMenuItem item6 = new JMenuItem(); 


        
        menu = new JMenu("Menu");
        subMenu = new JMenu("Sub Menu");
        item1 = new JMenuItem("Griffindor");
        item2 = new JMenuItem("Ravenclaw");
        item3 = new JMenuItem("Huffle Puff");
        item4 = new JMenuItem("Slytherin ");
        item5 = new JMenuItem("Malfoy");
        item6 = new JMenuItem("Crabbe");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        subMenu.add(item5);
        subMenu.add(item6);

        menu.add(subMenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

     }
}
