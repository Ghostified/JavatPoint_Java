package Swing;
import javax.swing.*;
import java.awt.event.*;
/*
 * Used to create a pop up menu with choices
 */
public class JComboBoxClass {

    public static void main (String [] Args) {

        //comboBoxExample();
        JComboBoxExample2.jComboBoxWithActionListener();

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

//JComboBox with Action Listener
class JComboBoxExample2 {
    public static void jComboBoxWithActionListener () {

        JFrame f = new JFrame("ComboBox Example ");
        JLabel jl = new JLabel();
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setSize(400,100);
        JButton jb = new  JButton("Show");
        jb.setBounds(200,100,75,20);
        String [] languages = {"PHP", "JAVA", "PYTHON", "Flutter","Koylin"};
        final JComboBox cb = new JComboBox<>(languages);
        cb.setBounds(50,100,90,20);
        f.add(cb);
        f.add(jb);
        f.add(jl);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        jb.addActionListener(new ActionListener  (){
            public void actionPerformed(ActionEvent e) {
                String data = "Programming Language Selected: "
            + cb.getItemAt(cb.getSelectedIndex());
            jl.setText(data);
            }
        });
    }
}
