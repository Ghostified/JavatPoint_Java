package Swing;

import javax.swing.JFrame;

//Its used to create a toggle button , like on/off
public class JToggleButtons  extends JFrame implements ItemListener{

    public static void main(String[] args) {
        
    }

    private JToggleButton button ;
    JToggleButtons () {
        setTitle("JToggleButton with Item Listener Example ");
        setLayout (new FlowLayout());
        setJToggleButton ();
        setAction ();
        setSize (200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
