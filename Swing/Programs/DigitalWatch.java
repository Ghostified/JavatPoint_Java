package Swing.Programs;
/*
 * Simple Program to create a digital watch 
 */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DigitalWatch implements Runnable{

    JFrame frame;
    JButton displayTimeButton;
    Thread timThread = null;

    public DigitalWatch () {
        //Set up the Frame
        frame = new JFrame("Digital Watch ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout()); //For component management

        //setUp the button
        displayTimeButton = new JButton();
        displayTimeButton.setPreferredSize(new Dimension(200,100));
        frame.add(displayTimeButton);

        frame.setVisible(true);

        //start the thread
        timThread = new  Thread(this);
        timThread.start();
    }

    public void run () {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:  mm: ss : a ");
        while (timThread != null ) {
            try {
                //update the time
                Calendar cal = Calendar.getInstance();
                final String timeString = formatter.format(cal.getTime());

                //update the display in the EVent Dispatch Thread
                SwingUtilities.invokeLater( () -> displayTimeButton.setText(timeString));

                //Update interval
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); //Restore interrupted status
                return;
            } catch (Exception e) {
                e.printStackTrace();// print other exceptions
            }
        }
    }

    public static void main(String[] args) {
        //Initiate the GUI on the event dispatch thread
        SwingUtilities.invokeLater(DigitalWatch:: new );
    }
}
