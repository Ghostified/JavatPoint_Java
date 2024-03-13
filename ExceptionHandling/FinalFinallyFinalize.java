package ExceptionHandling;

import JavaPrograms.Basic.FibonacciExample2;

public class FinalFinallyFinalize {

    public static void main(String[] args) {
        //FinalExample.display(); this method returns compile time error
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

