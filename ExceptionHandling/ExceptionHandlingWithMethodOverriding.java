package ExceptionHandling;

import java.io.IOError;
import java.io.IOException;

public class ExceptionHandlingWithMethodOverriding {
    public static void main(String[] args) {
           // TestExceptionChild obj = new TestExceptionChild();
            // obj.msg(); //results in a comple time error

            TestExceptionChild1.msg();

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