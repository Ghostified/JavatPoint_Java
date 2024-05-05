package Swing;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/*
 * JProgresss Bar class is used to display the progress of the task
 */

public class ProgressBar extends JFrame {
    
        JProgressBar jb;
        int i = 0;
        int num =0;

        ProgressBar () {
        jb = new JProgressBar(0,2000);
        jb. setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add (jb);
        setLayout(null);
        setSize(250,150);
        }

        public void iterate() {
            while (i < 2000){
                jb.setValue(i);
                i = i + 20;
                try {Thread.sleep(150);} 
                catch (Exception e) {}
            }

    }

    
    public static void main(String[] args) {
        ProgressBar m = new ProgressBar();
        m.setVisible(true);
        m.iterate();
        
    }
}
