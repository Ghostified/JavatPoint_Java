package SuperKeyWord;
/*
 * Super class key word can also be used to invoke parent class method
 * It shoud be useed if the subclass contains the same method as p[arent class
 * 
 */
class Animal2 {
    void eat () {
        System.out.println("Eating ...");
    }
}
class Dog2 extends Animal2 {
    void eat () {
        System.out.println("Eating bread");
    }

    void bark() {
        System.out.println("Barking");
    }

    void work() {
        super.eat();
        bark();
    }
}
public class InvokeParentClassMethod {

    public static void main (String []Args) {
        Dog2 d = new Dog2();
        d.work();
    }
}
