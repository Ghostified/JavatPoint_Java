package Generics;
/*
 * This restrics the types that can be used within a generic class or method
 */
public class BoundedGenerics < T extends Number> {

    private T number;

    public BoundedGenerics (T number) {
        this.number = number;
    }

    public void print () {
        System.out.println("Number " + number);
    }

    public static void main(String[] args) {
        BoundedGenerics<Integer> intBound = new BoundedGenerics<Integer>(1000);
        intBound.print();
    }
}
