package Strings.FormartMethod;
/*
 * The String.formart() supports diffrent data types
 */
public class Example2 {

    public static void main(String[] args) {

        String s1 = String.format("%d", 101); //integer Value
        String s2 = String.format("%s","Hermione Granger"); //String 
        String s3 = String.format("%f",101.000); //float
        String s4 = String.format("%x", 101); //hexadecimal
        String s5 = String.format("%c",'c'); //charvalue

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
