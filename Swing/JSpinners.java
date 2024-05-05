package Swing;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/*
 * JSpinner class is asingle object used to select a number of Objects from an ordered sequence
 */
public class JSpinners {

    public static void main(String[] args) {
        new SpinnerExample();
        
    }
}
 class SpinnerExample {
    SpinnerExample () {
        JFrame f = new JFrame("Spinner Example");
        SpinnerModel value = 
            new SpinnerNumberModel( 5, //Innitial Value
            0, //Minimun value
            10, //Maximum value
            1 //Steps
            );
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
 }
