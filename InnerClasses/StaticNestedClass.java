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

        //Accessing the static nested class using the name of the  outer class
        OuterClass2.Inner2 obj2 = new OuterClass2.Inner2 ();
        obj2.show();

        //Accessing the static member of the static inner class without having to create an instance of the 
        //static nested class
        OuterClass3.Inner3.showing ();
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

//Second Example 
class OuterClass2 {
     private static int data = 70;
     static class Inner2 {
        void show () {
            System.out.println("Showing the member of the outer class " + data);
        }
     }
}
//if you have a the static member inside the static nested class
//one does not need to create an instance of the nested class
//eg in the code below , the meber showing 2 is static 
 
class OuterClass3 {
    static int data = 59;
    static class Inner3 {
        static void showing () {
            System.out.println("The data from the outer class in example OuterClass3 is " + data);
        }
    }
}