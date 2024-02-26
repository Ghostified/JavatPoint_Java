package Strings.FormartMethod;
/*
 * Using the String.formart for padding, set width...
 */
public class Example3 {

    public static void main (String [] Args) {
        String s1 = String.format("%d",101 );
        String s2 = String.format("|%10d|",101);
        String s3 = String.format("|%-10d|",101 );
        String s4 = String.format("|% d|",101);
        String s5 = String.format("|%010d|",101);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

}
