package ExceptionHandling;

import javax.sound.midi.Soundbank;

import JavaPrograms.Basic.FibonacciExample2;

public class FinalFinallyFinalize {

    public static void main(String[] args) {
        //FinalExample.display(); this method returns compile time error

        //calling the finallyExampleMethod
        // FinallyExample obj = new FinallyExample();
        // obj.finallyExamplee();

        FinallyExample.finallyExamplee();
    }
}
//final keywords can not be modified
//This code returns  an error
class FinalExample {
    //creating final variable
    static final int age = 18;
     static void display(){
        //trying to re assign a variable to age 
         age = 55; //retuns a compiletime error
          System.out.println(age);
    }
}

class FinallyExample {

    static void finallyExamplee () {
        try {
            System.out.println("Inside try block");
            //the code below throws a divide by zero error
            int data = 45/0;
            System.out.println(data);
        }
        //handling the Arithmetic exception error
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
    
        }
        //finally executes regarddless of the exception 
        finally {
            System.out.println("Final block executes");
        }
        System.out.println("Rest of the code to flow");
    }
}