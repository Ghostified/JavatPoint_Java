package ControlStatements.ForLoops;

/*
 * The inner loop executes when the outer loop is executed
 */
public class NestedForLoops {

    public static void main (String[] Args) {

        //loop for i 
        for (int i = 0; i <= 3; i++) {

            //loop for j
            for(int j = 1; j<= 3;j++) {
                System.out.println(i + " " + j);
            }//end of i
        }//end of j
    }
}
