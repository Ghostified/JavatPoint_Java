package Objects;

// simple program to initialize an object through reference 
//Initializing an object  means storing  data in the object 
class Student {
    String name;
    int id;
}

public class InitializeClassByReference {

    public static void main (String[]Args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Branson";
        System.out .println( s1.name + " " + s1.id);
    }
}
