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

        Example41 object2 = new Example41();
        object2.method2();

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

class Example41 {
    public static void method2 () {
        SubstringMethod instance = new SubstringMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.substring(0));
        String substr = stringOne;
        System.out.println(substr.substring(5,10));
        String substr1 = substr;
        System.out.println(substr1.substring(5, 15));
    }
}

//application of the substring() Method
//used to do some prefix or suffix extraction 
//Filter out names that end in a substring "Potter"
