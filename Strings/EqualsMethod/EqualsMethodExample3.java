package Strings.EqualsMethod;
/*
 * Testing the equality of a strings present in a list
 */

import java.util.ArrayList;

public class EqualsMethodExample3 {

    public static void main(String[] args) {
        String s1 = "Harry";
        ArrayList <String> list = new ArrayList<>();

        list.add("Harry");
        list.add("Potter");
        list.add("Hermione");
        list.add("Granger");

        for (String str: list) {
            if (str.equals(s1)){
                System.out.println("Harry is present");
            }
        }
    }
}
