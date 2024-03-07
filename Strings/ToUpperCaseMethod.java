package Strings;

import java.util.Locale;

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

        Example50 object1 = new Example50();
        object1.upperCase2();
    }
}

class Example49 {
    public static void upperCase () {
        ToUpperCaseMethod instance = new ToUpperCaseMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.toUpperCase());
    }
}
 class Example50 {
    public static void upperCase2 () {
        ToUpperCaseMethod instance = new ToUpperCaseMethod();
        String stringOne = instance.getStringOne();
        String turkish = stringOne.toUpperCase(Locale.forLanguageTag("tr"));
        String english = stringOne.toUpperCase(Locale.forLanguageTag("en"));
        System.out.println(turkish);
        System.out.println(english);
    }
 }