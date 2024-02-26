package Strings.EqualsIgnoreCaseMethod;

import java.util.*;

/*
 * Testing string equality with other strings
 */
public class Example2 {

    public static void main(String[] args) {
        
        String s1 = "Harry Potter";
        ArrayList <String> list = new ArrayList<> ();
        list.add("Ron");
        list.add("Weasley");
        list.add("harry potter");
        list.add("Hermione Granger");

        for (String str : list) {
            if (str.equalsIgnoreCase(s1)){
                System.out.println("Harry potter is present");
            // } else {
            //     System.out.println("Harry potter is absent");
             }
        }
    }
}
