package ControlStatements.SwitchStatements;
/*
 * Enums are an immutable class of variables, group of constants
 */
public class EnumsInSwitchStatements {

    //creating enum
    public enum Day {Sun,Mon, Tue, Wed, Thur, Fri, Sat ,}

    public static void main (String [] Args) {

        Day [] DayNow = Day.values();
        for (Day Now: DayNow) {
            switch (Now) {
                case Sun : System.out.println("Sunday");
                break;
                case Mon: System.out.println("Monday");
                break;
                case Tue: System.out.println("Tuesday");
                break;
                case Wed : System.out.println("Wednesday");
                break;
                case Thur: System.out.println("Thursday");
                break;
                case Fri: System.out.println("Friday");
                break;
                case Sat: System.out.println("Friday");
                break;
            }
        }
    }
}
