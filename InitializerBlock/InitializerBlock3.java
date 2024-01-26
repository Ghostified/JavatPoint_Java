package InitializerBlock;
/*
 * Program of instance initializer that comes after super
 */

class A{
    A () {
        System.out.println("Parent class invoked");
    }
}
class B extends A {
    B () {
        super();
        System.out.println("child constructor invoked");
    }
   {System.out.println("Instance initializer block invoked");}
    public static void main (String[] Args) {
        B obj = new B();
    }
    
}