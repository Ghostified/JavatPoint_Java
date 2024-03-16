package ExceptionHandling;
/*
 * used to handle exceptions based on user need 
 * Its derived from the exception class 
 */

 //syntax 
 /*
  * public class WrongFileException extends Exception {
    public WrongFileException (String errorMessage) {
        super (errorMessage)
    }
  }
  */

  /*
   * we need to write the constructor that takes the String as the error messgae and
   *  its called  the parent class constructor
   */

   //Exampl
   /*
    * a constructoir of Invalid age exceptiuon takes a String argument
    The sring is passed to the parent class constructor using the super () method
    The constructor of the Exception can be called without using a parameter 
    calling the super metgod is not mandatory
    */

public class CustomExceptions {
    public static void main(String[] args) {
  
    try {
        TestException9.validate(16);
    } catch (InvalidAgeException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}

//class representing custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException (String str){
        //calling the constructor of parent exception
        super(str);
    }
}
//class that uses invalid Exception InvalidAgeException
 class TestException9 {

    //method to check age
    static void validate (int age) throws InvalidAgeException {
        try {
            //calling the method

        if (age < 18) {

            //throw an object of user defined exception
            throw new InvalidAgeException("Not welcome to Hogwarts");
        } else {
            System.out.println("welcome to hogwrats");
            } 
        }catch (InvalidAgeException ex) {
            System.out.println("Exception caught");

            //printing the message from invalid exception object
            System.out.println("Exception occured " + ex);
        }
        System.out.println("rest of the code");
    }
 }
