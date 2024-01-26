package JavaPrograms.Basic;

import java.util.*;
public class PalindromeExample2 {
    
    public static void main (String[]Args) {

        //objects of string class
        String original, reverse = " ";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        original = in.nextLine();

        int length = original.length();
        for (int i = length -1; i >= 0; i--) 
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
        System.out.println("Is a palindrome");
        else
        System.out.println("Is not a palindrome");
    }
}
