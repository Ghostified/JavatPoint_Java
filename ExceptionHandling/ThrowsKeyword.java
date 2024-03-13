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
    System.out.println("Normal Flow");
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
    }
}