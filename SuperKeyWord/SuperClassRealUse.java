package SuperKeyWord;

// Employee classinherits person class
//all propertie of person will be inherited by employee by default
//to initialize all the prorties, we are using parent class consytructor from child class
//In such a way we atre re-using the parent class constructor

class Person {
    int id;
    String name;
    Person (int id, String name ) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {
    float salary;
    Employee(int id, float salary, String name) {
        //Reusing the constructor
        super(id,name);
        this.salary = salary;
    }

    void display (){
        System.out.println(id + " " + name + " " + salary);
    }
}
public class SuperClassRealUse {

    public static void main (String[]Args) {
        Employee employee = new Employee(102, 015000, "Albus Dumbledore");
        employee.display();
    }

}
