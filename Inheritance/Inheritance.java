package Inheritance;
/*
 * a technique in java where an object acquires the properties and behaviour of another
 * extend keyword is used
 * inheritance display an IS A  relationship
 * 
    * Syntax;
    * class subClass_name extends superClass_Name {
    * //methods and fields
    * }
 */

 //Example of inheritance

 class Employee{
    float salary = 400000;
 }
 class Programmer extends Employee{
    float bonus = 10000;
 }
public class Inheritance {
    public static void main (String[]Args) {
        
        Programmer p = new Programmer();
        System.out.println("Programmer salary is " + p.salary);
        System.out.println("Bonus for programmer is:" +  p.bonus);
        //System.out.println("Total earnings are : " + p.bonus + p.salary);
    }

}
