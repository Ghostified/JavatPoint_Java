package Arrays.BasicOperations;

public class FindFrequencyOfElementsInArray {
    public static void main(String[]Args) {

        //initialize array
        int array [] = new int [] {1,1,2,2,3,3,4,4,5,5};

        //array db will store frequencies of the element
        int [] db = new int [array.length];
        int visited =-1;
        for (int i = 0 ; i < array.length; i++) {
            int count = 1;
            for (int j = i+1; j< array.length; j++) {
                if (array[i] == array[j]){
                    count++;

                    //to avoid counting the same element again
                    db[j] = visited;
                }
            }

            if (db[i] != visited) 
            db [i] =count;
        }

        //display the frequency of each element present in array
        System.out.println("-----------------------");
        System.out.println("Element|Frequency");
        System.out.println("-----------------------");
        for (int i = 0; i < db.length; i++){
            if(db[i] != visited)
            System.out.println(" " + array[i]+ "     |    "+ db[i]);
        }
        System.out.println("------------------------");
    }
}
