package Constructors;

/*
 * Constructor overloading is :
 * having more than one constructor with diffrent poarameter list
 * Arrangement is done such that each constructor performs a diffrent task
 * They are diffrenciated by the compiler by:
 * - number of parameter in the lists
 * = their types 
 */

 //Example of constructor overloading
 class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5 (int i, String n) {
        id = i;
        name = n;
    }

    //creating a three arg constructor
    Student5 ( int i, String n , int a) {
        id = i;
        name = n;
        age = a;
    }

    void display () {
        System.out.println(id + " " + name + " " + age);
    }
 }
public class ConstructorOverloading {

    public static void main (String [] Args) {
        Student5 s1 = new Student5(111, " James");
        Student5 s2 = new Student5(222, "Brown", 025);

        s1.display();
        s2.display();

    }

}
