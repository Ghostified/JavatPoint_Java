package StaticKeyword;

import java.util.Scanner;

//program that calculates the cude of a number using the static method
class Calculate{
    static int cube (int x) {
        return x*x*x;
    }
}
public class Example2StaticMethod {

    public static void main (String[] Args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        result = scanner.nextInt();

        result = Calculate.cube(result);
        System.out.println(result);
    }
}
 