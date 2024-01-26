package InitializerBlock;

class F {
    F() {
        System.out.println("Parent Class constructor invoked");
    }
}

class G extends F {
    G () {
        super ();
        System.out.println("Child class constructor invoked");
    }

    G (int a ) {
        super ();
        System.out.println(" Child class constructor invoked" + a);
    }

    {System.out.println("Instance initializer block invoked");}

    public static void main (String[]Args) {
        G obj1 = new G ();
        G obj2 = new G (10);
    }
}