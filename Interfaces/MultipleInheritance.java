package Interfaces;
/*
 * If a class implements multiple interfaces or,
 * an interface extends multiple interfaces
 */
 interface Printing {
    void print ();
}

interface showable {
    void show();
}

class A5 implements Printing , showable {
    public void print () {
        System.out.println("Hello: ");
    }
    public void show () {
        System.out.println(" Welcome");
    }

    public static void main(String[] args) {
        A5 object = new A5();
        object.print();
        object.show();
    }
}
