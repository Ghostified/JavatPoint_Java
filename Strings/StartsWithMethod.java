package Strings;

import javax.naming.ldap.StartTlsRequest;

/*
 * the startsWith () method checks if the string starts with a given prefix
 * returns true if the string starts with a given string, otherwise returns false
 * 
 * sign:
 * public booleta startsWith (String regex)
 * 
 * retturn startsWith(prefix, 0)
 */
public class StartsWithMethod {
    public static final String stringOne ="The Wizards of the Wizengamoot";

    public String getStringOne () {
        return stringOne;
    }

    public static void main(String[] args) {
        Example37 object = new Example37();
        object.startWith();

        Example38 object1 = new Example38();
        object1.startWithOffset();

        Example39 object2 = new Example39();
        object2.emptyString();
        
    }

}
//this clas illustrates the startWith () method is case sensitive
class Example37 {
    public static void startWith () {
        StartsWithMethod instance = new StartsWithMethod();
        String stringOne = instance.getStringOne();
        System.out.println(stringOne.startsWith("The")); //true
        System.out.println(stringOne.startsWith("the")); //false
        System.out.println(stringOne.startsWith("The Wizards")); //true
        System.out.println(stringOne.startsWith("the wizards")); //false
    }
}
//startsWith () method (string prefix , int offset)
//its an overloaded method that is used to pass an argument (offset) to the function
//the offset function offsets the startwith() method by the number of characters specified

class Example38 {
    public static void startWithOffset () {
        StartsWithMethod instance = new StartsWithMethod();
        String stringOne = instance.getStringOne();

        //no offset mentioned , therefore the offset is 0 in the below case
        System.out.println(stringOne.startsWith("The")); //returns true

        //no offset mentioned therefore , offset is 0 in this casee
        System.out.println(stringOne.startsWith("Wizards")); //false

        //offset is one
        System.out.println(stringOne.startsWith("he", 1)); //true
    }
}

//if an empty string is added at the beginning of the string is thas no impact to the startsWith () method
//eg : "" + "String" = "String"
//proof

class Example39 {
    public static void emptyString() {
        
        //proof one
        String str = "Expecto Patronum";
        if (str.startsWith("")) 
        {
            System.out.println("The string starts with an empty String"); //true
        }
        else 
        {
            System.out.println("The string does not start with an empty string"); 
        }

        //second proof with the final string 
        StartsWithMethod instance = new StartsWithMethod();
        String stringOne = instance.getStringOne();
        if (stringOne.startsWith("")) 
        {
            System.out.println("The string starts with an empty String"); //true
        }
        else 
        {
            System.out.println("The string does not starts with an empty String"); 
        }
    }
}