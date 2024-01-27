package FinalKeyword;
/*
 * Final key word can be a varible that restricts a user
 * A final variable value can not be changed
 */

 class Bike{

    //final variable
    final int speedLimit = 90;
    void run() {
        speedLimit = 400;
    }
 }
public class FinalVariable {
    public static void main (String [] Args) {
        Bike obj = new Bike();
        obj.run();
    }

}
//Output is a compile time error