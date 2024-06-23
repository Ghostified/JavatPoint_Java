package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shapes {
    
    void area (int x, int y){
        System.out.println("Area of the shape is "  + x*y);
    }
     void perimeter (int x , int y){
        System.out.println("Perimeter of the shape is " + 2*(x+y));
}

}

class Rectangle extends Shapes {
    void area (int x, int y){
        System.out.println("Area of the rectangle is " + x*y);
    }
    void perimeter (int x, int y){
        System.out.println("Perimeter of the rectangle is " + 2*(x+y));
    }
}

class Square extends Shapes {
    void area (int x, int y){
        System.out.println("Area of the square is " + x*y);
    }
    void perimeter (int x, int y){
        System.out.println("Perimeter of the square is " + 2*(x+y));
    }
}

 
class GenericTests {

    //creating a method that only accepts the child classes of Shape

    public static void calculate (List <? extends Shapes> lists){
        for (Shapes s:lists){
            s.area(5, 6);
            s.perimeter(5, 6);
        }
    }
    public static void main(String[] args) {


        List <Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());


        List <Square> list2 = new ArrayList<>();
        list2.add(new Square());

        
        GenericTests.calculate(list1);
        GenericTests.calculate(list2);
    }
}
