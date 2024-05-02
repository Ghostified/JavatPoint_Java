package Swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Used to provide =starndard dialog boxes
 */
public class JavaJOptionPane{
    public static void main(String[] args) {
        //jOptionPaneExample1();
        //jOptionPaneExample2();
        //jOptionPaneExample3();
        ShowConfirmDialog1.jOptionPaneExample4 ();    
        
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

 class ShowConfirmDialog1 extends WindowAdapter {

    //JOption Pane showConfirmDialog () 
    //Used to create dialog with option yes, No, and cancel. Tith title -> Select an Option
  
    private static JFrame f;

    public static void jOptionPaneExample4 () {
        f = new JFrame();
        f.addWindowListener(new ShowConfirmDialog1 ());
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true); 
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f,"Are you sure? ");
        if (a == JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

}
