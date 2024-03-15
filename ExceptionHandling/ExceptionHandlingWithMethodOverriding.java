package ExceptionHandling;

import java.io.IOError;
import java.io.IOException;

public class ExceptionHandlingWithMethodOverriding {
    public static void main(String[] args) {
           // TestExceptionChild obj = new TestExceptionChild();
            // obj.msg(); //results in a comple time error

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

