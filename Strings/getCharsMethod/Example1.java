package Strings.getCharsMethod;
/*
 * This method copies the content of this string into a specuialized array
 * It has 4 arguments:
 * public void getChars(int srcBeginIndex, int srcEndIndex,  cahr[] destination, int dstBeginIndex)
 *  - int srcBeginIndex = Index from where copying characters begin
 * - int srcEndIndex = Index which is next to the last character getting copied
 * - char[] destination = The char array where characters from thr string that invokes the getChars() method is getting copied
 * - int = shows the position in the destination aarray from where the characters from the string will be pushed
 * 
 */

public class Example1 {

    public static void main (String [] Args) {
         String s1 = new String ("Welcome to Hogwarts school of magic");
         char [] charObject = new char [10];

         try {
            s1.getChars(6, 16, charObject, 0);
            System.out.println(charObject);
         } 
         catch (Exception ex) {
            System.out.println(ex);
         }
         
    }

}
