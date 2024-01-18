package ControlStatements.SwitchStatements;
/*
 * wrapper classes can be used with switch statements i.e
 * byte, long, short
 */
public class WrapperClassWithSwitch {

    public static void main (String[]Args) {

        Integer age = 18;
        switch (age) {
            case (16) : System.out.println(" You are Under 18");
            break;
            case (18): System.out.println("Ypu are eligible to vote");
            break;
            case (65) : System.out.println("You are a senior citizen");
            break;
            default: System.out.println("please give a valid age");
            break;
        }
    }
}
