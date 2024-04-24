package JavaPrograms.ArrayPrograms;

public class FindFrequencyOfArrayElements {
    public static void main(String[] args) {

        //Initialize aray
        int arr [] = {1,2,4,44,5,6,7,3,7};

        //Array fr will strore the frequencies of each element
        int fr [] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;

                    //to avoid counting the same array again
                    fr[j] = visited;
                }
            }
            //store the count in the frequency array if not already marked 
            if (fr[i] != visited)
            fr[i] = count;
        }


        //display the frequency of each element present in the array
        System.out.println("---------------------");
        System.out.println("Ellement|Frequency");
        System.out.println("-------------------------");
        for (int i = 0; i < fr.length; i++){
            if (fr [i] != visited)
            System.out.println("    " + arr[i]+ "  |   " + fr[i]);
        }
        System.out.println("---------------------------");
    }

}
