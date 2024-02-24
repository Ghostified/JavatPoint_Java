package ControlStatements;
/*
 * Iterating through an array of objects
 * 
 */
import java.util.*;
public class ForEachExample4 {

    public static void main(String[] args) {
        Student[] students = { new Student (1, "Harry"), new Student (2, "Hermione"), new Student(3, "Ron")};

        for (Student student : students) {
            System.out.print( student);
            System.out.print(",");
        }
    }
}
class Student  {
    int rollNo;
    String name;

    Student (int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @override 
    public String toString () {
        return " [" + this.rollNo + ", " + this.name + "]";
    }
}
