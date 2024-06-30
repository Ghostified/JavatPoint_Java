package JavaPrograms;
/*
 * Repeat code sequentially
 */

import javax.swing.JOptionPane;

public class ObtainAndAddFiveNumbers {

    public static void main(String[] args) {
        String numberStr;
        double number, total =0;


        numberStr = JOptionPane.showInputDialog("Enter a Number: ");
        number = Double.parseDouble(numberStr);
        total += number;

        numberStr = JOptionPane.showInputDialog("Enter a number: ");
        number = Double.parseDouble(numberStr);
        total = total + number;
        
        numberStr = JOptionPane.showInputDialog(numberStr);
        number = Double.parseDouble(numberStr);
        total = total + number;

        numberStr = JOptionPane.showInputDialog("Enter a number: ");
        number = Double.parseDouble(numberStr);
        total = total + number;

        numberStr = JOptionPane.showInputDialog("Enter a number: ");
        number = Double.parseDouble(numberStr);
        total = total + number;

        JOptionPane.showMessageDialog(null, "The Total is: " + total);

        System.exit(0);
    }

}
