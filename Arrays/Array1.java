package Arrays;
//program to instantiate,declare ,initialize and traverse an array
public class Array1 {
public static void main (String[]Args) {

    //declaration 
    int a [] = new int [6];

    //instantiate
    a [0] = 1;
    a[1] = 20;
    a[2]= 30;
    a[3] =40;
    a[4] = 50;
    a[5] = 60;

    //traversing array 
    for (int i = 0; i < a.length; i++)
    System.out.println (a[i]);
}
}
