package Aggregation.Agg;
/*
 * Aggregation represesnts a HAS - A  relationship
 * 
 */
//Example
class Operation {
    int square (int n ) {
        return n *n;
    }
}

class Circle {
    Operation op; //aggregation
    double pi = 3.14;

    double area (int radius) {
        op = new Operation();
        int rsquare = op.square(radius); //code reusability
        return pi*rsquare;
    }
}
public class AggregationExample {

    public static void main (String []Args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }

}
