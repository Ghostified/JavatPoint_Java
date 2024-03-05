package Strings;
/*
 * The split method splits a string against given regular expression and returns a char array
 * 
 * signature 
 * public string split (String regex)
 * and,
 * public String split (String regex , int limit)
 * 
 * regex : regular expression applied to the string
 * limit : limit for the number of Strings in the array. If zero, returns allthe strings matching regex
 */
public class SplitMethod {

    public static  final String stringOne = "Welcome to Hogwarts School of Wizardry and magic";

    public String getStringOne() {
        return stringOne;
    }

    public static void main (String [] Args) {
        Example34 object = new Example34();
        object.splitExample();

        Example35 object1 = new Example35();
        object1.splitExample2();

        Example36 object2 = new Example36();
        object2.splitExample3();
        
    }

}
class Example34 {
    public static void splitExample () {
        SplitMethod instance = new SplitMethod();
        String stringOne = instance.getStringOne();

        String [] words = stringOne.split("\\s");
        //System.out.println(stringOne);

        for (String w:words){
            System.out.println(w);
        }
    }
}

//split() method with regex and length examp[le]
class Example35 {
    public static void splitExample2 () {

        SplitMethod instance = new SplitMethod();
        String stringOne = instance.getStringOne();

        System.out.println("Returning Words");
        for (String w:stringOne.split("\\s", 0)) {
            System.out.println(w);
        }

        System.out.println("Returning Words");
        for (String w : stringOne.split("\\s", 1)){
            System.out.println(w);
        }

        System.out.println("Returning Words");
        for (String w: stringOne.split("\\s", 5)){
            System.out.println(w);
        }
    }
}

class Example36  {
    public static void splitExample3 () {
        SplitMethod instance = new SplitMethod();
        String stringOne = instance.getStringOne();
        System.out.println("Returning Words");
        String [] array = stringOne.split("t", 0);
        for (String w : array) {
            System.out.println(w);
        }
        System.out.println("Split array length: " + array.length);
    }
}