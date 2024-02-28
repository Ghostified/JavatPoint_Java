package Constructors;
/*
 * we can copy the values of one object to another in java using a constructor
 */

 //java program that copies the values of one object into another using a constructor
 class Student6 {
    int id;
    String name;

    //contructor to initialize integer and string
    Student6(int i, String n) {
        id = i;
        name = n;
    }

    //constructor to initialize another objec
    Student6 (Student6 s)  {
        id = s.id;
        name = s. name;
    }

    void display () {
        System.out.println(id + " "+name);
    }
 }
public class CopyValuesWithConstructors {

    public static void main (String[]Args) {
         Student6 s1 = new Student6(111, "Harry Potter");
         Student6 s2 = new Student6(s1);

         s1.display();
         s2.display();
    }
}
