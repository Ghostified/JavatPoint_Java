package Strings;

public class StringExampleOne {

    public static void main(String[] args) {

        //Creating a string using a string literal
        String s1 = "Java"; 
        
        char ch [] = {'a','l','l','a','n'};

        //Converting char array to string
        String s2 = new String(ch);

        //creating a string using the new Keyword
        String s3 = new String ("Example of a string using the new keyword");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
