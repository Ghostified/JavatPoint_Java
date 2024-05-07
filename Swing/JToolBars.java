package Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

/*
 * JToolBar allows grouping of other components
 * Used to diaplay commonly used controlled actions
 */
public class JToolBars {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JToolBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar toolBar = new JToolBar();
        toolBar.setRollover(true);
        JButton button = new JButton("File");
        toolBar.add(button);
        toolBar.addSeparator();
        toolBar.add(new JButton("Edit"));
        toolBar.add(new JComboBox<>( new String [] {"Opt 1", "Opt 2", "Opt 3", "Opt 4"}));
        Container contentPane =  frame.getContentPane();
        contentPane.add(toolBar,BorderLayout.NORTH);
        JTextArea ta = new JTextArea();
        JScrollPane myPane = new JScrollPane(ta);
        contentPane.add(myPane, BorderLayout.EAST);
        frame.setSize(450,250);
        frame.setVisible(true);
    }
}
