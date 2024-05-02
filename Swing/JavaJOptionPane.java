package Swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Used to provide =starndard dialog boxes
 */
  
        
    }

    public static void jOptionPaneExample1 () {

        //Show Message Dialog

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog( f, "Hello Welcome");
    }

    public static void jOptionPaneExample2 () {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Successful Update." , "Alert",JOptionPane.WARNING_MESSAGE);
    }

    //Show InputDialog
    //Used to show a question -message dialog requesting input from user parented to parent component

    public static void jOptionPaneExample3 () {
        JFrame f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "Enter your name");
    }

}


