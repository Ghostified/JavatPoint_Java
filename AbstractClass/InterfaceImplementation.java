package AbstractClass;
/*
 * Abstract classes can be used to provide implementation of of the interface
 */

 interface A {
    void a();
    void b();
    void c();
    void d();
 }

 abstract class B implements A {
    public void c () {
        System.out.println("I am c ");
    }
 }

 class M extends B {
    public void a() {
        System.out.println("I am a");
    }
    public void b () {
        System.out.println("I am b");
    }
    public void d() {
        System.out.println("I am d");
    }
    
 }
 class InterfaceImplementation {

    public static void main (String[ ] Args) {
        A a = new M ();
        a.a();
        a.b();
        a.c();
        a.d();

    }

}
