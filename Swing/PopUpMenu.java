package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/*
 * A p[op up menu can be dynamically popped up at a specifc point with a component
 */
public class PopUpMenu {
    public static void main(String[] args) {
        new PopUpMenuExample();
        new PopUpMenuExample2();
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
//JPopUPmenu with Mouse Listener and ActionListener
 class PopUpMenuExample2 {
    PopUpMenuExample2 () {
        final JFrame  f = new JFrame(" pop Up Menu Example with Events");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        final JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem selectAll = new JMenuItem("Select All");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);
        popupMenu.add(selectAll);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(f, e.getX(),e.getY());
            }
        });

        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Cut MenuItem Clicked");
            }
        });

        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Copy MenuItem Clicked");
            }
        });

        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("Paste Item Clicked");
            }
        });

        selectAll.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                label.setText("Select All MenuItem Clicked");
            }
        });

        f.add(label);
        f.add(popupMenu);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
 }