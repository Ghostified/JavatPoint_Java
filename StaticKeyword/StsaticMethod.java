package StaticKeyword;
/*
 * A static method in java belongs to the class rather than  the object of the class
 * A static method can be invoked without creating an instance of the classs
 * Static methods can have static data members and can change the value of it
 */

 //program to demonstrate the use of a static method
class Student3 {
    int rollno;
    String name;
    static String college = "Hogwarts";

    //static method to change the value of static variable
    static void change() {
        college = "Durmstrang";
    }

    //constructor to initialize the variable 
    Student3 (int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(rollno+ " " + name +" " + college);
    }
}
 public class StsaticMethod {

    public static void main (String[]Args) {

        //calling the change method
        Student3.change();

        //creating objects
        Student3 s1 = new Student3(101, "Malfoy");
        Student3 s2 = new Student3(102, "Crabbe");
        Student3 s3 = new Student3(103, "Goyle");

        //calling the display method
        s1.display();
        s2.display();
        s3.display();
    }
}
