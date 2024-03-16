package InnerClasses;
/*
 * Inner classes is a class that is declared inside the class or interface
 * it can access all the mebers of the outer class 
 */

 /*
  * a non static inner class created inside a class but outside a method is called a member inner class
  it can be declared with access modifiers like public, default, private and protected
  */
  //In this example we are creating a msg() method in the member inner class thats is accessing the private data memberof the outer class
public class MemberInnerClasses {
    public static void main(String[] args) {
        TestMemberOuter1 obj = new TestMemberOuter1();
        TestMemberOuter1.Inner obj2 = obj.new Inner();
        obj2.msg();
    }

}
class TestMemberOuter1 {
    private int data = 30;

    class Inner {
        void msg () {
            System.out.println("data is " + data );
        }
    }
}