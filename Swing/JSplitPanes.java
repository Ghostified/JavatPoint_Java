package Swing;
/*
 * Used to divide two components
 */

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class JSplitPanes {

    private static void showExample () {

    //Create and SetUp Window
    JFrame frame = new JFrame("JSplitPane Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,400);

    //Use a border layout to manage the layout of the Frame
    frame.getContentPane().setLayout( new BorderLayout());

    //Create Two combo boxes with options
    String [] option1 = {"A","B", "C", "D"};
    JComboBox <String> box1 = new JComboBox<>(option1);
    String [] option2 = {"1", "2", "3", "4"};
    JComboBox <String> box2 = new JComboBox<>(option2);

    //Create Two Panels and add the combo boxes 
    JPanel panel1 = new JPanel(); 
    panel1.add(box1);
    JPanel panel2 = new JPanel();
    panel2.add(box2);

    //Create a JSplit with Two Panels
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
    splitPane.setDividerLocation(150); //optionally set the divider position

    //Add JSplitPane to the Center of the frames Content Pane
    frame.getContentPane().add(splitPane, BorderLayout.CENTER);

    //Display the Frame
    frame.setVisible(true);

    }

    public static void main(String[] args) {
        //Schedule a job for an event dispatching thread
        //Creating and showing the GUI
        javax.swing.SwingUtilities.invokeLater(JSplitPanes::showExample);
    }
}
