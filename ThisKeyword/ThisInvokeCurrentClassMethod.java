package ThisKeyword;
/*
 * this keyword is used to invoke the the method of the current class
 * 
 */

 //example
class A {
    void m () {
        System.out.println("Hello m");
    }
    void n () {
        System.out.println("hello n");

        //m() is the same as this.m()
        this.m();
    }
}
public class ThisInvokeCurrentClassMethod {

    public static void main (String[]Args) {
        A a = new A();
        a.n();\
    }
}
