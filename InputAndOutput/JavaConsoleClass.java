package InputAndOutput;

import java.io.Console;

/*
 * The java console class is used to take input from the console
 * If for a example   apassword is read from the console class, it will not be displayed to the user 
 */
public class JavaConsoleClass {

    public static void main(String[] args) {

        //calling the method ReadStringTest
        ReadStringTest();

        // calling the read password example
        ReadPasswordExample();

        // Calling the consoleMethods
        consoleMethods();
    }

    public static void ReadStringTest() {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }

    // Read text from the console example
    public static void ReadTest2() {
        String text = System.console().readLine();
        System.out.println("Text is: " + text);
    }

    // console Example to read a password securely from the console
    public static void ReadPasswordExample() {
        Console c = System.console();
        System.out.println("Enter your password");
        char[] password = c.readPassword();
        String pass = String.valueOf(password); // Converting char arry to string
        System.out.println("Your password is : " + pass);
    }

    // ConsoleMethodsExample3
    // the readPassword () method and and readLine() methods allows displaying of a
    // customized
    // message to the user before reading input
    public static void consoleMethods() {
        // Get the console object
        Console console = System.console();

        if (console != null) {
            // Read text input
            String text = console.readLine("Enter text : ");
            System.out.println("Text is: " + text);

            // read Password securely from the console
            char[] password = console.readPassword("Enter a password: ");
            System.out.println("Password is : " + new String(password));

            // formarted output
            String text2 = console.readLine("Enter your name: ");
            String text3 = console.readLine("Enter your age: ");
            int age = Integer.parseInt(text3); //pasrse the age string(text3 )to an integer
            console.printf("Hello, %s! , your age is %d", text2, age);
            System.out.println();
            console.printf("Hello , %s! Your age is %d", "Branson", 301);

            // flushing the output stream ensuring any buffere
            console.flush();

        } else {
            System.out.println("Console not available");
        }
    }
}
