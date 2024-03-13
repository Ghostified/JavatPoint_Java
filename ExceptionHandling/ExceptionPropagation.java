package ExceptionHandling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        Example28.p();
        System.out.println("normal flow");
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