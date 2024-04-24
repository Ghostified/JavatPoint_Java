package JavaPrograms.ArrayPrograms;

//Copy the elements of one array into another array. 

public class CopyElementsOfAnArray {
    public static void main(String[] args) {
        soultion1();
        
    }

    //

    public static void soultion1 () {

        //Initialize first array 

        int [] array1 = {1,2,3,4,5};

        //Create second array with the size of the first array 
        int [] array2 = new int[array1.length];

        //Copying the elements of array1 into array 2
         
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        //display the elements of array1 and array 2
        System.out.println("Elements in the first array");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nElements in the second array");
        for (int i = 0; i< array2.length; i++ ) {
            System.out.print(array2[i] + " ");
        }
    }

}

