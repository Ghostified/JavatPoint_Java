package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * JSpinner class is asingle object used to select a number of Objects from an ordered sequence
 */
public class JSpinners {

    public static void main(String[] args) {
       new SpinnerExample();
       new JSpinnerWithChangeListener();
        
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
//JSpinner with ChangeListener  example
class JSpinnerWithChangeListener {
    JSpinnerWithChangeListener () {
        JFrame f = new JFrame("Spinner Example with Change Listener");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250, 100);

        SpinnerModel value = 
            new SpinnerNumberModel(
                0, //initial value
                0, //Minimum value
                50, //Maximum value
                10 //Steps
            );
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.add(label);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value: " + ((JSpinner) e.getSource()).getValue());
            }
        }); 
    }
}