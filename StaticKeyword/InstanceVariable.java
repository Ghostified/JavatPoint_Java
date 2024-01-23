package StaticKeyword;
/*
 * instance variable get memory at time of creation unlike static variable that,
 * get memory at the time of compilation/class loading
 */

 //exmple of instance variable
 class Counter {
    int count = 0; //gets memory when the instance is created
Counter () {
    count++;
    System.out.println(count);
} 
}

public class InstanceVariable {

    public static void main (String []Args) {
        
        //creating objects 
        Counter c1 = new Counter();
        Counter c2 = new Counter ();
        Counter c3 = new Counter() ;

    }
}
