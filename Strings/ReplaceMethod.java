package Strings;
/*
 * The replace() metthod returns a string replacing aal the all char sequences to a new sequence of char sequences
 */

public class ReplaceMethod {
public static final String stringOne = "Hogwarts is amazing";
public static final String stringTwo = "Time to create magic";

public String getStringOne () {
    return stringOne;
}

public String getStringTwo () {
    return stringTwo;        
    }

    public static void main(String[] args) {
        Example24 object = new Example24();
        object.charReplace();

        Example25 object1 = new Example25();
        object1.charSequence();

        Example26 object2 = new Example26();
        object2.method3();

        Example27 object3 = new Example27();
        object3.method4();
    }
}
 class Example24 {
    public static void charReplace () {
        ReplaceMethod instance = new ReplaceMethod();
        String stringOne = instance.getStringOne();

        String replaceString = stringOne.replace('a', 'e'); //replaces a to e
        System.out.println(replaceString);
    }
 }

 class Example25 {
    public static void charSequence () {
        ReplaceMethod instance = new ReplaceMethod();
        String stringOne = instance.getStringOne();

        String replaString = stringOne.replace("is ", " was ");//replaces is with was 
        System.out.println(replaString);
    }
 }

 class Example26 {
    public static void method3 () {
        ReplaceMethod instance = new ReplaceMethod();
        String stringTwo = instance.getStringTwo();

        String rs = stringTwo.replace("m", "n");
        System.out.println(rs);

        rs = rs.replace("n", "m");
        System.out.println(rs);
    }
 }
 class Example27 {
    public static void method4 () {
        ReplaceMethod instance = new ReplaceMethod();
        String stringTwo = instance.getStringTwo();
        
        int size = stringTwo.length();

        System.out.println(stringTwo);
        String target = null;

        //replacing null with create. Hence, the nullpointerException is raised
        stringTwo = stringTwo.replace(target, "create");
        System.out.println(stringTwo); //throws a null pointer exception 
    }
 }