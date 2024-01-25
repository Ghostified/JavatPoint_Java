package Polymorphism.MethodOverriding.java;
/*
 * it specifies that the return type may vary in the same direction as the subclass
 * its possible to override a method by changing the return typr if subclass overrrides any method whose subclassin non - primitive
 * but it changes its return type to subclass type
 * 
 */
//Example
class Allan {
    Allan get () {
        return this;
    }
}

class Branson extends Allan {
    @Override
    Branson get () {
        return this;
    }

    void message () {
        System.out.println("welcome to covariant return type");
    }
}
public class CovariantReturnType {

    public static void main (String []Args) {
        new Branson().get().message();
    }
}
