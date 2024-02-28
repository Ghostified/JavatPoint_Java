package Interfaces;

public interface Bank {
float intrestRate ();
int customers ();
}

class Gringotts implements Bank {
    public float intrestRate() {
        return 8.5f;
    }
    public int customers () {
        return 3000;
    }
}

class KCB implements Bank {
    public float intrestRate () {
        return 9.5f;
    }
    public int customers () {
        return 2000;
    }
}

class WizardBank implements Bank {
    public float intrestRate () {
        return 11.2f;
    }
    public int customers  (){
        return 1000;
    }
}

class TestInterface2 {
    public static void main (String[]Args) {
        Bank gringotts = new Gringotts();
        Bank kcb = new KCB();
        Bank wizardBank = new WizardBank();


        System.out.println("Gringotts Intrest return " + gringotts.intrestRate() );
        System.out.println("Gringotts customer base " + gringotts.customers());

        System.out.println ("KCB intrest rate " + kcb.intrestRate());
        System.out.println("KCB customer base " + kcb.customers());

        System.out.println("Wizard Bank intrest rate: " + wizardBank.intrestRate());
        System.out.println("Wizard Bank number of Goblins: " + wizardBank.customers());
    }
}