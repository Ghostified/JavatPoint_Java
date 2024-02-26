package Strings.indexOfMethod;
/*
 * This method indexOf(String substring) returns the the index of the first character in a substriong
 * 
 */
public class Example3 {

    public static void main(String[] args) {
        String s1 = "Welcome to Hogwarts";

        //passing substring
        int index = s1.indexOf("to"); //returns the index of this substring
        System.out.println("Index of substring: " + index);
    }

}
