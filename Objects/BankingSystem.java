//Java program to demonstratethe working of a banking system
//We can deposit and withdraw money from an account

package Objects;


//Creating an Account class which has a deposit () and withdraw () methods
class Account {
    int accountNumber;
    String name;
    float amount;

    //method to initialize the object 
    void insert(int acc, String n, float amt) {
        accountNumber = acc;
        name = n;
        amount = amt;
    }

    //deposit method
    void deposit(float amt)  {
        amount = amount + amt;
        System.out.println(amt + "  deposited");
    } 

    //withdraw method
    void withdraw (float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + "  withdrawn");
        }
    }

    //method to check the balance of the account
     void checkBalance() {
        System.out.println( "Balance is :" + amount);
     }

     //method to display the values of an object
     void display() {
        System.out.println(accountNumber + " " + name + " " + amount);
     }
}


//class to test deposit and withdrawing amount from the account
public class BankingSystem {

    public static void main (String[] Args) {
        Account customerAccount = new Account();
        customerAccount.insert(12345, "Branson", 0300000);
        customerAccount.display();
        customerAccount.checkBalance();
        customerAccount.deposit(900000);
        customerAccount.checkBalance();
        customerAccount.withdraw(28000);
        customerAccount.checkBalance();
    }
}
