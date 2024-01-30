package AbstractClass;
/*
 * Shape is an abstract class and its implementation is provided by Rectangle and Cirlce class
 * If an instance of the Rectangle class is created, the draw method of the Rectangle class is invoked
 */

 abstract class  Shape {
    abstract void draw ();
 }

 class Rectangle extends Shape {
    void draw () {
        System.out.println ("Drawing a rectangle");
    }
 }

 class Oval extends Shape {
    void draw () {
        System.out.println("Drawing an oval");
    }
 }
public class AbstractClass2 {

    public static void main(String[] args) {
        Shape obj = new Oval();
        obj.draw();
    }

}
