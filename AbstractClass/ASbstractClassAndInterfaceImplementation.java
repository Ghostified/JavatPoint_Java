package AbstractClass;

//Creating interface with four methods
interface A {
    void a();
    void b ();
    void c ();
    void d ();
}

//creating an abstract class that provides the implementationof one method of A interface
abstract class B implements A {
    public void c () {
        System.out.println ("I am C");
    }
}

//creating sub class of abstract class to provide implementation of the rest of the methods
class M extends B {
    public void a() {
        System.out.println("I am a");
    }
    public void b () {
        System.out.println ("I am b");
    }
    public void d () {
        System.out.println("I am d");
    }
}

//creating a class that calls the methods of A interface 
public class ASbstractClassAndInterfaceImplementation {

    public static void main (String [] Args) {
        A a = new M ();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
