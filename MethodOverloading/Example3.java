package MethodOverloading;
/*
 * Method overloading with non static methods 
 */

 class Profile {
    public String user (String firstName, String lastName){
        return firstName +" " +  lastName;
    }

    public String user (String firstName,String middleName, String lastName){
        return firstName +" "+  middleName +" " +  lastName;
    }
 }
public class Example3 {
    public static void main(String[] args) {
        Profile profile = new Profile();
        System.out.println(profile.user("Allan",  "Branson"));
        System.out.println(profile.user("Harry","James","Potter"));
    }
}
