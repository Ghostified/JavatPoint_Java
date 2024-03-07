package Strings;
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
    }

}
class Example47 {
    public static void  lowerCase () {
        ToLowerCaseMethod instance = new ToLowerCaseMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.toLowerCase());
    }
}
