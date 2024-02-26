package Strings.indexOfMethod;

public class Example5 {

    public static void main (String[] Args) {
        String s1 = "This is indexOf method";

        //passing char and index from
        int ind = s1.indexOf('e', 12); //returns index of this char
        System.out.println("The index of the char 'e'  is:  " + ind);
    }
}
