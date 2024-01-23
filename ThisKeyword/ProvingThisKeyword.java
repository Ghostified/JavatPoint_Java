package ThisKeyword;
/*
 * proving that the this keyword refers to the current class instance variable
 * in the program:
 * we pprint the reference variable and this, 
 * output for both variables are same
 */

 class A5 {
    void m () {
        //prints the same referece id
        System.out.println(this);
    }
 }
public class ProvingThisKeyword {
    public static void main (String[]Args) {
        A5 obj = new A5();

        //printing the reference id
        System.out.println(obj);
        obj.m();
    }
}
