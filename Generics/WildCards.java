package Generics;

import java.util.ArrayList;
import java.util.List;

/*
 * The ? symbol represents wildcards in Java
 * 
 */
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

public class WildCards {

    //creating a class that only accepts the child class   of shape

    public static void drawShapes(List <? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();//calling method of Shape class by child class instance
        }
    }

    public static void main(String[] args) {
        List<Circle> list1 = new ArrayList<Circle>();
        list1.add(new Circle());

        List<Rectangle> list2 = new ArrayList<Rectangle>();
        list2.add(new Rectangle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
