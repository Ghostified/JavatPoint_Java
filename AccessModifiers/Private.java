package AccessModifiers;

/*
 * A private access modifier is only accessible within the class
 */
//This example has two classes, private and Simple, 
//Hard has private method and private data member
//accessing these outside the class results to a compile time error

public class Private {
    private int data = 40;
    private void msg () {
        System.out.println("Hello Java");
    }
}
public class Simple {
    public static void main(String[] args) {
        Private object = new Private();
        System.out.println(object.data);
        object.msg();
    }
}

//compile time era
