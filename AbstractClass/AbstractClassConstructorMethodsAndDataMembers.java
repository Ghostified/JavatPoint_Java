package AbstractClass;

//example of an abstract class with abstarct and non abstaracts methods
abstract class MotorCycle {
    MotorCycle () {
        System.out.println("Motorcycle is created");
    }
        abstract void run ();
        void changeGear () {
            System.out.println("Gear Change");
        }
    }

    //child class that inherits abtract class
    class Ducati extends MotorCycle {
        void run () {
            System.out.println("Running safely");
        }
    }

    //class that calls abstract and non-abstract methods
 class AbstractClassConstructorMethodsAndDataMembers {

    public static void main (String[]Args) {
        MotorCycle object = new Ducati();
        object.run();
        object.changeGear();
    }
}
