package Strings.indexOfMethod;

public class IndexOfMethodAllExamples {
    //declare the constant final string:
    private static final String stringName = "This is indexOf example";
    private static final String stringName2 = "This is indexOf method";

    //getter method to access the stringName in the FindCountClass
    public String getStringName() {
        return stringName;
    }

    //getter method for stringName2
    public String getStringName2() {
        return stringName2;
    }


    public static void main(String[] Args) {
        FindCount object= new FindCount();
        object.findCount();

        ExampleOne object2 = new ExampleOne ();
        object2.exampleOne();

        SubstringArgument object3 = new SubstringArgument();
        object3.indexOfSubstringFirstChar();

        SubstringAndIndex object4 = new SubstringAndIndex();
        object4.example3();

        CharAndIndexArgument object5 = new CharAndIndexArgument();
        object5.example4();
    }
}

class ExampleOne {
    public static void exampleOne () {
        IndexOfMethodAllExamples instance = new IndexOfMethodAllExamples();
        String stringName = instance.getStringName();
        int index1 = stringName.indexOf("is");
        int index2 = stringName.indexOf("of");
        int index3 = stringName.indexOf("is", 4);
        int index4 = stringName.indexOf('s');
        
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        
    }
}


class FindCount {
    public static void findCount() {
        IndexOfMethodAllExamples instance = new IndexOfMethodAllExamples(); //create an instance of indexOf class
        String stringName = instance.getStringName(); //Get the stringName Variable from indexOf Class

        int count = 0;
        int startFrom = 0;
        while (true) //creating an infinite loop
        {
            int index = stringName.indexOf('s', startFrom);
            {
                if (index == -1) {
                    break;
                }
                count = count + 1; //increment count
                startFrom = index + 1; //Update startFrom to search from the next index
            }
        }
        System.out.println("The 'i' character has come " + count + " times" );
    }
}

//this method indexOf(String substring) takes a substring as an argument 
//it  returns the index of the first character in the substring

class SubstringArgument {
    public static void indexOfSubstringFirstChar () {
        IndexOfMethodAllExamples instance = new IndexOfMethodAllExamples();
        String stringName2 = instance.getStringName2();
        int index7 = stringName2.indexOf("method");
        System.out.println("The index of the first character in the substring (method) is:  " + index7);
        
    }
}

//this  class takes a substring and index as arguments 
// it returns the index of the first character that occurs after the given fromIndex

class SubstringAndIndex{
    public static void example3 () {
        IndexOfMethodAllExamples instance = new IndexOfMethodAllExamples();
        String stringName2 = instance.getStringName2();
        int index1 = stringName2.indexOf("method", 10);
        int index2 = stringName2.indexOf("method", 20);

        System.out.println("The index of the substring (method) is " + index1);
        System.out.println("The index of the substring (method) from index 20 is: " + index2);
    }
}

//this class takes takes a char and index as variables
//it returns the index of the first character that appears after the given from index
class CharAndIndexArgument 
{
    public static void example4 ()
    {
        IndexOfMethodAllExamples instance = new IndexOfMethodAllExamples();
        String stringName = instance.getStringName();
        String stringName2 = instance.getStringName2();
        int index1 = stringName.indexOf('f', 12);
        int index2 = stringName2.indexOf('m', 10);
        System.out.println("The index of char 'f' is: " + index1);
        System.out.println("The index of char 'm' is : " + index2);

    }
}




