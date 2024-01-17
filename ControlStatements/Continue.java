package ControlStatements;
/*
 * Continue statement does  not break a loop
 * It skips a specific part of the loop and jumps to the next iteration of the loop
 */
public class Continue {
  
    public static void main (String[]Args) {
         for (int i = 0; i  <= 2; i++) {

            for (int j = i; j <= 5; j++) {
                
                if (j == 4) {
                    continue;
                }
                System.out.println(j);
            }
         }
    }
}
