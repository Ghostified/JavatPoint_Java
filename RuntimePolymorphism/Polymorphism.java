package RuntimePolymorphism;
/*
 * Polymorphism is a concept in java where we can perform a single action in diffrent ways
 * many forms by definition
 * Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime
 * an overriden method is called through the reference variable of the superclass
 * 
 */

 //example

class Bike{
    void run () {
        System.out.println("running");
    }
}
class Splendor extends Bike {
    void run() {
        System.out.println("Running at 60km/hr");
    }
}
public class Polymorphism {

    public static void main (String[]Args) {

        //upcasting
        Bike obj = new Splendor();

        
        obj.run();
    }
}
