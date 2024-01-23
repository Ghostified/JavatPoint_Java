package ThisKeyword;
/*
 * this() keyword is used to invoke the current class constructor 
 * Its used to reuese a contructor
 * i.e constructor chaining
 */
class Student1 {
    int rollNo;
    String name, course;
    float fee;

    Student1 (int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    Student1 (int rollno, String name, String course,float fee) {

        //re-using constructor
        this(rollno, course,name);
        this.fee = fee;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + course + " " + fee);
    }
}

public class ThisInvokeCurrentClassConstructor {

    public static void main  (String[] Args) {
        Student1 s1 = new Student1(101, "Potter", "Defence Against the dark arts");
        Student1 s2 = new Student1(102, "Granger", "Ancient Runes", 8000f);

        s1.display();
        s2.display();
    }
}
