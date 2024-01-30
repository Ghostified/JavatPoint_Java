package AbstractClass;

abstract class Bank {
    abstract int getIntrestRate ();
}

class Gringotts extends Bank {
    int getIntrestRate() {
        return 10;
    }
}

class KCB extends Bank {
    int getIntrestRate() {
        return 20;
    }
}

class WizardBank extends Bank {
    int getIntrestRate () {
        return 15;
    }
}
public class AbstractClassExample3 {

    public static void main(String[] args) {
        Bank bank;
        bank = new Gringotts();
        System.out.println ("The intrest rate is: " + bank.getIntrestRate() + " %");
        bank = new KCB();
        System.out.println ("The intrest rate is: " + bank.getIntrestRate());
        bank = new WizardBank();
        System.out.println("The rate of intrest is : " + bank.getIntrestRate());
    }
}
