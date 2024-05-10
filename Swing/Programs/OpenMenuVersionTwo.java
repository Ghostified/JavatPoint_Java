package Swing.Programs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.*;

import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//This program creates a GUi for displaying contents of a file 

public class OpenMenuVersionTwo  extends JFrame{
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public OpenMenuVersionTwo () {
        super ("Open File Example"); //sets this as the title of JFrame
        initializeComponents ();
        setUpLayout();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);
    }

    private void initializeComponents () {
        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open File");
        openItem.addActionListener(this::openFile);
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        //TextArea
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); //wrap text area in a ScrollPpane
        add(scrollPane, BorderLayout.CENTER); 

        //FileChooser
        fileChooser = new JFileChooser();
    }

    private void openFile (ActionEvent e) {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            displayContent(file.getAbsolutePath());
        }
    }

    private void displayContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            textArea.setText(builder.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read file",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setUpLayout () {
        //Set up layout manager for the content manager
        setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    //Main method 
    public static void main(String[] args) {
        //Ensure GUI is created on the Event thread for Thread Safety
        SwingUtilities.invokeLater(OpenMenuVersionTwo:: new);
    }

}
