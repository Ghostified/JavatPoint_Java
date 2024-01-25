package Polymorphism.MethodOverriding.java;
/*
 * Method overriding is when a sub class has the same method as the parent class
 * 
 * Rules:
 * The sub class method must have the same name as the parent class
 * The methos must have same same parameter as parent class
 * Must be an IS - A relationship 
 */

 //example
 class Vehicle {

    //defining method
    void run() {
        System.out.println("Vehicle is running");
    }
 }

 //creating a child class
  class Bike2 extends Vehicle {

    //definimg the same method as in the parent class
    void run () {
        System.out.println("Bike is running safely");
    }
  }
public class Overriding {

    public static void main (String []Args) {
        
        //creating objects
        Bike2 object = new Bike2();
        
        //calling method
        object.run();
    }

}
