package Arrays;
/*
 * get the class name of an array using the getClass().getName () methods
 */
public class ArrayClassName {

    public static void main(String[] args) {
        int array[] = {20,30,99};

        //get the class name of the array
        Class c = array.getClass();
        String name = c.getName();

        //print the class name
        System.out.println(name);
        
    }
}
