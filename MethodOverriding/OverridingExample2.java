package MethodOverriding;


class Animalia{
    void eat() {
        System.out.println("Eating");
    }
}

class Lion extends Animalia {
    void eat () {
        System.out.println("Eating gazzelle");
    }
}
public class OverridingExample2 {

    public static void main(String[] args) {
        Animalia a = new Animalia();
        Animalia b = new Lion();

        a.eat();
        b.eat();
    }
}
