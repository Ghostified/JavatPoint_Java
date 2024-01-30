package AbstractClass;
/*
 * Abstaction is the process of hiding the implementation detauils and showing only functionality to user
 * It focuses on what an object does rather than how it does it
 *  An abstract class:
 * 1. Hac have abstact and non abstract methods
 * 2. Can only be extended and its methods implemented
 * 3. can not be instantiated
 * 4. Must be declared with an abstract keyword
 * 5. Can have constructors and static methods
 * 6. Can have final methods 
 */
//example of a Bike abstract class with only one abstarct method  to run
//its implementation is provided by the Honda class

abstract class Bike{
    abstract void run ();
}

class Honda extends Bike {
    void run () {
        System.out.println("Running safely");
    }
}
public class AbstractClass {

    public static void main (String [] Args) {
        Bike obj = new Honda ();
        obj.run();
    }

}
