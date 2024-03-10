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

        Example4 obj4 = new Example4();
        obj4.regexQuantifiers();

        Example5 obj5 = new Example5();
        obj5.regexMetacharacters();

        Example6 obj6 = new Example6();
        obj6.question1();
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

//Regex quantifiers  -Specify the number of occurences  of a character
class Example4 {
    public static void regexQuantifiers () {
        System.out.println("? quantifiers");
        System.out.println(Pattern.matches("[amn]?","a")); //true a,m,or n comes one times
        System.out.println(Pattern.matches("[amn]?","aaa")); //false , a comes more than once
        System.out.println(Pattern.matches("[amn]?", "aammmmnn")); //false a , m & n come more than once
        System.out.println(Pattern.matches("[amn]?","aazzta" )); //false, a comes more than once
        System.out.println(Pattern.matches("[amn]?","am")); // a, m.or n must come at least once

        System.out.println("+ quantifier");
        System.out.println(Pattern.matches("[amn]+","a")); //true  a, m or n appears once or more times
        System.out.println(Pattern.matches("[amn]+", "aaa")); //true, a comes more than once
        System.out.println(Pattern.matches("[amn]+", "aammmmn")); //true - a, m or n come more than once
        System.out.println(Pattern.matches("[amn]+","aazzta")); //false , z and t do ot match the pattern

        System.out.println("*  quantifier");
        System.out.println(Pattern.matches("[amn]*", "ammmna")); //true, a, m or n may come zero or moretimes
    }
}

//regex metacharaxcters 
class Example5 {
    public static void regexMetacharacters () {
        System.out.println("Metacharacters d .... ");   // \\d mean digit
        System.out.println(Pattern.matches("\\d","abc")); //false - non digit
        System.out.println(Pattern.matches("\\d","1")); //true - digit comes once 
        System.out.println(Pattern.matches("\\d","4443")); //false - digit but comes more than once
        System.out.println(Pattern.matches("\\d","323abc")); //false - digit and chat

        System.out.println("Metacharacters D...."); // \\D means non -digit
        System.out.println(Pattern.matches("\\D","1")); //false (digit)
        System.out.println(Pattern.matches("\\D","4443")); //false (digit)
        System.out.println(Pattern.matches("\\D","323abc")); //false (digiy and char)
        System.out.println(Pattern.matches("\\D","m")); //true (non digit comes once
        
        System.out.println("metacharacters D with quantifier...");
        System.out.println(Pattern.matches("\\D*","mak")); //true (true, non digit and may come once or 0 times )
    }
}

//question 1 : Create a regular expression that accepts alphanumeric characters only
//length must be 6 characters long
 class Example6 {
    public static void question1 () {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "ARUN32"));//tRUE
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun36")); //false (more than 6 )
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2")); //true
        System.out.println(Pattern.matches("[A-Za-z0-9]{6}","arun$2")); //false ($ is not matched)
    }
 } 