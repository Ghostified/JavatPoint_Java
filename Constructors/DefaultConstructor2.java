package Constructors;

import java.rmi.StubNotFoundException;

//Example of a default constructor
//which displays the default values

class Student3 {
    int id;
    String name;

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }
}

public class DefaultConstructor2 {

    public static void main (String[]Args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();

        //displaying the values of the object
        s1.display();
        s2.display();
    }
}
// output 0 and null ; 
//Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor.
// Here 0 and null values are provided by default constructor.



