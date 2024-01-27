package RuntimePolymorphism;
class Fish {
    void eat() {
        System.out.println(" Eating...");
    }
}

class Shark extends Fish {
    void eat () {
        System.out.println("Sharks eat fingerlings");
    }
}

class WhaleSharks extends Shark {

    public static void main(String[] args) {
        Fish oceanFish = new WhaleSharks();
        oceanFish.eat();
    }
}

//since whalesharks do not overide eat () method, the eat () method of the Shark class is invoked