import java.text.*;
import java.util.Scanner;
public class InvestmentEarningApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the buying price per share: ");
        double  buyingPrice = scan.nextDouble();

        //Track day of the buying
        int day = 1;
        //create an endless loop until the -ve input condition is met
        double closingPrice = 0.1; //sets closing price before the loop
        DecimalFormat df = new DecimalFormat("0.00");


        while (true) {
            System.out.println("Enter the closing price of the day " +
                    day + " ( any negative value to leave  the program");

            //handling the request by checking the closing price
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0)
                break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0) {
                System.out.println("After the day " + day  + " , you earned "
                 + df.format(earnings) + " per share." );
            }
            else if (earnings < 0.0){
                System.out.println("After the day " + day  + " , you lost "
                        + df.format(-earnings) + " per share." );
            } else {
                System.out.println("After the day " + day  + " , you have  "
                        +  " no earnings  per share." );
            }
            day += 1;
        }
        scan.close();
    }
}