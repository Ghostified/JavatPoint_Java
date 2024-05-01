package Swing;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JavaJList {
    public static void main(String[] args) {
        jlistExample1();
        
    }

    public static void jlistExample1 () {
        JFrame f = new JFrame();
        DefaultListModel <String> l1 = new DefaultListModel<>();
        l1.addElement ("Item 1");
        l1.addElement("Item 2");
        l1.addElement("Element 3");
        JList <String> list = new JList<>(l1);
        list.setBounds(100,100,75,75);
        f.add(list);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
