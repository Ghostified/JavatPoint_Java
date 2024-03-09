package Regex;
/*
 * Regex = Regular expresssion to define a pattern for searching or manipulating strings
 * Used to define constraints on emails or passwords
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.regex1();

        Example2 obj2 = new Example2();
        obj2.regex2();

        Example3 obj3 = new Example3();
        obj3.regexCharacters();
    }
}
class Example1 {
    public static void regex1 () {

        //1st Way
        Pattern p = Pattern.compile(".s"); //represents a single char
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //third way 
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }
}

class Example2 {
    public static void regex2 () {

        //The dod (s) represents a single character  
        System.out.println(Pattern.matches(".s","as")); //true  (second char is s)
        System.out.println(Pattern.matches(".s","mk")); //false - second char is not s
        System.out.println(Pattern.matches(".s","mst")); //false - has more than two chars
        System.out.println(Pattern.matches(".s","amms")); //false - has more than two chars
        System.out.println(Pattern.matches("..s","mas")); //true - Third char is s
    }
}

class Example3 {
    public static void regexCharacters () {
        System.out.println(Pattern.matches("[amn]","abcd")); //false 
        System.out.println(Pattern.matches("[amn]","a")); //true;
        System.out.println(Pattern.matches("[amn]","ammmna" )); //false
    }
}