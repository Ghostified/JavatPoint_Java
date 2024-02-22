
package NestedLoops;
import java.util.*;

public class DiamondShapedCharacterPattern {

    public static void main(String[] args) {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int alphabet_number = 0;
    
        String[] diamond = new String[26]; //array of strings

        System.out.print("Enter a character between A -Z : ");
        Scanner input = new Scanner(System.in);
        try {
            char user_alphabet = input.next("[A-Z]").charAt(0);

            // search for letter number in array alphabet
            for(int i = 0; i < alphabet.length; i++) {
                if(alphabet[i] == user_alphabet) {
                    alphabet_number = i;
                    break;
                }
            }

            // construct diamond
            for (int i = 0; i <= alphabet_number; i++) {
                diamond[i] = ""; // initialize the string for each row

                // add initial spaces
                for(int j = 0; j < alphabet_number - i; j++) {
                    diamond[i] += " ";
                }

                // add alphabet
                diamond[i] += alphabet[i];

                // add spaces between letters
                if (alphabet[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }

                    // add alphabet except for the last character
                    diamond[i] += alphabet[i];
                }

                // draw first part of the diamond
                System.out.println(diamond[i]);
            }

            for (int i = alphabet_number - 1; i >= 0; i--) {
                // draw second part of diamond
                // print diamond array in reverse order
                System.out.println(diamond[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            input.close();
        }
    }
}
