package Binding;
/*
 * Connecting a method call to the method type is known as Binding
 * Static binding :
 * when the type of the object is determined at compiled time 
 * 
 * Understanding type:
 * 
 * Each variable has a type : int data = 30
 * 
 * Reference has a type e.g:
 * class Dog {
 *  public static void main (String[]Args)
 *  Dog d1 ; //here d1 is a type of dog
 *  }
 * 
 * Objects have a type e.g 
 * class Animal {}
 * 
 * class Dog extends Animal {
 * public static void main (String[]Args) {
 * Dog d1 = new Dog} //here d1 is an instance of Dog class , but also an instance of Animal
 * }
 * 
 * when static object is determined at compile time its known as static binding
 * If there is any private , final or static method in a class there is static binding
 */

 class Birds {
    private void eat () {
        System.out.println("Bird eating..."); }


        public static void main (String []Args) {
            Birds pelican = new Birds();
            pelican.eat();
        }
    }
 
