package Inheritance;
/*
 * occurs with a chain of inheritance
 * 
 */

 //Example puppy inherits dog which inherits animal
 class Animal{
    void eat() {
        System.out.println("eating....");
    }
 }
 class Dog extends Animal {
    void bark() {
        System.out.println("barking ...");
    }
 }
 class Puppy extends Dog {
    void weep () {
        System.out.println("weeping..");
    }
 }
public class MultilevelInheritance {

    public static void main (String[]Args) {
        Puppy fluffy = new Puppy();
        fluffy.weep();
        fluffy.bark();
        fluffy.eat();

    }

}
