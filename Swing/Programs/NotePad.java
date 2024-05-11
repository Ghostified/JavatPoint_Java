package Swing.Programs;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NotePad implements ActionListener , MenuConstants{

    JFrame f;
    JTextArea ta;
    JLabel statusBar;

    //Constructor 
    NotePad () {
        f = new JFrame(fileName + "-" + applicationName);
        ta = new JTextArea(30,60);
        statusBar = new JLabel("|| ln 1 , col 1" , JLabel.RIGHT);

        //Setting up the main window
        f.add (new JScrollPane(ta), BorderLayout.CENTER);
        f.add (statusBar, BorderLayout.SOUTH);
        f.add( new JLabel(" "), BorderLayout.EAST);
        f.add( new JLabel(" "), BorderLayout.WEST);

        createMenuBar(f);
        f.pack();
        f.setLocation(150, 50);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //Listener to handle window close operations
        ta.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate (DocumentEvent e ) {fileHandler.saved = false; }
            public void removeUpdate (DocumentEvent e) {fileHandler.saved = false; }
            public void insertUpdate (DocumentEvent e) {fileHandler.saved = false;}
        });

    }
}

class FileOperations{

}

interface MenuConstants{

}
