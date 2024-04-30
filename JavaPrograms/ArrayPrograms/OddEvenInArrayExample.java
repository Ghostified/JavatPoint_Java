package JavaPrograms.ArrayPrograms;


 public class OddEvenInArrayExample{  

        public static void main(String[] args) {
            findEvenAndOdd();
        }

     public static void findEvenAndOdd() {
            int arr [] = {1,2,3,4,5,6};
            int size = arr.length;
            int even ; 
            int odd;
         for (int i = 0; i < arr.length; i++)  {
            for (int j =0; j < size - 1; j++) {
                if (arr[j] % 2 == 0) {
                    even = arr[j];
            
                    System.out.print("\n Even: " + arr[j]);
                
                } else if (arr[j] % 2 != 0) {
                    odd = arr [j];

                    System.out.print(" \nOdd: " + arr[j] );
                }
            }


        }
    
        }
    }

