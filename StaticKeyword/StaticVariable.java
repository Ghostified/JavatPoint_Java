package StaticKeyword;
/*
 * Static variables are used  for memory management
 */

 class Student {
    //instance variables
    int rollNo; 
    String name;

    //static variable
    static String college = "Hogwarts"; 

    //constructor
    Student (int r, String n) {
        rollNo = r;
        name = n;
    }

    void display () {
        System.out.println(rollNo + " " + name + " "  + college);
    }
 }
public class StaticVariable {
    public static void main (String [] Args) {
        Student s1 = new Student(111, "Ron Weasly");
        Student s2 = new Student(222, "Hermione Granger");

        s1. display();
        s2.display();
    }
}
