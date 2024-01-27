package FinalKeyword;
/*
 * When a class an not be extendedis instantiated as final, it c
 */
final class Train {}

class HogwartsExpress extends Train {
    void run () {
        System.out.println("Plartform 9.375");
    }
}
public class FinalClass {

    public static void main (String [] Args) {
        HogwartsExpress obj =  new HogwartsExpress();
        obj.run();
    }

}

//output = comple time error
