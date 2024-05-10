package Swing.Programs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class OpenMenu  extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu file;
    JMenuItem open;
    JTextArea textArea; 


    OpenMenu () {
        open = new JMenuItem("Open File");
        open.addActionListener(this);

        file = new JMenu("File");
        file.add(open);


        menuBar = new JMenuBar();
        menuBar.setBounds(0,0,800,20);
        menuBar.add(file);

        textArea = new JTextArea(800,800);
        textArea.setBounds(0,20,800,800);

        add(menuBar);
        add(textArea);
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == open) {
            openFile();
        }
    }

    void openFile () {
        JFileChooser fileChooser = new JFileChooser();
        int i = fileChooser.showOpenDialog(this);

        if (i == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            String filePath = f.getPath();

            displayContent(filePath);
        }
    }

    void displayContent (String fpath) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(fpath));
            String s1 = " ", s2 = "";

            while ((s1 = bReader.readLine()) != null) {
                s2 += s1 + "\n";
            }
            textArea.setText(s2);
            bReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public static void main(String[] args) {
        OpenMenu openMenu = new OpenMenu();
        openMenu.setSize(800,800);
        openMenu.setLayout(new FlowLayout());
        openMenu.setVisible(true);
        openMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
