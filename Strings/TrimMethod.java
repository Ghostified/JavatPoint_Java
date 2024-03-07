package Strings;
/*
 * Trim mthod eliminates the leading and trailling spaces in a string
 */
public class TrimMethod {
 public static final String stringOne = "Hogwarts a history   ";

 public String getStringOne () {
    return stringOne;
 }

   public static void main(String[] args) {
    Example51 object = new Example51();
    object.trimMethod();

    Example52 object1 = new Example52();
    object1.trimMethod2();

    Example53 object2 = new Example53();
    object2.trimWhiteSpaces();

    Example54 object3 = new Example54();
    object3.trimMethod3();
   }
}
class Example51 {
    public static void trimMethod () {
        TrimMethod instance = new TrimMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.trim());
        System.out.println(stringOne.trim() + "By Cuthbert Binns");
        System.out.println(stringOne + " By Cuthbert Binns"); // retains white spaces
    }
}

//this method removes all the trailing spaces since the length of the string reduces
class Example52 {
    public static void trimMethod2 () {
        TrimMethod instance = new TrimMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.length());
        String str = stringOne.trim();
        System.out.println(str.length());
        //System.out.println(str);
    }
}
//Trim method used to remove white spaces
class Example53 {
    public static void trimWhiteSpaces () {
        TrimMethod instance = new TrimMethod();
        String stringOne = instance.getStringOne();
        if ((stringOne.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else 
        {
            System.out.println("The string contains only white spaces ");
        }

        stringOne = "  ";
        if ((stringOne.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spcaes \n");
        }
        else 
        {
            System.out.println("The string contains only white spaces ");
        }
    }
}

//Since strings are immuttable the trim () method maniupulates a string and returns a new string
//If the manipulation is not done by the string method, the reference of the same string is returned
class Example54 {
    public static void trimMethod3 () {
        TrimMethod instance = new TrimMethod();
        String stringOne = instance.getStringOne();

        //stringOne contains white spaces
        //therefore triming the string returns  a new string
        //str1 stroes a new string

        String str1 = stringOne.trim();

        //The hashcode for stringOne and str1 are diffrent
        System.out.println(stringOne.hashCode());
        System.out.println(str1.hashCode() + "\n");

        //no white spaces in the string
        //therefore the reference of the str2 is returned
        //when the trim () method is invoked

        String str2 = "ABCDEF";
         String str3 = str2.trim();

        //the hascode of str2 and str3 are the same
        if (str2.hashCode()==str3.hashCode()) 
        {
            System.out.println("The reference  of str2 and str3 are the same ");
        }
        else 
        {
            System.out.println("The hashcodes are not similar");
        }
    }
}
