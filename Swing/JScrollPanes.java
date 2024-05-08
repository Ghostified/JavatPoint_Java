package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * Useed to make a scrollable view of a component
 */
public class JScrollPanes {
    private static final long serialVersionUID = 1L ; 

    private static void createAndShowGUI () {

        //Create and Set Up the Window 
        final JFrame myFrame = new JFrame("Pane with Scroll Example");

        //Display the window
        myFrame.setSize(500, 500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set Flow Layout on the pane
        myFrame.getContentPane().setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(20,20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        myFrame.getContentPane().add(scrollableTextArea);
        myFrame.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run (){
                createAndShowGUI();
            }
        });
    }

}
