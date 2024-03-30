package InputAndOutput;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerClass {

    public static void main(String[] args) {
        //takeUserInput();
        takeUserInput2();
        
     }

        //example one : Take user input from the user 
        public static void takeUserInput () {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = in.nextLine();
            System.out.println("Name is : " + name);
            in.close();
        }

        //Example : Take user input and handle each exception separately
        public static void takeUserInput2() {
            String s = "Hello Hogwarts";
        
            // Create a scanner object and pass string in it
            Scanner scan = new Scanner(s);
        
            // Check if the scanner has a token
            System.out.println("Boolean Result: " + scan.hasNext());
        
            // Print the string
            System.out.println("String " + scan.nextLine());
            scan.close();
        
            Scanner in = new Scanner(System.in);
            try {
                
                //Read user input until all inputs are successfully read
                String name = null;
                int age = 0;
                double salary = 0;

                //Prompt for name untill valid input is received
                while (name == null) {
                    System.out.println("Enter your name: ");
                    try {
                        name = in.nextLine();

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input , Enter a valid name.");

                        //clear the scanner buffer
                        in.nextLine();
                    }
                }
                System.out.println("Your name is: " + name);

                //Prompt user  for age 

                //prompt user until age input is valid 
                while (age == 0) {
                    System.out.println("Enter your age : ");
                    //Handle input mismatch for age
                    try {
                        age = in.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Invalid input, enter a valid age");

                        //Clear the scanner buffer
                        in.nextLine();
                    }

                }
                System.out.println("Your age is: " + age);

                //prompt user for Salary until a valid input is entered
                while (salary == 0) {
                    //handle exception for salary
                    System.out.println("Enter your salary: ");
                    try {
                        salary = in. nextDouble();

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid Input, Enter a valid salary. ");
                        //Clear the scanner buffer
                        in.nextLine();
                    }
                }
                System.out.println("Salary is: " +salary);

            } finally {
                in.close();
            }
        }
        
}