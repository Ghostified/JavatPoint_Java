package Strings;
/*
 * String intern() method returns the interned string
 * It can return string frommemort if created with the new Keyword
 */
public class StringInternMethod {
    //Creating the constant final strings
    public static final String stringOne = new String ("Welcome to Hogwarts");
    public static final String stringTwo = new String ("Welcome to Hogwarts");

    //Getter Methoid for stringOne
    public String getStringOne () {
        return stringOne;
    }

    //Getter method for stringTwo
    public String getStringTwo (){
        return stringTwo;
    }

    //Main Method
    public static void main(String[] args) {
        ExampleOne object = new ExampleOne();
        object.internMethod1();
        
    }
}
//This class proves that new strings in Java allocates memory separately for each string literal
class ExampleOne{
    public static void internMethod1 () {
        StringInternMethod instance = new StringInternMethod();
        String stringNameOne = instance.getStringOne();
        String stringNameTwo= instance.getStringTwo();
        System.out.println(stringNameOne == stringNameTwo); //returns false
    }
}
