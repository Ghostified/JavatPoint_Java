package Interfaces;

 interface StaticInterface {
    void draw ();
    static int cube (int x) {
        return x*x*x;
    }
}

class Trapezium implements StaticInterface {
    public void draw () {
        System.out.println("Drawing a Trapezium");
    }
}

class StaticMethod {
    public static void main (String[]Args) {
        StaticInterface object = new Trapezium();
        object.draw();
        System.out.println(StaticInterface.cube(5));
    }
}
