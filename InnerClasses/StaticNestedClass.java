package InnerClasses;
/*
 * A sytatic nested class is a class created within a class
 * It can not access non ststic data memebrs and methods
 * it can be accessed by the outer class name
 * It can access static data members of the outer class including private
 * The static nested class can not access non static instance data members 
 */
public class StaticNestedClass {
    public static void main(String[] args) {
        //accessing the static class by the outer class
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        obj.display();
    }

}
class OuterClass {

    private static int staticOuterVariable = 50;
    private int nonStaticOuterVariable  = 100;

    //ststic nested class
    static class StaticNestedClass {
        void display () {
            //can access the static members of the outer class 
            System.out.println("Static outer variable " + staticOuterVariable);

            //can not access non ststic memebrs of the outer class
            //returns a compilation error
            //System.out.println("Non static outer class members " + nonStaticOuterVariable);

            //can access local variable 
            int localVar = 52;
            System.out.println( "Local variable is  "+ localVar);
        }
    }
}
