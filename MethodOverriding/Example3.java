package MethodOverriding;

class Liblary {
    public void read () {
        System.out.println("Reading in the Liblary");
    }
    public void borrow() {
        System.out.println("Borrowing a booke from the liblary");
    }
    public void returns() {
        System.out.println("Returning a borrowed book");
    }
}

class Fiction extends Liblary {
    public void read () {
        System.out.println("Reading a fiction book");
    }
}

class Biography extends Liblary {
    public void read () {
        System.out.println("Reading a biography book");
    }
}
public class Example3 {

    public static void main (String [] Args) {

        Liblary uon = new Liblary();
        Liblary jkuat = new Fiction ();
        Biography elonMusk = new Biography();
        Liblary section = new Biography();
        Fiction harryPotter = new Fiction();


        uon.read();
        jkuat.read();
        harryPotter.read();
        harryPotter.borrow();
        elonMusk.read();
        elonMusk.borrow();
        elonMusk.returns();
        section.borrow();
        section.read();
        section.returns();

    }

}
