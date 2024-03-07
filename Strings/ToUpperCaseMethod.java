package Strings;
/*
 * the toUpperCase () method converts a string from lower case to upper string
 */
public class ToUpperCaseMethod {

    public static final String stringOne = "welcome to hogwarts school of magic";

    public String getStringOne () {
        return stringOne;
    }

    public static void main (String[] Args) {
        Example49 object = new Example49();
        object.upperCase();
    }
}

class Example49 {
    public static void upperCase () {
        ToUpperCaseMethod instance = new ToUpperCaseMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.toUpperCase());
    }
}
