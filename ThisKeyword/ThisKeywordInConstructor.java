package ThisKeyword;


//example of passing the this keyword in the constructor
class B {
    A4 obj;
    B(A4 obj) {
        this.obj = obj;
    }
    void display () {
        System.out.println(obj.data); //using data member of A4 class
    }
}

class A4 {
    int data = 10;
    A4 () {
        B b = new B (this);
        b.display();
    }
}
public class ThisKeywordInConstructor {

    public static void main (String []Args) {
        A4 a = new A4();
    }
}
