package ControlStatements;
/*
 * Used to traverese data structures  like arrays
 *  
 * syntax 
 * for(data_type: array_name/collection_name) {
 * //statement
 * }
 */
public class ForEach {

    public static void main (String []Args) {
        String [] names = {"java", "c", "c++","Python","TS"};
        System.out.println("Printing out the array namese");
        System.out.println();
        for (String name: names) {
            System.out.println(name);
        }
    }
}
