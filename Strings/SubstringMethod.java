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

        Example41 object1 = new Example41();
        object1.method2();

        Application object2 = new Application();
        object2.extractNames();

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

class Application {
    public static void extractNames () {
        String names [] = 
        {
            "Harry Potter",
            "James Potter",
            "Hermione Grannger",
            "Ron Weasly",
            "Percy Weasly",
        };

        String surName = "Potter";
        int surNameSize = surName.length();

        int size = names.length;

        for (int i =0; i < size;i++)
        {
            int length = names[i].length();

            //extracting surname
            String subStr = names[i].substring(length -surNameSize);

            //checks if the surname is equal to potter or not
            if (subStr.equals(surName))
            {
                System.out.println(names[i]);
            }
        }


    }
}
