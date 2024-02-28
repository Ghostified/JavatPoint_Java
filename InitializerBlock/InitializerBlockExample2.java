package InitializerBlock;

//proof that the initialer is is invoked first

// public class InitializerBlockExample2 {



class Bike2 {
    int speed;

    Bike2() {
        System.out.println("Construictor is invoked");
    }
    {System.out.println("Instance initializer block is invoked");}



    public static void main(String[] args) {
        Bike2 a = new Bike2();
        Bike2 b = new Bike2();
    }
}
