package Objects;

//we can create multiple objects by one type as in the case of primitives
//eg. int a =10, b =20
//initialization of reference variables
//rectangle r1 = new Rectangle,r2 = new Rectangle ();-> creating two objects 

class Rectangle{
    int length;
    int width;
    void insert (int l , int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        System.out.println(length * width);
    }
}
public class MultipleObjectsByOneType {

    public static void main (String[]Args) {
        Rectangle r1 = new Rectangle(),r2 = new Rectangle(); //Creating two objects
        r1.insert(023, 045);
        r2.insert(10, 200);

        r1.calculateArea();
        r2.calculateArea();
    }
}
