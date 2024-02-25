package Strings.Compare;

public class EqualsMethodExample4 {

    public static void main(String[] args) {
        

        //strings
        String str = "a";
        String s1 = "123";
        String s2 = "44.54";
        String s3 = "false";

        Character c =  'a';
        Integer i = 123;
        Float f = 44.54f;
        Boolean b = false;

        //reference of the character object is passed
        System.out.println(str.equals(c));

        //reference of the integer character
        System.out.println(str.equals(i));

        //reference to the float object
        System.out.println(str.equals(f));

        //reference to the boolean object
        System.out.println(str.equals(b));

        //the above return false because we are compating strings to diffrent data types
        //to compare we have convert the diffrent data types into stringd using the toString () method

        System.out.println(str.equals(c.toString()));
        System.out.println(str.equals(i.toString()));
        System.out.println(str.equals(f.toString()));
        System.out.println(str.equals(b.toString()));

    }
}
