package Swing;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;

//JColorChooser is use to crate a color chooser dialog box so that a user can select any color
public class ColorChooser {

    public static void main(String[] args) {
        //Example one
        ColorChooserExample ch = new ColorChooserExample();
        ch.setSize(400,400);
        ch.setVisible(true);

        //Example two
        new ColorChooserExample2();
        
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

//Color chooser with ActionListener Example

class ColorChooserExample2 extends JFrame implements ActionListener {
    JFrame f;
    JButton b;
    JTextArea ta;
    ColorChooserExample2 () {
        f = new JFrame("Color Chooser Example with Action Listener");
        b = new JButton("Pad Color");
        b.setBounds(200,250,100,30);
        ta = new JTextArea();
        ta.setBounds(10,10,300,200);
        b.addActionListener(this);
        f.add(b);
        f.add(ta);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose", Color.CYAN);
        ta.setBackground(c);
    }
}