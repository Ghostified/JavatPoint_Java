package Strings;
/*
 * the startsWith () method checks if the string starts with a given prefix
 * returns true if the string starts with a given string, otherwise returns false
 * 
 * sign:
 * public booleta startsWith (String regex)
 * 
 * retturn startsWith(prefix, 0)
 */
public class StartsWithMethod {
    public static final String stringOne = "The Wizards of the Wizengamoot";

    public String getStringOne () {
        return stringOne;
    }

    public static void main(String[] args) {
        Example37 object = new Example37();
        object.startWith();
        
    }

}
//this clas illustrates the startWith () method is case sensitive
class Example37 {
    public static void startWith () {
        StartsWithMethod instance = new StartsWithMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.startsWith("The")); //true
        System.out.println(stringOne.startsWith("the")); //false
        System.out.println(stringOne.startsWith("The Wizards")); //true
        System.out.println(stringOne.startsWith("the wizards")); //false
    }
}
