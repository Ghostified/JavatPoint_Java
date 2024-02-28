package MethodOverriding;

class WildAnimals{
    public void move() {
        System.out.println("Wild animals can move");
    }
}

class Zebra extends WildAnimals {
    public void move () {
        super.move(); // invokes the super class method
        System.out.println("Zebras can walk and run");
    }
}
public class MethodOverridingUsingSuperKeyWord {

    public static void main(String[] args) {
        WildAnimals a = new Zebra(); //Wild animal reference nbut dog object
        a.move(); //runs the method in subclass i.e Zebra class
    }
}
