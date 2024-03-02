package Strings;
/*
 * The join method is used to return a string joined together withe  agiven delimmiter
 */
public class JoinMethod {

    public static void main (String [] Args) {
        Example12 object = new Example12();
        object.joinExample1();
    }

}
class Example12 {
    public static void joinExample1() {
        String joinString = String.join("-", "Welcome", "to","Hogwarts");
        System.out.println(joinString);
    }
}
