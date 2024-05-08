package Swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/*
 * Is a subcalss of JEditorPane
 * It is used for styled Document with Embedded Images and components
 * 
 */
public class JTextPanes {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTextPanes:: createAndShowGUI);
    }

    private static void createAndShowGUI () {
        try {
            JFrame myFrame = new JFrame("JTextPane Example");
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextPane pane = new JTextPane();
            SimpleAttributeSet attributeSet = new SimpleAttributeSet();
            StyleConstants.setBold(attributeSet, true);

            //Set Attributes before adding text
            pane.setCharacterAttributes(attributeSet, true);
            pane.setText("Welcome to Hogwarts");

            attributeSet =  new SimpleAttributeSet();
            StyleConstants.setItalic(attributeSet, true);
            StyleConstants.setForeground(attributeSet, Color.RED);
            StyleConstants.setBackground(attributeSet, Color. BLUE);


            Document doc = pane.getStyledDocument();
            doc.insertString(doc.getLength(), " The School of Magic", attributeSet);

            attributeSet = new SimpleAttributeSet();
            doc.insertString(doc.getLength(), " There are Four Major Houses", attributeSet);

            JScrollPane scrollPane = new JScrollPane(pane);
            myFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);

            myFrame.setShape(null);
            myFrame.setSize(400,400);
            myFrame.setVisible(true);

        } catch (BadLocationException e ){
            e.printStackTrace();
        }
    }
}
