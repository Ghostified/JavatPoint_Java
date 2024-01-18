package ControlStatements.SwitchStatements;

import java.util.Scanner;

/*
 * program to check if a character is a vowel or  consonant
 * Not case sensitive
 */
public class FindVowelConsonantSwitch {

    public static void main (String[] Args) {

        char alphabet;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character  ");
        alphabet = scanner.next().charAt(0);

        switch(alphabet) {
            case 'a': System.out.println("Vowel");
            break;
            case 'e' : System.out.println("vowel");
            break;
            case 'i' : System.out.println("vowel");
            break;
            case 'o': System.out.println("vowel");
            break;
            case 'u':System.out.println("vowel");
            break;
            default: 
            System.out.println("Consonant");

        }  
        scanner.close();

    }

}
