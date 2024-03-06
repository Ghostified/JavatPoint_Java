package Strings;
/*
 * The substring method returns a part of the string
 * public String substring (int startIndex) //type -1
 * and
 * public String substrin (int startIndex , int endIndex) //type -2
 */
public class SubstringMethod {

    public static final String stringOne = "Welcome to Hogwarts";

    public String getStringOne(){
        return stringOne;
    }
    public static void main (String []Args) {
        Example40 object = new Example40();
        object.substringMethod();

    }
}

class Example40  {
    public static void substringMethod () {
        SubstringMethod instance = new SubstringMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.substring(2,4));
        System.out.println(stringOne.substring(2));
    }
}
