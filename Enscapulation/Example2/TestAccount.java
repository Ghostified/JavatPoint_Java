package Enscapulation.Example2;
// a class to test the enscapulated class Amount
public class TestAccount {

    //creating instance of Account class
    public static void main (String[]Args) {
        Account acc = new Account();

        //setting values through the setter methids
        acc.setAcc_no(7638392027l);
        acc.setName("Harry Potter");
        acc.setEmail("harry@gringotsbank.com");
        acc.setAmount(50000f);

        //getting values using getter methods
        System.out.println(acc.getAcc_no());
        System.out.println(acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getAmount());
    }
}
