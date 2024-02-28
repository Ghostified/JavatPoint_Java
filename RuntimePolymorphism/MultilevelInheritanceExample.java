package RuntimePolymorphism;
/*
 * simple example of runtime polymorphism with multilevel inheritance
 */

 class WildAnimals{
    void  eat () {
        System.out.println("Eating ..");
    }
 }

 class Zebra extends WildAnimals {
    void eat () {
        System.out.println("Eats Grass");
    }
 }

 class Dementor extends WildAnimals {
    void eat () {
        System.out.println("Eats Happiness .");
    }
 }

 class Whales extends Dementor {
    void eat () {
        System.out.println("Eats Krill ");
    }
 }
public class MultilevelInheritanceExample {

    public static void main(String[] args) {
        WildAnimals animal1, animal2, animal3;
        animal1 = new Dementor();
        animal2 = new Zebra();
        animal3 = new Whales();

        animal1. eat();
        animal2.eat();
        animal3.eat();
    }
}