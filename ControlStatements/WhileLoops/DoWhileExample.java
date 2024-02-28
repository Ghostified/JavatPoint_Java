package ControlStatements.WhileLoops;
/*
 * Do while loop iterates a part of a program at least once if the number of iterations in not known
 * Also called an exit control loop - checks the condition at the end of the loop body
 * 
 * syntax: 
 * do{
 * //code to be executed
 * //up[date statement
 * } (condition)
 * 
 * condition is the is an expression to be testred, if it returns false, loop breaks
 * 
 */

 //code example of a do-while loop

public class DoWhileExample {

    public static void main (String [] Args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<= 10);
    }
}

//if the condition is set as true i.e while(true) this results to an infinite loop