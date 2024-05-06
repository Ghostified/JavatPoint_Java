package Swing;

import javax.swing.JFileChooser;

/*
 * The JFileChooser component is used to build GUI with lots of components 
 */
public class FileChooser {
    public static void main(String[] args) {
        //new HelloWorld();
        new HelloWorld2();
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