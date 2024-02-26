package Strings.indexOfMethod;

public class Example4 {

    public static void main (String [] Args) {

        String s1 = " welcome to hogwarts";

        //passing substring and index
        int index = s1.indexOf("Hogwarts", 1); //Returns index of this substring
        System.out.println("index of substring: " + index);
        index = s1.indexOf("Hogwarts", 20); //it returns -1 if substring not found
        System.out.println("index of substring: " + index);
    }
}
