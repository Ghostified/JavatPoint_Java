package Classes.WrapperClass;
/*
 * Unboxing is the convertion of wrapper type into primitive data types
 */

 //example of unboxing Integer into int
public class Unboxing {
    public static void main (String[]Args) {

        //converting Integer to int
        Integer c = new Integer(5);

        //Explicit convertion
        int f = c.intValue();

        //unboxing
        int j = c;

        System.out.println(c + " " + f + " "+ j);
    }
}
