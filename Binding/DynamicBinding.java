package Binding;
/*
 * when a type of the object is determined at run time , this is known as dynamic binding
 */
//example

class Primates {
    void eat () {
        System.out.println("");
    }
}

class Monkey extends Primates {
    void eat () {
        System.out.println("Monkeys like fruit");
    }
}
public class DynamicBinding {
    public static void main (String[]Args) {
        Primates orangutan = new Monkey();
        orangutan.eat();
    }

}
