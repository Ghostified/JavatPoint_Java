package Strings;
/*
 * String immutability refers to the fact that the data stored in a string can not be changes
 * 
 */
public class StringImmutability {

    public static void main(String[] args) {
        String s = "Harry";
        s.concat("Potter"); //concat ,ethod appends strings
        System.out.println(s); //will print Harry as string are immutability
    }
}
