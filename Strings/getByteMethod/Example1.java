package Strings.getByteMethod;
/*
 * The strings getBytes Method is used to encode a string into byte sequences and keep it in an array of bytes
 * 
 * String class getBytes () method example
 */
public class Example1 {

    public static void main(String[] args) {
       String s1 = "ABCDEFG";
       byte [] object  = s1.getBytes();
       for (int i = 0; i < object.length; i++) {
        System.out.println(object[i]);
       }
    }
}
