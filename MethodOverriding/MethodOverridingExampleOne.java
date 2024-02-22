package MethodOverriding;
// Enables to achieve runtime polymorphism and is used to write the definitions of a subclass method

class Animal{
    public void move() {
        System.out.println("Animals can Move");
    }
}

class Dog extends Animal {
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}
public class MethodOverridingExampleOne {
    public static void main (String [] Args) {
        Animal a = new Animal(); //Animal reference and object
        Animal b = new Dog (); //Animal reference but Dog Object
        
        a.move (); //Runs method in animal class
        b.move(); //runs method in dog class
    }
}
