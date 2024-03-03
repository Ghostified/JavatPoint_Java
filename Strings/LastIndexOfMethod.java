package Strings;

public class LastIndexOfMethod {

    public static final String stringOne = "This is index of Example ";

    //getter method for stringOne
    public String getStringOne () {
        return stringOne;
    }

    public static void main(String[] args) {
        Example16 object = new Example16();
        object.lastIndexMethod1();
    }
}
class Example16 {
    public static void  lastIndexMethod1() {
        LastIndexOfMethod instance = new LastIndexOfMethod();
        String stringOne = instance.getStringOne();
        int index1 = stringOne.lastIndexOf('s');
        System.out.println(index1); //returns 6
    }
}
