package InnerClasses;
//its An interface declared in another interface or calss is called 
//a nested interface must be referred to by the outerinterface
/*
 * A nested interface mut be declared as public 
 * It can not have any access modifier if declared within a class
 * Nested interfaces are declared as static
 */
public interface NestedInterfaces {

    public static void main(String[] args) {

        //Creating an object of the implementing class  TestNested Interface
        Showable.Message message = new TestNestedInterface();
        message.msg();

        //creating an object of the implementing class, MyClass
        MyClass object = new MyClass();
        //calling the method of the outerInterface
        object.outerMethod();

        //creating an object of the nested class 
        MyClass.NestedClass nestedObject = new MyClass.NestedClass();
        //calling the method of the nested interface
        nestedObject.nestedMethod();

        //Creating an object of Class A
        A.Message object2 = new TestNestedInterface2();
        object2.msg();
    
    }
   
}
//Example of an interface declared within another interface 

interface Showable {
    void show();
    interface Message {
        void msg ();
    }
}
class TestNestedInterface implements Showable.Message {
    public void msg() {
        System.out.println("hello nested interface");
    }
}

//second example of nested intrafaces and its implementation
//Outer interface
interface Outerinterface {
    //method of outer interface 
    void outerMethod ();

    //nested Interface
    public interface NestedInterface {
        //method of Nested Interface
        void nestedMethod ();
    }
}

//implementing class for outer interface 
class MyClass implements Outerinterface {
    //implementing method for outer interface 

    public void outerMethod () {
        System.out.println("Implementation of the outer method");
    }

    //implementing the nested interface within the class 
    public static class NestedClass implements Outerinterface.NestedInterface {
        
        //implementing methods of the nested interface 
        public void nestedMethod () {
            System.out.println("Implementation of the nested method");
        }
    }
}

//Example of Nested interface declared within a class
//An interface can be declared within a class and accessed

class A {
    interface Message {
        void msg ();
    }
}

class TestNestedInterface2 implements A.Message {
    public void msg(){
        System.out.println("Hello Nested Interfaces");
    }
}