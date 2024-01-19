package ControlStatements.WhileLoops;
/*
 * Do while loop checks the statement at the end of the loop after executing the loop
 */
public class DoWhile {

    public static void main (String [] Args) {
     int i = 0;
     System.out.println("Printing the first 10 even numbers");
      do {
        
        i = i + 2;
      }  while (i <= 10);
    }
}
