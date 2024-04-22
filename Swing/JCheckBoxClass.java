package Swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * JcheckBox is usee to create a checkbox
 */
public class JCheckBoxClass {

    public static void main(String[] args) {
      //  JCheckBoxClassExample.checkBox1();
      CheckboxExampleTwo.checkboxWithItemListener();
        
    }
}

class JCheckBoxClassExample {
    public static void checkBox1 () {
        JFrame f = new JFrame("New CheckBox Example");
        JCheckBox checkbox = new JCheckBox("C++");
        checkbox.setBounds(100,100,50,50);
        JCheckBox checkbox2 = new JCheckBox("Java  ", true);
        checkbox2.setBounds(100, 150, 50, 50);
        f.add(checkbox);
        f.add(checkbox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}

//Checkbox with an ItemListener
class CheckboxExampleTwo {
    public static void checkboxWithItemListener () {
        JFrame f = new JFrame("CheckBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JCheckBox checkbox1 = new JCheckBox("c++");
        checkbox1.setBounds(150,100,50,50);
        JCheckBox checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(150,150,50,50);
        f.add(label);
        f.add(checkbox1);
        f.add(checkBox2);
        checkbox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: "
                + (e.getStateChange() == 1?"checked " : "Unchecked"));
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox: " 
                + (e.getStateChange() == 1? "Checked" : "Unchecked"));
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
