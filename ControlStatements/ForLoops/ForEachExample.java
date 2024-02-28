package ControlStatements.ForLoops;
 /*for each loop is used to traverse arrays or collections in java
  * 
  *Syntax:
  * for (data type: array_name) {
* // code to be executed
  *}
  */
public class ForEachExample {

    public static void main (String[] Args) {

        //dclaring and array;
        int array [] = {1,2,4,5,7,8,9};

        //printing the array
        for (int i : array) {
            System.out.println(i);
        }
    }
}
