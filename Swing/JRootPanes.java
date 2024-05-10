package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

/*
 * A lightweight container used behind the scenes by JFRames, JDialog, Jwindow , Japplet , Jinternalfram
 */
public class JRootPanes {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRootPane root = f.getRootPane();

        //Create a Menu Bar
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        bar.add(menu);
        menu.add("Open");
        menu.add ("In progress");
        menu.add("Close");
        root.setJMenuBar(bar);

        //Asdd a button to the content pane
        root.getContentPane().add(new JButton("Click Here"));

        //Display ui
        f.pack();
        f.setVisible(true);
    }
}
