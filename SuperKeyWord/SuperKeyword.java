package SuperKeyWord;
/*
 * The super Keyword is used to refer immediate parent class instance variable
 * we can use the super keyword to refer to thr data member or field of the parent class
 * It is used if parent class and child class have same fields
 */

class Animal {
    String color = "white ";
}

class Dog extends Animal {
    String color = "black";
    void printColor() {
        System.out.println(color); //prints color of Dog class
        System.out.println(super.color); //prints color of Animal Class
    }
}
public class SuperKeyword {

    public static void main (String args[]) {
        Dog d = new Dog ();
        d.printColor();
    }

}
