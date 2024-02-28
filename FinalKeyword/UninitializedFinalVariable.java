package FinalKeyword;
/*
 * An uninitialized final Variable is blank
 * it can be initialized only in a constructor
 */

 class Plane {

    //blank final variable
    final int speed;

    Plane() {
        speed = 1000;
        System.out.println(speed);
    }
 }
public class UninitializedFinalVariable {

    public static void main(String[] args) {
        new Plane();
    }

}
