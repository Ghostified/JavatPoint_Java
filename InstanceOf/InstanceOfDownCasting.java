package InstanceOf;
class Grazers {}
class Zebra extends Grazers {
    static void method(Grazers g) {
        if (g instanceof Zebra) {
            Zebra  z = (Zebra)g; // Downcasting
            System.out.println("Downcasting Achieved");
        }
    }
}
public class InstanceOfDownCasting {

    public static void main (String [] Args) {
        Grazers g = new Zebra();
        Zebra.method(g);
    }
}
