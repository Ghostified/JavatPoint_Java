package Arrays.BasicOperations;

public interface SortArraysDescending {

    public static void main(String[] args) {
        int array [] = new int[] {6,8,5,3,7,9,4,2,1};
        int temp= 0;
        System.out.println("Elements in the original array: ");
        for (int i = 0; i  < array.length; i++) {
            System.out.print( array[i] + " ");
        }

        for (int i =0; i < array.length; i++) {
            for (int j = i + 1; j< array.length;j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array [j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements in the array after sorting");
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }

}
