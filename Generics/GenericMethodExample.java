package Generics;
/*
 * A method can also be generic
 */
public class GenericMethodExample { 
    
    public static <T> void printArray (T [] inputArray) {
        for (T element : inputArray) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6,7,8};
        String [] stringArray = {"Griffindor", "RavenClaw"} ;

        System.out.println("Integer Array");
        printArray(intArray);

        System.out.println("String Array");
        printArray(stringArray);
    }

}
