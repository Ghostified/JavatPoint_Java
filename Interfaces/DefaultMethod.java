package Interfaces;
//we can have a method in an interface but it ghas to be default


public interface DefaultMethod {
void draw () ;
default void message () {
    System.out.println("The default Method");
}
}

class Square implements DefaultMethod {
    public void draw () {
        System.out.println("Drawing a square");
    }
}

class DefaultMethods {
    public static void main (String[] Args) {
        DefaultMethod object = new Square();
        object.draw();
        object.message();

    }
}
