package RuntimePolymorphism;
/*
 * consider a bank class that provides methods to get rates of intrest where:
 * each bank has a diffrent rate of intrest
 */

 class Bank {
    float intrestRate ()
        {
            return 0;
        }
 }
 class Kcb extends Bank {
    float intrestRate() {
        return 10.3f;
    }
 }
 class Equity extends Bank {
    float intrestRate () {
        return 8.9f;
    }
 }
 class Gringotts extends Bank {
    float intrestRate() {
        return 11.8f;
    }
 }
public class BankExample {
    
    public static void main (String[] Args) {
        
        Bank bank;

        bank = new Gringotts();
        System.out.println("Gringotts intrest rate : " + bank.intrestRate());

        bank = new Equity();
        System.out.println("Equity bank intresty rate = " + bank.intrestRate());

        bank = new Kcb();
        System.out.println("KCB bank intrest rate = " + bank.intrestRate());
    }
}
