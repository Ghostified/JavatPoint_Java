package Strings;
/*
 * this method returns a string replacing all the sequences of a characters matching regex and replacement string
 */
public class ReplaceAllMethod {

    public static final String stringOne = "Welcome to Hogwarts school of Magic";
    public static final String stringTwo = "The boy who lived , has finally come to die";

    public String getStringOne() {
        return stringOne;
    }

    public String getStringTwo () {
        return stringTwo;
    }

    public static void main(String[] args) {

        Example28 object = new Example28();
        object.repChar();

        Example29 object1 = new Example29();
        object1.replaceWord();
        
    }
}

//replace all occurrences of a single character
class Example28 {
    public static void repChar() {
        ReplaceAllMethod instance = new ReplaceAllMethod ();
        String stringTwo = instance.getStringTwo();

        String replaceString = stringTwo.replaceAll("a","e"); //replaces all occerences of a to e
        System.out.println(replaceString);
    }
}

//replaceall () method used to replace a word or a set of words
class Example29 {
    public static void replaceWord () {
        ReplaceAllMethod instance = new ReplaceAllMethod();
        String stringTwo= instance.getStringTwo();

        String replaceString = stringTwo.replaceAll("die", "live");
        System.out.println(replaceString);


    }
}