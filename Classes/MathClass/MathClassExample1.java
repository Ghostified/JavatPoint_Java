package Classes.MathClass;
/*
 * This class provides methods to work with math classes
 * Examples: min(), max(), avg(), sin(), cos(),tan(), round(), ceil(), floor(), abs etc
 */
public class MathClassExample1 {

    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        double a = 30;

        //return the maximum value of two numbers 
        System.out.println("Maximum number of x and y is: " +Math.max(x,y));

        //return the  square root of y
        System.out.println("The square root of y is: " + Math.sqrt(y));

        //return 28 power 4 =  28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x,y) );

        //returns the logarithm of a given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        //returns the logarithm of given value to base 10 
        System.out.println("Log 10 to x is : " + Math.log10(x));
        System.out.println("Log 10 to y is: " + Math.log10(y));

        //return log of x + 1
        System.out.println("Log1p of x is:" + Math.log1p(x));

        //return a power of 2
        System.out.println("Exponent of a is:" + Math.exp(x));

        //return (a power of 2 )-1
        System.out.println("expm1 of a is: " + Math.expm1(x));

        //converting values to radians
        double b = Math.toRadians(a);
        double c = Math.toRadians(x);
        double d = Math.toRadians(y);

        //return the trigonometric sine 
        System.out.println("Sine value of a is:" + Math.sin(a));
        System.out.println("Sine value of x is:" + Math.sin(x));
        System.out.println("Sine value of y is:" + Math.sin(y));

        //return the trigonometric  cosine 
        System.out.println("Cosine value of a is : " + Math.cos(a));
        System.out.println("Cosine value of x is:" + Math.sin(x));
        System.out.println("cosine value of y is:" + Math.sin(y));

        //return the trigonometric tangent of a
        System.out.println("Tangent  value of a is: "+ Math.tan(a));

        //return the trigonometric arc sine of a
        System.out.println("Sine value of a is: " + Math.asin(a));

        //retuirn the trigonometric arc cosine value of a
        System.out.println("Cosine value of a is: " +Math.acos(a));

        //return the trigonometric arc tangent value of a 
        System.out.println("Tangent value of a is: " + Math.atan(a));

        //return hyperbolic sine of a 
        System.out.println("Sine value of a is: " + Math.sinh(a));

        //return the hyperbolic cosine value of a
        System.out.println("cosine value of a is: " + Math.cosh(a));

        //return the hyperbolic tangent value of a 
        System.out.println("Tangent value of a is " + Math.tanh(a));

    
    }
}
