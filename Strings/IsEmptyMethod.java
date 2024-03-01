package Strings;
/*
 * The String isEmpty ()method checks if an iput string is empty or not
 * it returns true if the string length is 0 otherwise , returns false
 */
public class IsEmptyMethod {
    //seting the final variables
    public static final String stringOne= "";
    public static final String stringTwo = "Welcome to Hogwarts";

    //Getter method for stringOne
    public String getStringOne (){
        return stringOne;
    }

    //getter method for stringTwo
    public String getStringTwo() {
        return stringTwo;
    }

    public static void main(String[] args) {
        Example object = new Example();
        object.example1();
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
