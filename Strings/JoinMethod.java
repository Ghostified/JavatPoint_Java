package Strings;
/*
 * The join method is used to return a string joined together withe  agiven delimmiter
 */
public class JoinMethod {

    public static void main (String [] Args) {
        Example12 object = new Example12();
        object.joinExample1();

        Example13 object2 = new Example13();
        object2.joinExample2();

        //this method throws a null exception
        Example14 object3 = new Example14();
        object3.nullDelimiter();

        //This method treats null elemets as elements of the string
        Example15 object4 = new Example15();
        object4.delimiterWithNull();
    }

}
class Example12 {
    public static void joinExample1() {
        String joinString = String.join("-", "Welcome", "to","Hogwarts");
        System.out.println(joinString);
    }
}
class Example13 {
    public static void  joinExample2 () {
        String date = String.join("/", "2", "03","2024");
        System.out.print(date);
        String time = String.join(":", "14", "00" , "Hrs");
        System.out.println(" " + time);

    }
}

//in case of a null delimitter, a null pointer exception is thrown
class Example14 {
    public static void nullDelimiter () {
        String string = "null";
        string = String.join(null, "abc", "def", "ghi");
        System.out.println(string);
    }
}

//if aelements have to be attached with a delimiter with some strings , 
//which some are null, the null elements are treated as a normal string

class Example15 {
    public static void delimiterWithNull() {
         String string = null;

         //if one of the elements is null, it gets trated as a normal string 
         string = String.join("-",null ,"Welcome to", "null", "Hogwarts", "School ", null, "of Magic");
         System.out.println(string);
    }
}