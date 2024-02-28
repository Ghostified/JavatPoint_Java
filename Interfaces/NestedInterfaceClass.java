package Interfaces;

//Code with an interface nested in a class
class A {
    interface Message {
        void msg();
    }
}

//Accessing the interface nested in the class
public class NestedInterfaceClass implements A.Message{
    public void msg () {
        System.out.println("Hello Nested Interface");
    }

    public static void main(String[] args) {
        A.Message message = new NestedInterfaceClass();//upcasting
        message.msg();
    }
}
