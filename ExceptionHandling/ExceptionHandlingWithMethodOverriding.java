package ExceptionHandling;

import java.io.IOError;
import java.io.IOException;

import Arrays.BasicOperations.ArrayOnEvenPosistion;

public class ExceptionHandlingWithMethodOverriding {
    public static void main(String[] args) {
           // TestExceptionChild obj = new TestExceptionChild();
            // obj.msg(); //results in a comple time error

            TestExceptionChild1.msg();

            //this object of the child class returns a compile time error
            // TestExceptionChild2 obj1 = new TestExceptionChild2();
            // try {
            //     obj1.mesg();
            // } catch(Exception e) {
            //     System.out.println(e);
            // }

            //calling the TestException3 child class method
            TestException3.msg();

    }

}
//If the superclass method does not declares an exception,
//subclass or overriden method can not declare the checked Exception
 class Parent {
    //defining the method
    static void msg() {
        System.out.println("Parent method");
    }
 } 
class TestExceptionChild extends Parent {
    //overriding the method in child class
    //gives compile time error

    static void msg() throws IOException {
        System.out.println("Test Exception class");
    }
}

//if a superclass method does not declare an exception
//the subclass  overriden method can not declare a checked exception
//it can only declare an unchecked exception

class TestExceptionChild1 extends Parent{
    static void msg() throws ArithmeticException {
        System.out.println("child method");
    }
}
//if a superclass method declares an exception, 
//subclass overriden method can declare the same subclass exception or no exception
//subcall overriden method can not declare the parent exception
//example of a subclass overriden method declares a parent exception
class Parent1 {
    static void mesg () throws ArithmeticException {
    System.out.println("Parent1 Method");
    }
}
class TestExceptionChild2 extends Parent1 {
    static void mesg () throws Exception{
        //try{
        System.out.println("Child class");
    // } catch (Exception e){
    //     System.out.println(e);
    // }
    }
}
//Example of when an overriden child class declares the same exception as the parent method

class TestException3 extends Parent1{
    static void msg () throws ArithmeticException {
        try {
            int data = 40/0;
            System.out.println(data);
        }catch (Exception e) {
            System.out.println("Exception handled");
        }
        }
}