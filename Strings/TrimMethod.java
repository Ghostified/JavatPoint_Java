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
   }
}
class Example51 {
    public static void trimMethod () {
        TrimMethod instance = new TrimMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.trim());
        System.out.println(stringOne.trim() + "By Cuthbert Binns");
    }
}
