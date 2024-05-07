package Swing;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.*;
import java.awt.event.*;


/*
 * The JFileChooser component is used to build GUI with lots of components 
 */
public class FileChooser {
    public static void main(String[] args) {
        // new HelloWorld();
        // new HelloWorld2();
        // new HelloWorld3();
        // new Hello();
        // new Hello2();
        // new Hello3();
        // new Hello4 ();
        // new Hello5();
        new JFileChooserMethods();
    }

}

//JFileChooser () constructor  - 
//It constructs a JFileChooser highlighting the clients default directory

class HelloWorld {
    HelloWorld () {
        //Creating an object of the JFileChooser Class
        JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called
        jf.showSaveDialog(null);
    }
}

// JFileChooser (File CurrentDirectory)
// Constructs  a  JFilechooser involving the given file as the way
//Example 

class HelloWorld2 {
    HelloWorld2() {
        //Creating the object to the JFileChooser
        JFileChooser jf = new JFileChooser("C:"); //paarametized constructor, the current directory is called
        jf.showSaveDialog(null); //opening the saved dialog
    }
}

/*
 * JFileChooser (File currentDirectory , FileSystemViewfsv)
 * Constructs a JFileChooser utilizing the given current catalog and FileSystemView
 * Example
 */

 class HelloWorld3 {
    HelloWorld3 () {
        //Creating an obk=ject of the JFileChooser Class
        JFileChooser jf = new JFileChooser("C:", FileSystemView.getFileSystemView()); //Parametized constructor
        jf.showSaveDialog(null);
    }
 }

 /*
  * JFileChooser constructor with the given file system view
  */

  class Hello {
    Hello () {
        JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());
        jf.showSaveDialog(null);
    }
  }

  /*
   * JFileChoose (String currentDirectoryPath)
   * Constructs a JFileChooser using the given way/path?
   */

   class Hello2{
    Hello2 () {
        JFileChooser jf = new  JFileChooser ("C:/Users/allan.branson/Projects");
        jf.showSaveDialog(null);
    }
   }

   /*
    * JFileChooser(String directoryPath , FileSystemView)
    */

    class Hello3 {
        Hello3 () {
            // Creating a JFileChooser parametized constructor with : JFileChooser(String directoryPath , FileSystemView)
            JFileChooser jf = new JFileChooser("C:/Users/allan.branson/Projects", FileSystemView.getFileSystemView());
            jf.showSaveDialog(null); // opening the saved dialogue
        }
    }

    //JfileChooser (File) filr constructor 
class Hello4 {
    Hello4 () {
        JFileChooser jf = new JFileChooser( new File("C:/Users"));
        jf.showOpenDialog(null);
    }
}

//JFileChooser File constructor with File System View

class Hello5 {
    Hello5() {
        File f = new File ("C:/Users");
        JFileChooser jf = new JFileChooser(f, FileSystemView.getFileSystemView());
    }
}

//JFileChooser Methods 

class JFileChooserMethods extends JFrame implements ActionListener {

    //Declaring a Jlabel to shopw the files which are selected by users
    static JLabel label;

    //DefaultConstructor
    JFileChooserMethods () {
    }

    public static void fileChooserMethods () {
        //Creating an object of the JFrame Class and giving it the name of Frame
        JFrame frame = new JFrame();

        //Creating size of the Frame
        frame.setSize(400,400);

        //Giving the frame visisbility
        frame.setVisible(true);

        //Closing the Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a JButton to save the dialog
        JButton b1 = new JButton("Save Dialog");

        //Creating a button to open the dialog
        JButton b2 = new JButton("Open Dialog");

        //Creating an Object of the Currnet Class
        JFileChooserMethods f1 = new JFileChooserMethods();

        //Using the ction Listener to capture the response of the user using buttons
        b1.addActionListener(f1);
        b2.addActionListener(f1);

        //Creating a panel to add buttons and components
        JPanel p = new JPanel();

        //Adding buttons to panel
        p.add(b1);
        p.add(b2);

        //Set the label to the initial value
        label = new JLabel("No file Selected");

        //Adding the panel to the fRAME 
        p.add(label);
        frame.add(p);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //If the client presses the save button , show the save dialog
        String com = e.getActionCommand();

        if (com.equals("Save")) {
            //Creating an object to the JFileChooser class
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());

            //calling the showSaveDialog method to display the save dialog on the Frame
            int r = jf.showSaveDialog(null);

            //If the user selects a file
            if (r == JFileChooser.APPROVE_OPTION)

            {
                //setting the label as the path of the selected file
                label.setText(jf.getSelectedFile().getAbsolutePath());
            }

            //If the user canceled the operation
            else 
            label.setText("The user cancelled the operation");
        }

        //if the user presses the open dialog, show the open dilog

        else {
            //create an object of JFileChooser class
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());

            //Calling the showOpenDialog method to dispay the save dialog on the frame
            int r = jf.showOpenDialog(null);

            //if the users select a file
            if (r == JFileChooser.APPROVE_OPTION)

            {
                //Setting the label as path of the selected file
                label.setText(jf.getSelectedFile().getAbsolutePath());
            }

            //If the user canceled the operation
            else 
            label.setText("The user cancelled the operation");
        }
    }
}