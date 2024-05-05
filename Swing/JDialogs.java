package Swing;
/*
 * JDialog control represents a top lebvel window with border and title used to take some form of input from the user
 * 
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JDialogs {

    private static JDialog d;

    JDialogs() {
        JFrame f = new JFrame();
        d = new JDialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                JDialogs.d.setVisible(true);
            }
        });

        d.add(new JLabel("Click Button to Continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new JDialogs();
    }
}
