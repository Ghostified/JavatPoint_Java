package Strings.indexOfMethod;

public class Example2 {

    public static void main(String[] args) {
        
        String s1 = "Welcome to Javatpoint";
        
        int count = 0; 
        int startFrom = 0;
        for (; ;) 
        {
            int index = s1.indexOf('o',startFrom);
            if (index >= 0) 
            {
                //match found hence increment the count
                count = count + 1;

                //start looking after the searched index
                startFrom = index + 1;
            }

            else 
            {
                //the value of index is -1 here. therefore terminate loop
                break;
            }
        }
        System.out.println("in the string: " + s1);
        System.out.println("The 'o' character has come " + count + "times");
    }
}
