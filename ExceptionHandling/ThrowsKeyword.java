package ExceptionHandling;

import java.io.IOException;

/*
 * The thows keyword id used to declare an exception
 * it informs the programmer that the exception might occur
 */
public class ThrowsKeyword {
public static void main(String[] args) {
    TestThrows1 obj = new TestThrows1();
    obj.p();
    
    M.method2();

}
}
class TestThrows1 {
    void m () throws IOException {
        throw new IOException("Device error"); //checked exception
    }

    void n () throws IOException {
        m();
    }
    void p () {
        try {
            n();
        } catch (Exception e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("Normal Flow");
    }
}

//if we are calling a method that declares an exception , it must be caught or declared
//if an exception is handled, the code is executed wether exception occurs or not

class M {
    static void  method() throws IOException {
        throw new IOException("Device error");
    }

    static void  method2 () {
        try {
            M m = new M();
            m.method();
        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }
        System.out.println("Normal Flow");
    }
}

