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