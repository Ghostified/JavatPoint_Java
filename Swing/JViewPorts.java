package Swing;
/*
 * Is used to implement Scrolling
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class JViewPorts {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Label");
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane pane = new JScrollPane(label);

        JButton button = new JButton();
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setViewportBorder(new LineBorder(Color.BLUE));
        pane.getViewport().add(button, null);

        frame.add(pane,BorderLayout.CENTER);
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}
