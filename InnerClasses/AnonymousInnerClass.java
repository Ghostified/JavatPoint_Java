package InnerClasses;
/*
 * its an inner class without a name and for which only a single object is created
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        //create an instance of the person class using an anonymous inner class
        Person p = new Person() { 
            @Override
            void eat () {
                System.out.println("nice fruits");
            }
        };
       // call the method of the anonymous inner class
        p.eat();

    }

}

//example of anonymous inner class
abstract class Person { //define the person class as abstract

    //define the abstract method eat
    abstract void eat ();
}

