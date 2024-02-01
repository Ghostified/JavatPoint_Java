package Enscapulation.Example1;
//java class to test enscapulated class
 class Test {
public static void main (String[]Args){

    //creating instance of enscapulated class
    Student s = new Student ();

    //setting value in the name member
    s.setName("Harry");
    System.out.println(s.getName());
}
}
