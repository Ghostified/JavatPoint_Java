package Strings;
/*
 * The String isEmpty ()method checks if an iput string is empty or not
 * it returns true if the string length is 0 otherwise , returns false
 */
public class IsEmptyMethod {
    //seting the final variables
    public static final String stringOne= "";
    public static final String stringTwo = "Welcome to Hogwarts";
    public static final String stringFive = null;

    //Getter method for stringOne
    public String getStringOne (){
        return stringOne;
    }

    //getter method for stringTwo
    public String getStringTwo() {
        return stringTwo;
    }

     //getter method for stringFive
     public String getStringFive() {
        return stringFive;
    }

    public static void main(String[] args) {
        Example object = new Example();
        object.example1();

        Example10 object2 = new Example10();
        object2.example2();

        NullExample object3 = new NullExample();
        object3.nullString();
    }

}

class Example {
    public static void example1 (){
        IsEmptyMethod instance = new IsEmptyMethod();
        String stringOne = instance.getStringOne();
        String stringTwo = instance.getStringTwo();

        System.out.println(stringOne.isEmpty());
        System.out.println(stringTwo.isEmpty());
    }
}
class Example10 {
    public static void example2 () {
        IsEmptyMethod instance = new IsEmptyMethod();
        String stringOne = instance.getStringOne();
        String stringTwo = instance.getStringTwo();

        //either length is zero,isEmpty () returns true
        if (stringOne.length()== 0 || stringOne.isEmpty())
        System.out.println("String one is empty");
         else System.out.println(stringOne);
        if (stringTwo.length() == 0 || stringTwo.isEmpty())
        System.out.println("StringTwo is empty");
        else System.out.println(stringTwo);
    }
}

//the isEmpty() method is noyt suitable for checking null strings
//This returns a null pointrer exception 
class NullExample {
    public static void nullString () {
        IsEmptyMethod instance = new IsEmptyMethod();
        String stringFive = instance.getStringFive();

        if (stringFive.isEmpty()) 
        {
            System.out.println("The string is null");
        }
        else 
        {
            System.out.println("The string is not null");
        }
    }
}

