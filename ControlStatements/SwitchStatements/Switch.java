package ControlStatements.SwitchStatements;
/*
 * Switch statements contain cases which are swiched based on the varibale being executed 
 * 
 * syntax:
 *  switch (expression ) 
 * case value 1;
 * break;
 * 
 * 
 * case value N:
 * Statement N;
 * break;
 * default statement;
 */

public class Switch  implements Cloneable{

    public static void main (String [] args) {
        int num = 2;
        switch (num) {
            case 0:
            System.out.println("Number is 0");
            break;
            case 1:
            System.out.println("Number is 1");
            break;
            case 2:
            System.out.println("Number is 2");
            break;
            case 3:
            System.out.println("The number is 3");
            break;
            default:
            System.out.println(num);
        }

    }

}
