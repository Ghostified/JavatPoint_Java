package Strings.Compare;

public class EqualsMethodExample2 {

    public static void main(String[] args) {
        String s1 = "Harry";
        String s2 = "Harry";
        String s3 = "Harry Potter ";

        System.out.println(s1.equals(s2)); // true
        if (s1.equals(s3)) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Both Strings are unequal");
        }
    }

}
