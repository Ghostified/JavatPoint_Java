package Swing;

import javax.swing.JFileChooser;

/*
 * The JFileChooser component is used to build GUI with lots of components 
 */
public class FileChooser {
    public static void main(String[] args) {
        new HelloWorld();
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