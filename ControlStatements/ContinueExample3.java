package ControlStatements;
/*
 * The continue used ina for loop: It causes the loop to jump to the update statement
 * 
 * example:
 * Using a for loop to skip printing some values in an array i.e 30 & 35
 */
public class ContinueExample3 {

    public static void main(String[] args) {
        int [] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int index = 0; 

        for ( index = 0; index <= array.length; index = index + 1) {

            if (array[index] == 30  || array[index] == 35) {
                continue;
            }
            System.out.println("The values in the array are: " + array[index]);
        }
    }

}
