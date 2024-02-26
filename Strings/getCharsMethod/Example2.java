package Strings.getCharsMethod;
/*
 * This code an IndexOutOfBoundsException Error if the index value exceeds the array range
 * 
 */
public class Example2 {

    public static void main(String[] args) {
        String s1 = new String("Welcome to Javatpoint");
        char [] charArray = new char[20];

        try{
            s1.getChars(1,26,charArray,0);
            System.out.println(charArray);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
