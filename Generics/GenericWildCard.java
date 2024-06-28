package Generics;
import java.util.*;
/*
 * We can not use a wild card to invoke a generic method, 
 * Gerric class instance invokation or creation
 * or supertype
 */

    abstract class Admission {
        abstract void name ();
        abstract void house ();
        abstract void age ();

    }

    class Griffindor extends Admission {
        void name ( ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  the name");
            String name2 = sc.nextLine();
            System.out.println(name2);
            //sc.close ();
        }
        void house () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the house ");
            String house2 = sc.nextLine();
            System.out.println(house2);
            //sc.close();

        }
        void age () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age");
            int age2 = sc.nextInt();
            //sc.close();
            System.out.println(age2);
        }
    }
public class GenericWildCard {
    // method only accepts the child classes of Admission
    public static void admission (List <? extends Admission > lists){
        for (Admission s:lists) {
            s.name();
            s.age();
            s.house();
        }
    }
    public static void main(String[] args) {
        List <Admission> list1 = new ArrayList<Admission>(); 
        list1.add(new Griffindor () );
    }
}


