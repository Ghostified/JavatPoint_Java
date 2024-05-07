package Swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

//Its used to create a toggle button , like on/off
public class JToggleButtons  extends JFrame implements ItemListener{

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new JToggleButtons();
            }
        });
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

    private void setJToggleButton () {

        //Initialize the toggle Button  with the Text "ON"
        button = new JToggleButton("ON");

        //Add the Toggle Button to the Frame
        add(button);
    }

    private void setAction () {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected())
            button.setText("OFF");
        else 
            button.setText("ON");
    }
}
