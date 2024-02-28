package FinalKeyword;
/*
 * Can a final method be inherited?
 * == yes,  it can be inherited but one can not override a final method
 */

 class Carriage {
    final void run() {
        System.out.println("running");
    }
 }
  class Horse extends Carriage {}

public class FinalMethodInheritance {

    public static void main(String[] args) {
        Horse carriage = new Horse();
        carriage.run();
    }
}
