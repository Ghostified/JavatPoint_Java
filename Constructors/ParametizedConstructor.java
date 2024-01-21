package Constructors;

//a constructor with diffrent parameters is  called a parametized constructor
//it is used to provide diffrent values to distinct objects

//program to illustrate a parametized constructor
class Student4{
    int id;
    String name;

    //creating a parametized constructor 
    Student4(int i , String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println( id + " " + name);
    }
}
public class ParametizedConstructor {

    public static void main (String []Args) {
        
        //creating objects and passing values
        Student4 s1 = new Student4(01, "Allan");
        Student4 s2 = new Student4(2, "Branson");

        //calling method to display the values of the object 
        s1.display();
        s2.display();
    }

}
