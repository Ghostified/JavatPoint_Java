package Swing;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

//JColorChooser is use to crate a color chooser dialog box so that a user can select any color
public class ColorChooser {

    public static void main(String[] args) {
        //Example one
        ColorChooserExample ch = new ColorChooserExample();
        ch.setSize(400,400);
        ch.setVisible(true);
        
    }
}

class ColorChooserExample extends JFrame implements ActionListener {
    JButton b ;
    Container c;
    ColorChooserExample ()  {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton ("Color");
        b.addActionListener(this);
        c.add(b);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent e) {
        Color initialColor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialColor);
        c.setBackground(color);
    }
}