package Strings.Compare;
/*
 * we can compare on the basis of content and reference
 * the compare () method compares the original content of the string
 * it compares values of string for equalituy
 * public boolean equals (object another) compares this string to the specified object
 * public boolean equalsIgnoreCase (String another) compares one string to another ignoring case
 */
public class UsingEqualsMethod {

    public static void main(String[] args) {
         String s1 =  "Harry";
         String s2 = "Harry";

         String s3 = new String("Hermione");
         String s4 = "Granger";
         String s5 = "graNger";

         System.out.println(s1.equals(s2)); //true
         System.out.println(s1.equals(s3)); //false
         System.out.println(s4.equalsIgnoreCase(s5)); //true

    }
}
