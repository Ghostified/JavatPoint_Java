package Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/*
 * Any JComponent can utilize a tooltip with the setToolTipText () method
 * 
 * Example adding a tooltip to a password component
 */
public class ToolTip {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(ToolTip::createToolTip);
       
    }

    private static void createToolTip () {
        JFrame f = new JFrame("Tool Tip Methods");
        f.setSize(400,400);
        f.setLayout(new GridBagLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints constraintrs = new GridBagConstraints();
        constraintrs.insets = new Insets(10, 10,10, 10); //padding between components 

        //Create  apssword field and label
        JPasswordField value = new JPasswordField(20);
        //value.setBounds(100,100,100,30);
        value.setToolTipText("Enter your passowrd");
        JLabel l1 = new JLabel("Password: ");
        //l1.setBounds(20, 100, 80, 30);

        //Set GridBag constraints for compomnents
        constraintrs.gridx = 0;
        constraintrs.gridy = 0;
        f.add(l1, constraintrs);

        constraintrs.gridx = 1;
        f.add(value, constraintrs);


        //Add components to the Frame
        //f.add(value);
        //f.add(l1);

        //Centyer frame to the screen
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
    }
}
