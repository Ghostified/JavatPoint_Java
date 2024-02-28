package RuntimePolymorphism;

//Runtime example

class Animal {
    void eat () {
        System.out.println("eating..");
    }
}
class Dog extends Animal {
    void bark () {
        System.out.println("Dogs bark ");
    }
    void eat () {
        System.out.println("Chewing Bones ");
    }
}

class Cat extends Animal {
    void eat () {
        System.out.println("Cats like chewing toys");
    }

    void meow () {
        System.out.println("Its  Crookshanks");
    }
}

class Lion extends Animal {
    void eat () {
        System.out.println("Lions hunt for food, they like gazzelle");
    }

    void roar () {
        System.out.println("Ever a seen a roaring lion? ");
    }
}
public class AnimalExample {

    public static void main(String[] args) {
        
        Dog padfoot = new Dog();
        padfoot.bark();
        padfoot.eat();

        Cat pussy = new Cat();
        pussy.meow();
        pussy.eat();

        Lion griffindor = new Lion();
        griffindor.roar();
        griffindor.eat();

        Animal a;
        a = new Dog();
        a.eat();

        a = new Lion();
        a.eat();

        a = new Cat ();
        a. eat();
    }

}
