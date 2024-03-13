package ExceptionHandling;

import java.io.IOException;

import Enscapulation.Example2.TestAccount;

/*
 * The thows keyword id used to declare an exception
 * it informs the programmer that the exception might occur
 */
public class ThrowsKeyword {
public static void main(String[] args) {
    TestThrows1 obj = new TestThrows1();
    obj.p();
    
    M.method2();

    TestThrow3.CheckNum(-3);

    TestThrows4.catchMethod();

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

//throw example 
class TestThrow3 {
    public static void CheckNum (int num ) {
        try {
        if (num < 1) {
            throw new ArithmeticException("\n Number is negative , can not calculate square");
        }
        else {
            System.out.println("Sqaure of num " + num + " is " + (num * num));
        }
    }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("rest of the code ");
        }
    
    }
}

//throws example 
class TestThrows4 {
    public static int divideNum (int m, int n) throws ArithmeticException {
        int div = m/n;
        return div;
    }

 static void catchMethod () {
    try {
        System.out.println(divideNum(45,0));
    }
    catch (ArithmeticException e) {
        System.out.println("\n number can not be divided by zero");
    }
    finally {
        System.out.println("Rest of  the code ");
    }
 }
}
