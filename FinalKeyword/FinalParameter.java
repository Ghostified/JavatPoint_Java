package FinalKeyword;
/*
 * If any parameter is declared as final, it can not be changed
 */


//example
class Animal{
    int cube (final int n) {
        n = n + 2; //cant be changed as n is final
        n*n*n;
    }
}
public class FinalParameter {

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.cube(5);
    }
}

//Output = compile time error
