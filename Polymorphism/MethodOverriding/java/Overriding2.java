package Polymorphism.MethodOverriding.java;
/*
 * 
 */
//parent class
class Bank {
    int getIntrestRate() {
        return 0;
    }
}

//child classes
class Gringots extends Bank {
    int getIntrestRate () {
        return 8;
    }
}

class WizardBank extends Bank{
    int getIntrestRate () {
        return 7;
    }
}

class JPMorgan extends Bank {
    int getIntrestRate() {
        return 9;
    }
}

//class to create the objects and call the methods
 public class Overriding2 {

    public static void main (String [] Args ) {

    //creating objects
    Gringots g = new Gringots();
    WizardBank w = new WizardBank();
    JPMorgan j = new JPMorgan();

    System.out.println("Gringots intrest rate:  " + g.getIntrestRate());
    System.out.println("Wizard Bank Intrest rate: " +w.getIntrestRate());
    System.out.println("JPMOrganintrest rate "+ j.getIntrestRate());
    }
}
