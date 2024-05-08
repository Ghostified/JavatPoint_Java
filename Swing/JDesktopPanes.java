package Swing;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Container;

/*
 * Can be used to create multi document applications. 
 * A multi document application have many windows by making the JContentPane a child of the JDesstopPANE
 */
public class JDesktopPanes extends JFrame{
    public JDesktopPanes () {
        CustomDesktopPane desktopPane = new CustomDesktopPane ();
        Container contentPane =  getContentPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);
        desktopPane.display(desktopPane);

        setTitle("JDesktop Pane Example ");
        setSize (300,350);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JDesktopPanes();
    }

}

class CustomDesktopPane extends JDesktopPane {
    int numFrames = 3, x =30, y =30;
    public void display(CustomDesktopPane dp ) {
        for (int i = 0; i < numFrames; i++)
        {
            JInternalFrame jframe = new JInternalFrame("Internal Frame" + i, true, true, true, true);
            jframe.setBounds(x,y, 250, 85);
            Container c1 = jframe.getContentPane();
            c1.add(new JLabel("I love coding"));
            dp.add(jframe);
            jframe.setVisible(true);
            y+= 85;
        }
    }
}
