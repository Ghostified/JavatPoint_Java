package Strings;
import java.util.*;

import javax.tools.Tool;
/*
 * the toLowerCase() method converts a string from upper case to lower case 
 */
public class ToLowerCaseMethod {

    public static final String stringOne = "WELCOME TO HOGWARTS";

    public String getStringOne () {
        return stringOne;
    }

    public static void main(String[] args) {
        Example47 object = new Example47();
        object.lowerCase();

        Example48 object1 = new Example48();
        object1.lowercase2();
    }

}
class Example47 {
    public static void  lowerCase () {
        ToLowerCaseMethod instance = new ToLowerCaseMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.toLowerCase());
    }
}
 class Example48  {
    public static void lowercase2 () {
    
        String s = "JAVA CODING, HELLO stRIng";
        String eng = s.toLowerCase(Locale.ENGLISH);
        System.out.println(eng);
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(turkish);
    }
 }