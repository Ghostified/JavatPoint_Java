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
        
            System.out.println("Odd Elements");
            for (int i =0; i < size ; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(  arr[i] + " ");
                }
            }

            System.out.println("\nEven Elements: ");
            for (int j  = 0; j < size; j++) {
                if (arr[j] % 2 == 0 ) {
                    System.out.print( arr[j] + " ");
                }
            }
        }
    }

