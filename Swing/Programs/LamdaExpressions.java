package Swing.Programs;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * Reduces boilerplate code
 * used to pass functions as methods 
 */
public class LamdaExpressions {
    public static void main(String[] args) {
        //Create  the main Frame 
        JFrame frame = new JFrame("Lamda Expressions example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLayout(new FlowLayout());

        //Create a text Area
        JTextArea textArea = new JTextArea("Click a Button...", 3, 20 );
        textArea.setEditable(false);

        //Create a button to change the text area
        JButton changeTextButton = new JButton("Change Text");
        //Single parameter lambda : e is the action event passed by button click
        changeTextButton.addActionListener(e -> textArea.setText("Hello Lambda Expression..."));


        //Create a button to show a Dialog Box
        JButton showDialogButton = new JButton("Show Dialog");
        //multiple parameters lamda : here we show multiple parameters using the textArea text
        showDialogButton.addActionListener( e -> {
            String info = "Text Area Says: " + textArea.getText();
            JOptionPane.showMessageDialog(frame, info, "Dialog", JOptionPane.INFORMATION_MESSAGE);
        });

        //add components to the frame
        frame.add(textArea);
        frame.add(changeTextButton);
        frame.add(showDialogButton);

        //Set the frame visibility
        frame.setVisible(true);
    }

}
