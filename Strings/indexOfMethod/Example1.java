package Strings.indexOfMethod;
/*
 * The indexOf () method returns the position of the first occurence of the specified character or string in a specified string
 * int indexOf(int ch) = returns the index position for a given char value
 * int indexOf(int ch, int fromIndex) = returns the index positon for a given char value and from index
 * int indexOf(String substring) = returns index position of a given substring
 * int indexOf(String substring, int fromIndex) = return index of position of the given substring and from index
 */
public class Example1 {

    public static void main(String[] args) {
        
        String s1 = "this is index of example";

        //passing substring
        int index1 = s1.indexOf("is"); //returns index of the is substring
        int index2 = s1.indexOf("index"); // returns index of index substring
        System.out.println(index1 + " " + index2); //returns 2 and 8

        //passing substring with from index
        int index3 = s1.indexOf("is", 4); //returns  the index of is substring after 4th index
        System.out.println(index3); //5 i.e the index of another is

        //passing char value
        int index4 = s1.indexOf('s'); //returns the index of s char value
        System.out.println(index4); //3
    }
}
