package ControlStatements.BreakStatement;
/*
 * Break statement with  a ;labeled for loop
 */
public class BreakExample2 {

    public static void main (String[] Args) {
        a: 
        for (int i = 0; i <= 10; i++) {
            b:
            for (int j = 0; j <= 15; j++) {
                c:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break a;
                    }
                }
            }
        }
    }
}
