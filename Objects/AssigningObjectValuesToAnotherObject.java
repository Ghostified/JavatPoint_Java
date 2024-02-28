package Objects;

/*]
*we cann copy the values of one object into another object by:
*-assigning the objects values to another object
*/

//example
class Student7 {
    int id;
    String name;
    Student7(int i, String n) {
        id = i;
        name = n;
    }
    Student7() {}
    void display() {
        System.out.println(id + " " + name);
    }
}
public class AssigningObjectValuesToAnotherObject {

    public static void main (String []Args) {
        Student7 s1 = new Student7(222, "Hermione Granger");
        Student7 s2 = new Student7();

        //copying the values of the object s1 to s2
        s2.id = s1.id;
        s2.name = s1.name;

        //displaying the method
        s1.display();
        s2.display();

    }
}
