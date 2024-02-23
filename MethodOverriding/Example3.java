package MethodOverriding;

class Liblary {
    public void read () {
        System.out.println("Reading in the Liblary");
    }
}

class Fiction extends Liblary {
    public void read () {
        System.out.println("Reading a fiction book");
    }
    public void borrow() {
        System.out.println ("Borrow a book");
    }
}
public class Example3 {

    public static void main (String [] Args) {

        Liblary uon = new Liblary();
        Liblary jkuat = new Fiction ();
        Fiction harryPotter = new Fiction();


        uon.read();
        jkuat.read();
        harryPotter.read();
        harryPotter.borrow();

    }

}
