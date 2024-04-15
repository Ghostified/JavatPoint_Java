package JavaPrograms.ArrayPrograms;

public class ReverseANumber {

    public static void main(String[] args) {
        example1();
    }

    public static void example1 () {
        int number = 987654;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        System.out.println("The reverse is: " + reverse);

    }

    public static void example2 () {
        
    }
}
