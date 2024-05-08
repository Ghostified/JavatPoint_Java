package Swing;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * Used to create a simple text editor window
 */
public class JEditorPanes {
    JFrame myFrame = null;

    public static void main(String[] args) {
        (new JEditorPanes()).test();
    }

    public void test () {

        //Initialize JFrame
        myFrame = new JFrame("JEditor Pane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);

        //create and configure the JEditor Pane
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("Mens Sana In cOrpore sano."
                    + "  I am loving this. "
                     + " Welcome to Hogwarts");

    
        //Add the JEditor to the JFRame using JScrollPane for Better userbility
        JScrollPane scrollPane = new JScrollPane(myPane);
        myFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        //Display the JFrame
        myFrame.setVisible(true);
    }

}
