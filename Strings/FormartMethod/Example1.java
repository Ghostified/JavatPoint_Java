package Strings.FormartMethod;
/*
 * String formart method is used to return a string by fiven locale, formart and arguments
 * Retrns illegalFormartSpecification if the formart is illegal 
 * NullPointerException if the pointer is incompatible
 */
public class Example1 {

    public static void main (String [] Args) {
        String name = "Hermione";

        String f1 = String.format("The name is %s", name);
        String f2 = String.format("Value of %f",32.334455);
        String f3 = String.format("Value of %31.12f", 32.33434);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
