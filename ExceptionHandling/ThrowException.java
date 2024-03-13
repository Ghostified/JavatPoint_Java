package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

/*
 * Is used to throw exception excplicitly
 * We can throw checked or unchecked exceptions
 * We can define our own conditions and throw an exception explicitly
 */
public class ThrowException {

    public static void main(String[] args) {

        //calling the methods in the classes directly
        Validate1.validation();

        FileErrorHandler.fileErrorHandler();


        //unconvectional way of accessing static classes 
        Example27 obj = new Example27();
        obj.userdefinedExceptionHandler();

        Example27.userdefinedExceptionHandler();
    }
}
//un unchecked exception
//This method called validate () accepts an integer as parameter
//if age < 18 , we throw an arithmetic exception or welcome them to hogwarts
class Example25{
    public static void validate (int age ) {
        if (age < 11)
        {
            throw new ArithmeticException("Not eligible to Hogwarts");
        } 
        else {
            System.out.println("Welcome to the school of magic");
        }

    }
}
    class Validate1  extends Example25 {
            
        public static void validation() {
            validate(13);
            System.out.println("rest of the code ");
        }
    }

    //checked Exception
    //with the throws keyword, it must handle the exception using a catch block ,
    // or the method must declare it using throws exception

class Example26 {
        //function to check if one is elegible to hogwarts
        public static void method() throws FileNotFoundException {

            FileReader file = new FileReader("null");
            BufferedReader fileInput = new BufferedReader(file);

            throw new FileNotFoundException();

     }
}
class FileErrorHandler extends Example26 {
    public static void fileErrorHandler() {
        try {
            method ();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        System.out.println("restof the code.... ");
    }
}

//Throwing a user defined exception
class UserDefinedException extends Exception 
{
    public UserDefinedException(String str)
    {
        //calling the constructor of the parent exception 
        super(str);
    }
}

class Example27 {
    public static void userdefinedExceptionHandler () {
        try {
            //throw an object of user defined exception
            throw new UserDefinedException("Loss of limb will not result to any exceptions");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("The exception was caught");

            //print message from myException object
            System.out.println(ude.getMessage());
        }
    }
}