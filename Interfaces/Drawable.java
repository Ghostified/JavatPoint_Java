package Interfaces;

//interface declaration
public interface Drawable {
void draw ();
}

//interface implementation
class Rectangle implements Drawable {
    public void draw () {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Drawable {
    public void draw () {
        System.out.println("Drawing a circle");
    }
}

//interface usage
class TestInterface {
    public static void main (String[]Args) {
        Drawable d = new Circle();
        d.draw();
    }
}