package JavaPrograms.Basic;


//fibonance with recurssion

public class FibonacciExample2 {
 static int n1 =0, n2 = 1;


 static void printFibonacci(int count ) {
    if (count > 0 ) {
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(n3 + " ");
        printFibonacci(count - 1);
    }
 }
 public static void main (String[]Args) {
    int count = 10;
    System.out.print(n1 + " " + n2 + " ");
    printFibonacci(count - 2);
 }
}
