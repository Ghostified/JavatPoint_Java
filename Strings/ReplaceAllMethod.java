package Strings;
/*
 * this method returns a string replacing all the sequences of a characters matching regex and replacement string
 */
public class ReplaceAllMethod {

    public static final String stringOne = "Welcome to Hogwarts school of Magic";
    public static final String stringTwo = "The boy who lived . Has finally come to die ";

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
        
        Example30  object2 = new Example30();
        object2.replaceWhiteSpace(); 

        //Example31 object3 = new Example31();
        //object3.patternException();

        Example32 object4 = new Example32();
        object4.insertSpaces();

        Example33 object5 = new Example33();
        object5.nullRegex();
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

//use the replaceAll () method to remove white spaces
class Example30{
    public static void replaceWhiteSpace () {
        ReplaceAllMethod instance = new ReplaceAllMethod();
        String stringOne = instance.getStringOne();

        String replaceString = stringOne.replaceAll("\\s", "");
        System.out.println(replaceString);

    }

    public String stringWithoutSpaces () {
        //call the replaceWhitespace() method to ensure the stringWithoutSpaces() is initialized
        replaceWhiteSpace();

        //return modified string
        ReplaceAllMethod instance = new ReplaceAllMethod();
        String stringOne = instance.getStringOne();
        return stringOne.replaceAll("\\s", "");
    }
}

//the replaceAll () method throws a patternSyntaxException when there is an improper regular expression

class Example31 {
    public static void patternException () {
        ReplaceAllMethod instance = new ReplaceAllMethod();
        String stringTwo = instance.getStringTwo();
        System.out.println(stringTwo);

        
        String regex = "\\" ;//the regular expression is invalid

        //valid regex expression 
       // String regex = "boy"; 

        //invokinhg the replaceAll () method 
        stringTwo = stringTwo.replaceAll(regex, "Girl");
        System.out.println(stringTwo); //throws a pattern syntax Exception
    }
}
//using the replace method to insert spaces in  a string
// the class example32 calls the output from class Example30 
//it takes it a s the string input from the method stringWithoutSpaces" 

class Example32 {
    public static String insertSpaces () {
        Example30 example30 = new Example30();
        String stringwithoutSpaces = example30.stringWithoutSpaces();

        //test for NullPointerException
         if (stringwithoutSpaces != null) // a method does not return a value in java, rather it returns null
          {
            System.out.println("success");
         }
         else {
            System.out.println(stringwithoutSpaces);
         }

         String regex = "";

         //adding white spaces before and after every character on of the input string
         stringwithoutSpaces = stringwithoutSpaces.replaceAll(regex, " ");
         System.out.println(stringwithoutSpaces);

         return stringwithoutSpaces;
    }

    public String secondAttempt() {
        return insertSpaces();
    }
}

//null is not accepted as regex in the replaceAll () methods as it returns a null pointer exception
class Example33 {
    public static void nullRegex () {
        ReplaceAllMethod instance = new ReplaceAllMethod();
        String stringOne = instance.getStringOne();

        String regex = "null"; //regex is null
        stringOne = stringOne.replaceAll(regex, " ");
        System.out.println(stringOne);
    }
}