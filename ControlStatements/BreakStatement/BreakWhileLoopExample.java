package ControlStatements.BreakStatement;

//using a break statement in a while loop
public class BreakWhileLoopExample {

    public static void main (String [] Args) {
        int i = 1;
        while (i < 11) {
            if (i == 5){
                i++;
                break; //this will break the loop
            }
            System.out.println(i);
            i++;
        } 

    }
}
