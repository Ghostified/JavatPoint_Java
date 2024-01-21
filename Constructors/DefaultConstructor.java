package Constructors;

//contructors a ree

//a constructor is called a default constructor:
//when it does not have a return type
//syntax <class_name>() {}

//java program to create and call a default constructor
class Bike1 {
    //creating a default constructor
    Bike1() {
        System.out.println("Bike is created ");
    }
}
public class DefaultConstructor {

    public static void main (String[] Args) {
        //calling a default constructor 
        Bike1 bike = new Bike1 ();
    }
}
