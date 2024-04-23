package Swing;
import javax.swing.*;
/*
 * Used to create a pop up menu with choices
 */
public class JComboBoxClass {

    public static void main (String [] Args) {

        comboBoxExample();

    }

    public static void comboBoxExample () {
        JFrame f = new JFrame("ComboBox Example");
        String school [] = {"Beauxbatton","Salem", "Hogwarts", "Durmastrang"};
        JComboBox cb = new JComboBox (school);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
