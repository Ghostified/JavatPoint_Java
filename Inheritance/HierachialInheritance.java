package Inheritance;

    /*
     * When two or more classes inherit a single  class = hierachial inheritance
     */

//example class dog and cat inherit the animal class
class Animal{
    void eat () {
        System.out.println("Eating....");
    }
}
class Dog extends Animal {
    void bark () {
        System.out.println("Barking...");
    }
}
class Cat extends Animal {
    void meow () {
        System.out.println("Meowing...");
    }
}
public class HierachialInheritance {

    public static void main (String Args[]){
        Cat crookshankns = new Cat();
        crookshankns.meow();
        crookshankns.eat();
    }
}
