package Strings;
/*
 * the toCharArray () method converts a string to a char array. the length of the arrar is initialized with contents of the string
 * The length of the array is equal to the string contents
 */
public class ToCharArrayMethod {

    public static final String stringOne = "Welcome to Gryffindor";

    public String getStringOne() {
        return stringOne;
    }

    public static void main(String[] args) {
        Example45 object = new Example45();
        object.charToString();
        
        Example46 object2 = new Example46();
        object2.charToString2();
    }
}
class Example45 {
    public static void charToString () {
        ToCharArrayMethod instance = new ToCharArrayMethod();
        String stringOne = instance.getStringOne();

        char [] characters = stringOne.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
    }
}

class Example46 {
    public static void charToString2 () {
        ToCharArrayMethod instance = new ToCharArrayMethod();
        String stringOne = instance.getStringOne();
        char [] character = stringOne.toCharArray();
        int len = character.length;
        System.out.println("Char array length : " + len);
        System.out.println("Char Array elements: " );
        for (int i =0; i < len; i++) {
            System.out.print(character[i]);
        }
    }
}