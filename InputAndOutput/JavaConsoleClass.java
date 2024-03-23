package InputAndOutput;

import java.io.Console;

/*
 * The java console class is used to take input from the console
 * If for a example   apassword is read from the console class, it will not be displayed to the user 
 */
public class JavaConsoleClass {

    public static void main(String[] args) {
       

       //calling the method ReadStringTest
      // ReadStringTest();

       //calling the read password example
       ReadPasswordExample();
    }

    public static void ReadStringTest () {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " +n );
    }

    //Read text from the console example
    public static void ReadTest2 () {
    String text = System.console().readLine();
       System.out.println("Text is: " + text); 
    }

    //console Example to read a password 
    public static void ReadPasswordExample () {
        Console c = System.console();
        System.out.println("Enter your password");
        char [] password = c.readPassword();
        String pass = String.valueOf(password); //Converting char arry to string
        System.out.println("Your password is : " + pass);
    }
}
