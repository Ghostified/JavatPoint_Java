package Swing;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * The setIconImage is used to set the icon on a JFrame
 */
public class TitleBarIcon {

    TitleBarIcon () {
        //Create a JFrame which is a Swing Container that provides window features
        Frame f = new Frame();

        //Set a relative path or resource url instread of an absolute path
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/download.jpg"));
        f.setIconImage(icon);

        //Set Default Close Operaion
        //((JFrame) f).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set Layout manager
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
     static void example11() {
        JFrame f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/allan.branson/Downloads/download.jpg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TitleBarIcon();
        example11();
    }
}
