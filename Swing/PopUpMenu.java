package Swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/*
 * A p[op up menu can be dynamically popped up at a specifc point with a component
 */
public class PopUpMenu {
    public static void main(String[] args) {
        new PopUpMenuExample();
    }

}
//Example1
class PopUpMenuExample {
    PopUpMenuExample () {
        final JFrame f = new JFrame ("Pop Up Menu Example");
        final JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem copy = new JMenuItem("Copy");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                popupMenu.show(f,e.getX() , e.getY());
            }
        });
        f.add(popupMenu);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
