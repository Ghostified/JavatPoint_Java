package InnerClasses;
/*
 * its a class created within a method
 * Local inner classes do not have access modifiers and belong to the block of code they are defined within
 * They can be abstract or final
 * To invoke the methods of n inner class, this class inside the method must be instantiated
 */
public class LocalInnerClass {

    public static void main(String[] args) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }

}
class LocalInner1 {
    private int data = 30;
    void display () {
        class Local {
            void msg () {
                System.out.println(data);
            }
        }
        Local one = new Local ();
        one.msg();
    }
}