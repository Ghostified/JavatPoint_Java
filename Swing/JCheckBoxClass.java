package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * JcheckBox is usee to create a checkbox
 */
public class JCheckBoxClass {

    public static void main(String[] args) {
      JCheckBoxClassExample.checkBox1();
      CheckboxExampleTwo.checkboxWithItemListener();
      new CheckboxExampleThree();
        
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


//JcheckBox Food Order Example

 class CheckboxExampleThree  extends JFrame implements ActionListener{

    JLabel label;
    JCheckBox cb1, cb2, cb3;
    JButton b;

     CheckboxExampleThree () {
        label = new JLabel("Food Ordering System");
        label.setBounds(50,50,300,20);
        cb1 = new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);
        cb2 = new JCheckBox("Burger @ 30");
        cb2.setBounds(100,150,150,20);
        cb3 = new JCheckBox("Tea @ 10");
        cb3.setBounds(100, 200, 150,20);
        b =new JButton("Order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);
        add(label);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = " ";
        if (cb1.isSelected()){
            amount += 100;
            msg = "Pizza: 100 \n" ;
        }

        if (cb2.isSelected()) {
            amount += 30;
            msg = "Burger: 30 \n";
        }
        if (cb3.isSelected()) {
            amount += 10 ;
            msg = "Tea: 10 \n";
        }

        msg += "------------\n";
        JOptionPane.showMessageDialog(this,msg + "Total: " + amount );
    }
}
