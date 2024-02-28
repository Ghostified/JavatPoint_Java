package InitializerBlock;
/*
 * Its used to initialize the instace data member
 * It runs everytime when the object of the class is created
 */
//example

class Bike{
    int speed;
    Bike ()  {
        System.out.println("speed is : " + speed);
    }
    {speed = 100;}
}
public class InitializerBlock {
    public static void main (String[]Args) {
        Bike b = new Bike ();
        Bike c = new Bike();
    }

}
