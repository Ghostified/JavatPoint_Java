package RuntimePolymorphism;
/*
 * Example of runtime polymorphism
 */

 class Shape{
    void draw () {
        System.out.println("Drawing");
    }
 }

 class Rectangle extends Shape {
    void draw () {
        System.out.println("Drawing a rectangle");
    }
 }

 class Circle extends Shape {
    void draw () {
        System.out.println("Drawing a circle");
    }
 }

 class Triangle extends Shape {
    void draw () {
        System.out.println("Drawing a triangle");
    }
 }
public class ShapeExample {

    public static void main (String []Args) {
        Shape shape;

        shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }

}
