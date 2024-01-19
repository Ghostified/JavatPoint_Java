package ControlStatements.ForLoops;
/*
 * A name can be added to each for loop that are nested
 * 
 * syntax: 
 * labelname:
 * for (initialization: condition; increment/decrement) {
 * // code to be executed
 * }
 */

 //example of a labelled for loop programs
public class LabelledForLoop {
    
    public static void main (String [] Args) {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <=3; j++) {
                if(i ==2 && j == 2) {
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
