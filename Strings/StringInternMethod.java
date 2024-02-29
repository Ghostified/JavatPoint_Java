package Strings;
/*
 * String intern() method returns the interned string
 * It can return string frommemort if created with the new Keyword
 */
public class StringInternMethod {
    //Creating the constant final strings
    public static final String stringOne = new String ("Welcome to Hogwarts");
    public static final String stringTwo = new String ("Welcome to Hogwarts");
    public static final String stringThree = "Hogwarts is fun";
    public static final String stringFour = new String ("Hogwarts is fun");

    //Getter Methoid for stringOne
    public String getStringOne () {
        return stringOne;
    }

    //Getter method for stringTwo
    public String getStringTwo (){
        return stringTwo;
    }

    //Getter method for stringThree
    public String getStringThree (){
        return stringThree;
    }

    //getter method for stringFour
    public String getStringFour () {
        return stringFour;
    }

    //Main Method
    public static void main(String[] args) {
      //  ExampleOne object = new ExampleOne();
      //  object.internMethod1();

       // StringConstantPool object2 = new StringConstantPool();
       // object2.stringConstantPool();

        Example2 object3 = new Example2();
        object3.example1();
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
class Example2 {
    public static void example1() {
        StringInternMethod instance = new StringInternMethod();
        String stringNameThree = instance.getStringThree();
        String s2 = stringNameThree.intern();
        String stringNameFour= instance.getStringFour();

        String s4 = stringNameThree.intern();

        System.out.println(stringNameThree == s2); // True
        System.out.println(stringNameThree == stringNameFour); //false
        System.out.println(stringNameThree == s4); //true
        System.out.println(s2== stringNameFour); //false
        System.out.println(s2 == s4); //true 
        System.out.println(stringNameFour == s4); //false
    
    }
}