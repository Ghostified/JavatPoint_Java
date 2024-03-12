package ExceptionHandling;
/*
 * Is used to throw exception excplicitly
 * We can throw checked or unchecked exceptions
 * We can define our own conditions and throw an exception explicitly
 */
public class ThrowException {

    public static void main(String[] args) {
        validate1.validation();
        
    }
}
//This method called validate () accepts an integer as parameter
//if age < 18 , we throw an arithmetic exception or welcome them to vote
class Example25{
    public static void validate (int age ) {
        if (age < 18)
        {
            throw new ArithmeticException("Not eligible to Hogwarts");
        } 
        else {
            System.out.println("Welcome to the school of magic");
        }

    }
}
    class validate1  extends Example25 {
            
        public static void validation() {
            validate(13);
        }
    }