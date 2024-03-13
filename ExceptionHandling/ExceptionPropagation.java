package ExceptionHandling;

import java.io.IOException;

public class ExceptionPropagation {
    public static void main(String[] args) {
        Example28.p();
        System.out.println("normal flow");

        Example29 obj = new Example29();
        obj.p();
    }

}
//example of exception propagation
class Example28 {

    public static void m() {
        int data = 50/0;
    }

    public static void n () {
        m();
    }

    public static void p () {
        try {
            n();
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
        }
    }
}

class Example29 {
     void m () {
        try {
            throw new java.io.IOException("device error");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
    void n () {
        m();
    }
    void p() {
        try {
            n ();
        }
        catch (Exception e) {System.out.println("exception handled");}
    }

}