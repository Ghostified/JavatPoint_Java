package Interfaces;
/*
 * An interface declared in another interface is a nested interface
 * The inner interface must be referred by the outer interface orthe class otherwise its inaccessible directly
 * Nested interfaces are declared static
 * A nested interface must be public
 * 
 */
//example to declare a nested interface

interface Shows{
    void show ();
    interface Message {
        void msg ();
    }
}

//Accessing the nested interfaces in the class
public class NestedInterfaces implements Shows.Message{
    public void msg () {
        System.out.println("Hello Nested Interface");
    }
public static void main(String[] args) {
    Shows.Message message = new NestedInterfaces ();//upcasting
    message.msg();
}
}
