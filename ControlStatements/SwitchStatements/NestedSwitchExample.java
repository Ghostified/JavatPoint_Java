package ControlStatements.SwitchStatements;
/*
 * Switch statements can be nested in other switch statements
 */
public class NestedSwitchExample {

    public static void main (String[]Args) {

        char branch = 'M';
        int collegeYear = 4;

        switch (collegeYear) {
            case 1: System.out.println("English, Math , Science");
            break;
            case 2: switch (branch) {
                case 'C' : System.out.println("Operating System, java");
                break;
                case 'E': System.out.println("Micro Processors, Logic Theory");
                break;
                case 'M': System.out.println("Drawing, Manufucturing machines");
                break;
            } break;
            case 3: switch (branch) {
                case 'C': System.out.println("Computer Organization; Multimedia");
                break;
                case 'E': System.out.println("Logical Design, microelectronics");
                break;
                case 'M': System.out.println("Combustion Engines, Mechanical Vibrations");
                break;
            }
            break;
            case 4: switch (branch ) {
                case 'C': System.out.println("Datacommunication, Multimedia");
                break;
                case 'E' : System.out.println("Embedded Systems, Image processing");
                break;
                case'M' : System.out.println("Production Tech, Thermal Engineering");
                break; 
            }
            break;
        }
    }

}
