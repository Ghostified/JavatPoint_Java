package ThisKeyword;
/*
 * This keyword can also be passed as an argument in a method
 * mainly applied in event handlind
 */

 //example
 class S2 {
    void m (S2 obj){
        System.out.println("Method is invoked");
    }

    void p() {
        m(this);
    }
 }
public class ThisEventHandling {

    public static void main (String[] Args) {
        S2 s1 = new S2();
        s1. p();
       }

}
