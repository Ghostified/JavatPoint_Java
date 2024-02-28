package ThisKeyword;
/*
 * This keyword can be used to distinguish between a local variable and an instance variable
 * It can be used to refer the current class intscae variable
 * if there is an ambiguity in between the instance variables aand parameters
 */

 //program that uses the this keyword
 class Student {
    int rollNo;
    String name;
    float fee;

    Student (int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }
    void display () {
        System.out.println(rollNo + " " + name + " " + fee);
    }
 }
public class ThisKeyword {

    public static void main (String[]Args) {
        Student s1 = new Student(101, "Harry Potter", 15737);
        Student s2 = new Student(102, "Granger",8900);

        s1.display();
        s2.display();
    }

}
