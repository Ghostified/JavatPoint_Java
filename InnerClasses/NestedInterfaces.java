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

        //upcasting 
        Showable.Message message = new TestNestedInterface();
        message.msg();
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