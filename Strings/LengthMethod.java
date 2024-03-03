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

    Example21 object2 = new   Example21();
    object2.emptyLength();

    Example22 object3 = new Example22();
    object3.reverseLength();

    Example23 object4 = new Example23();
    object4.whiteSpaces();

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

 //the length method can be used to reverse a string 
 class Example22 {
    public static void reverseLength () {
        LengthMethod instance = new LengthMethod();
        String stringTwo = instance.getStringTwo();
        int size = stringTwo.length();

        System.out.println(" Reverse of the string: " + "'" + stringTwo + "'" + "is");

        for (int i =0; i < size; i++) {
            //printing inreverse order 
            System.out.print(stringTwo.charAt(stringTwo.length() -i -1));
        }
    }
 }

 //using the length methosd to find only white spaces in the string
 class Example23 {
    public static void whiteSpaces () {
        LengthMethod instance = new LengthMethod();
        String stringTwo = instance.getStringTwo();
        int sizeWithWhiteSpaces = stringTwo.length();

        System.out.println("In the string: " + "'" + stringTwo + "'");
        stringTwo=stringTwo.replace(" ", "");
        int sizeWithoutWhiteSpaces = stringTwo.length();
        int numberOfWhiteSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;
        System.out.println("Total number of white spaces are: " + numberOfWhiteSpaces);
    }
 }
