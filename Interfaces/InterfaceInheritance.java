package Interfaces;
//an interface only extends another interface
//class implements an interface


 interface InterfaceInheritance {
    void print ();
}

interface Showable extends InterfaceInheritance {
    void show ();
}

class TestClass implements Showable {
    public void print () {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("World");
    }

    public static void main (String[] Args) {
        TestClass object = new TestClass();
        object.show();
        object.print();
    }
}
