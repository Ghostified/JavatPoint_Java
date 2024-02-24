package ControlStatements;
/*
 * Switch statement based on a grade int. Based on the grade, each case is checked.
 * if the case satifies the expression, the break statements does not check the other cases
 */
public class SwitchCaseExample3 {

    public static void main(String[] args) {
        int grade = 1;

        switch (grade) {
            case 1:
            System.out.println("Excellent");
            break;

            case 2: 
            case 3:
            System.out.println("Well Done");
            break;

            case 4:
            System.out.println("You passed");

            case 5:
            System.out.println("Better , try again");
            break;

            default:
            System.out.println("Invalid Grade");
        }

        System.out.println("Your grade is: " + grade);
    }
}
