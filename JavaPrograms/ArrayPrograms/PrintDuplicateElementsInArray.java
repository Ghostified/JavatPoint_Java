package JavaPrograms.ArrayPrograms;

public class PrintDuplicateElementsInArray {

    public static void main(String[] args) {
        
        int [] arr =  {1,1,2,2,4,5,5,6,6};
        System.out.println("Duplicate elements in an array");

        //Search for duplicate elements
        for (int i = 0; i < arr.length ; i++){


            for (int j = i + 1; j < arr.length; j++) {
                if (arr [i ] == arr[j]){
                    System.out.println(j);
                }
            }
        }
    }
}
