package Classes.WrapperClass;

//example of a custom wrapper class

class Custom {
    private int i;
    Custom () {}
    Custom (int i) {
        this.i =i;
    }
    public int getValue () {
        return i;
    }
    public void setValue (int i) {
        this.i = i;
    }
    @Override
    public String toString () {
        return Integer.toString(i);
    }
}

//testing the custom wrapper class
public class CustomWrapperClass {
    public static void main(String[] args) {
        Custom wrap = new Custom(50);
        System.out.println(wrap);
    }
}
