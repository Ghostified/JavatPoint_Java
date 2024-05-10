package Swing.Programs;
/*
 * simple notepad using swing
 */

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class EditMenuForNotePad {

    private JFrame frame;
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private File currentFile;

    /*
     * Constructor to initialize GUI Components
     */

    public EditMenuForNotePad  (){
        //set up frame
        frame = new JFrame("Simple Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        //Create the text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); //Add scrool bar to the text area
        frame.add (scrollPane, BorderLayout.CENTER); //Add scroll pane instead of text area to handle scrolling

        //Initialize FileChooser
        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a File");

        //Set Up Menu
        setupMenu ();

        //Set the frames location relative to screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //set up the menu bar with file, edit and Help Menus
    private void setupMenu () {
        JMenuBar menuBar = new JMenuBar();

        
        

        //Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu ("Edit");
        JMenu helpMenu = new JMenu("Help");

        //Create and add menu items to the Edit Menu with lamda expresions for action Listeners
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(e -> textArea.cut());
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(e -> textArea.copy());
        JMenuItem pasteItem = new JMenuItem("Paste");
        copyItem.addActionListener(e -> textArea.paste());
        JMenuItem selectAllItem = new JMenuItem("SelectAll");
        selectAllItem.addActionListener(e -> textArea.selectAll());

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectAllItem);

        //Add File items and its operations
        JMenuItem newItem = new JMenuItem("New File");
        JMenuItem saveItem = new JMenuItem("Save File");
        JMenuItem saveAsItem = new JMenuItem(" Save As");

        //File Menu Items Actions
        newItem.addActionListener( e -> {
            textArea.setText("");
            currentFile = null;
        });
        saveAsItem.addActionListener(e -> saveFileAS());
        saveItem.addActionListener(e -> saveFile());

        //Add File Menu items
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);

        //Add menu to the menu bar 
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        //set Menu Bar on the frame
        frame.setJMenuBar(menuBar);
    }

    //Method to save the document to the current file or promopts for the file location if null
    private void saveFile () {
        if (currentFile == null) {
            saveFileAs();
        } else {
            writeFile (currentFile);
        }
    }

    //Method that prompts the user tp choose a file path and saves the document to the desired location
    private void saveFileAS () {
        if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
            writeFile(fileChooser.getSelectedFile());
        }
    }

    /*
     * Method to write the content of the  text area to the specified file
     * @param file the file to write to
     */

    private void writeFile ( File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(textArea.getText());
            currentFile = file; //Update the current file reference 

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,"File Could Not Be Saved" ,"Error",JOptionPane.ERROR_MESSAGE);
        } 
     }

    //main method 
    public static void main(String[] args) {
        //Ensure the GUI is created on the Event dispatch Thread for thread safety
        SwingUtilities.invokeLater(EditMenuForNotePad:: new );
    }
}
