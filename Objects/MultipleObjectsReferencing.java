package Objects;
//program thats creates multiple objects through referencing 

class Student {
    int id;
    String name;
}
public class MultipleObjectsReferencing {

    public static void main (String[] Args) {

        //Creating Objects
        Student s1 = new Student();
        Student s2 = new Student();

        //initializing objects
        s1.id = 101;
        s1.name = "Allan";
        s2.id = 102;
        s2.name = "Branson";

        //printing Data
        System.out.println(s1.id + " " + s1.name);
        System.out .println(s2.id + " " + s2.name);
    }
}

