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
    public static final String stringBlank = "   ";

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

    //getter method for stringSix
    public String getStringBlank() {
        return  stringBlank;
    }

    public static void main(String[] args) {
        Example object = new Example();
        object.example1();

        Example10 object2 = new Example10();
        object2.example2();

        NullExample object3 = new NullExample();
        object3.nullString();

        CheckNullString object4 = new CheckNullString();
        object4.checkNull();

        Blank object5 = new Blank();
        object5.blankStrings();
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

//to check a null string, we use the == operator to check for the null strings

class CheckNullString {
    public static void checkNull() {
        IsEmptyMethod instance = new IsEmptyMethod();
        String stringFive = instance.getStringFive();

        if (stringFive == null) 
        {
            System.out.println("The string is null");
        }
        else 
        {
            System.out.println("The string is not null");
        }
    }
}
//Using the isEmpty() method to find blank strings. Blank strings only contain white spaces
class Blank{
    public static void blankStrings () {
        IsEmptyMethod instance = new IsEmptyMethod();
         String stringBlank = instance.getStringBlank();
         int size = stringBlank.length();

         //trim the whiote spaces and after that
         //if the string results in the empty string
         //then the string is blank ; otherwise , not.

         if (size == 0) 
         {
            System.out.println("The string is empty\n");
         }
         else if (size > 0 && stringBlank.trim().isEmpty()) 
         {
            System.out.println("The string is blank. \n");
         }
         else 
         {
            System.out.println("The string is not blank. \n");
         }

         String stringOne = instance.getStringOne();
         size = stringOne.length();
         if (size == 0)
         {
            System.out.println("The string is empty \n");
         }
         if (size > 0 && stringOne.trim().isEmpty()) 
         {
            System.out.println("The string is blank \n");
         }
         else
         {
            System.out.println("The string is not blank \n");
         }

    }
}