package Objects;

//Anonymous object simply means nameless
//its an object with no reference and can be used only at the creation 

//Program that shows an anonyous object
class Calculation {
    void factorial (int n ) {
        int factorial = 1;
        for (int i =1; i <= n; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial is "+ factorial);
    }
}
public class AnonymousObject {

    public static void main (String[]Args) {
        new Calculation().factorial(5);
    }

}
