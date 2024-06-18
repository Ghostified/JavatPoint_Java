package Generics;
/*
 * Advantages of hgenerics in java
 * Type safety  - Only store a single dat atype in for example in a list
 * Compile time error checking
 * Less type casting of objects 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
    public static void main(String[] args) {
        TestGenerics1 obj = new TestGenerics1();
        obj.testGenerics1();

        TestGenerics2 obj2 = new TestGenerics2();
        obj2.testGenerics2();
    }
}
//show casing that type casting is not required
class TestGenerics1 {
        
    public static void testGenerics1 () {
        ArrayList <String> list = new ArrayList<String>();
        list.add ("rahul");
        list.add ("Hermione");
        //list.add(32); //returns a compiule time error. 

        String s = list.get(1); //Type casting is not required
        System.out.println("Element is : " + s);

        Iterator <String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

//Using map elements using generics
//We need to pass keyt and value

class TestGenerics2 {
    public static void testGenerics2 () {
       Map <Integer, String> map = new HashMap <Integer, String> ();
       map.put(1, "Griffindor");
       map.put(2, "Ravenclaw");
       map.put(3, "Hufflepuff");
       map.put(4,"Slytherin");

       //using the map entry to set the iterator
       Set <Map.Entry<Integer, String>> set = map.entrySet();

       Iterator <Map.Entry<Integer, String>>itr = set.iterator();
       while (itr.hasNext()){
        Map.Entry e = itr.next(); //No need to type cast 
        System.out.println(e.getKey() + " " + e.getValue());
       }
    }
}
