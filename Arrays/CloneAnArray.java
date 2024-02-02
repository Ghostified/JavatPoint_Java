package Arrays;

public class CloneAnArray {

    public static void main(String[] args) {
        int array [] = {34,67,88};
        System.out.println("printing original array");
        for (int i : array)
        System.out.println(i);

        System.out.println("printing clone of the array");
        int clone [] = array.clone();
        for (int i : clone)
        System.out.println(i);

        System.out.println("Are they both equal?");
        System.out.println(array == clone);
    }
}
