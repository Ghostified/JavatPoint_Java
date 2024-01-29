package InstanceOf;

import Objects.AnonymousObject;

/*
 * Its a type comparison operator
 * returns true or false
 * If an instance operator is applied to a null value it returns false
 */
class Animal {} 
class Simple1  extends Animal{

public static void main (String[]Args) {
    Simple1 obj = new Simple1();
    Animal d2 = null;
    System.out.println(obj instanceof Simple1); //true
    System.out.println(obj instanceof Animal); //true
    System.out.println(d2 instanceof Animal); //false
}

}
