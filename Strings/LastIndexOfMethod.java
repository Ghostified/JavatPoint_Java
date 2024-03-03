package Strings;

public class LastIndexOfMethod {

    public static final String stringOne = "This is index of Example ";

    //getter method for stringOne
    public String getStringOne () {
        return stringOne;
    }

    public static void main(String[] args) {

        Example16 object = new Example16();
        object.lastIndexMethod1();

        Example17 object2 = new Example17();
        object2.substringLastIndex();

        Example18 object3 = new Example18();
        object3.lastIndexFrom();
    }
}
class Example16 {
    public static void  lastIndexMethod1() {
        LastIndexOfMethod instance = new LastIndexOfMethod();
        String stringOne = instance.getStringOne();
        int index1 = stringOne.lastIndexOf('s');
        System.out.println(index1); //returns 6
    }
}

//return the last index of a substring
class Example17 {
    public static void substringLastIndex () {
        LastIndexOfMethod instance = new LastIndexOfMethod();
        String stringOne = instance.getStringOne();
        int index = stringOne.lastIndexOf("index");
        System.out.println(index); //returns 8
    }
}
//finding the last index from a string by specifying the from index
//this implementation searches for the occurence of the specified character, couting backwards

class Example18 {
    public static void lastIndexFrom () {
        LastIndexOfMethod instance = new LastIndexOfMethod();
        String stringOne = instance.getStringOne();
        int index = stringOne.lastIndexOf('h',7);
        System.out.println("the index of the 'h' char from index 7 in the string is : " + index); //returns 1 if not found -1 ,its case sensitive
    }
}