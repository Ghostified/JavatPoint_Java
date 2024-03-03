package Strings;
/*
 * it finds the length of the string
 */
public class LengthMethod {
    public static final String stringOne = "Welcome to Hogwarts School of Wizardry and Magic";
    public static final String stringTwo = "To fight off dementors, cast the spell: Expecto Patronum!";

    public String getStringOne () {
        return stringOne;
    }

    public String getStringTwo () {
        return stringTwo;
    }
public static void main(String[] args) {

    Example20 object = new Example20();
    object.length1();

    Example21 object2 = new    Example21();
    object2.emptyLength();
    }
}
 class Example20  {
    public static void length1 () {
        LengthMethod instance = new LengthMethod();
        String stringOne = instance.getStringOne();
        String stringTwo = instance.getStringTwo();
        System.out.println("The length of the string is " + stringOne.length());
        System.out.println("The length of the second string is : " + stringTwo.length());

    }
 }

 //since the length method checks the total number of characters in a string, it can also check wether the String is empty
 class Example21 {
    public static void emptyLength () {
        LengthMethod instance = new LengthMethod();
        String stringTwo = instance.getStringTwo();
        if (stringTwo.length() > 0) {
            System.out.println("The string is not empty and the string length is: " + stringTwo.length());
        }
        stringTwo = "";
        if (stringTwo.length() == 0) {
            System.out.println("the string is empty now: " +stringTwo.length());
        }
    }
 }
