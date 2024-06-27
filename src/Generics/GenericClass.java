package Generics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;



/*
 * A generic class can work with any data type
 * 
 */
public class GenericClass   <T> {
    private T value ;

    public void set(T value) {
        this.value = value;
    }

    public T get () {
        return this.value;
    }

    public static void main(String[] args) {
        GenericClass<Integer > intBox = new GenericClass<>();
        intBox.set (100);
        System.out.println("Integer value  " + intBox.get());

        GenericClass <String >  strBox = new GenericClass <> ();
        strBox.set("Hello Hogwarts ");
        System.out.println("The string value is : "  + strBox.get());

    }

}
