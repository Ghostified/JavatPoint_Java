package Interfaces;
/*
 * An interface is a blueprint of a class
 * it has static constants and abstract methods
 * Used to achieve  multiple inheritance and abstraction and loose coupling
 * A class implemeting an interface must implement all the methods declared in an interface
 * 
 * syntax :
 * interface <interface name> {
 * //al constants
 * //declare methods that abstract
 * //by default
 * 
 * }
 */

public interface InterfaceExample {
    void print();
}
class A4 implements InterfaceExample {
    public void print () {
        System.out.println("Hello");
    }

    public static void main (String[]Args) {
        A4 paper = new A4();
        paper.print();
    }
}
