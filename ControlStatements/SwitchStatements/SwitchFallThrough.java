package ControlStatements.SwitchStatements;
/*
 * Switch statements are fall through
 * All cases are executed if their is no break statements
 */
public class SwitchFallThrough {

    public static void main (String[]Args) {
        
        int day = 1;
        String dayOfWeek = " ";
        switch (day) {
            case 1: System.out.println("Monday");
            case 2: System.out.println("Tuesday");
            case 3: System.out.println("Wed");
            case 4: System.out.println("Thur");
            case 5: System.out.println("Fri");
            case 6: System.out.println("Sat");
            case 7: System.out.println("Sun");
            default: System.out.println("Not a day of the week");
        }

        System.out.println(dayOfWeek);
    }

}
