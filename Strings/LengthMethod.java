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
