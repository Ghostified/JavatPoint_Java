package Aggregation.Agg.Example2;

public class Main {

    public static void main (String [] Args) {
        Address address1 = new Address("Hogsmade", "Hogwarts", "Scotland");
        Address address2 = new Address("Bree", "The shire", "MiddleEarth ");

        Employee wizard1 = new Employee(101, "Albus Dumbledore", address1);
        Employee wizard2 = new Employee(102, "Radagast the Brown ", address2);

        wizard1.display();
        wizard2.display();
    }
}
