package JavaPrograms.Basic;

public class NumberPattern1 {

    public static void main(String[] args) {
        int i, j, number , n = 7;

        //loop for rows
        for(i = 0; i < n; i++) 
        {
            number = 1; 
            //loop for columns
            for (j =0; j <= i; j++) 
            {
                //print num
                System.out.print(number + " ");

                //increment the value of number
                number++;
            }

            //throws cursor to the next line after printing each row
            System.out.println(" ");
        }
    }
}
