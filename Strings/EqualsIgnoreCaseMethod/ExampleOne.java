package Strings.EqualsIgnoreCaseMethod;

public class ExampleOne {

    public static void main (String[] Args) {
        String s1 = "Harry";
        String s2 = "Harry";
        String s3 = "HARRY";
        String s4 = "Potter";

        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println(s1.equalsIgnoreCase(s4)); //false
    }
}
