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

        StringConstantPool object2 = new StringConstantPool();
        object2.stringConstantPool();
        
    }
}
//This class proves that new strings in Java allocates memory separately for each string literal
class ExampleOne{
    public static void internMethod1 () {
        StringInternMethod instance = new StringInternMethod();
        String stringNameOne = instance.getStringOne();
        String stringNameTwo= instance.getStringTwo();

        //returns false because separate memory is allocated for each string literal
        System.out.println(stringNameOne == stringNameTwo); 

    }
}

class StringConstantPool {
    public static void stringConstantPool () {
        StringInternMethod instance = new StringInternMethod();
        String stringNameOne = instance.getStringOne();
        String stringNameTwo = instance.getStringTwo();

        //invoking the intern method
        stringNameOne = stringNameOne.intern();
        stringNameTwo = stringNameTwo.intern();

        //Prints true as the String intern() method craetses an object in the String Constant Pool
        //If the string is in existance, the string literal is returned from the pool rather than allocating memory to similar strings
        System.out.println(stringNameOne == stringNameTwo);
    }
}
