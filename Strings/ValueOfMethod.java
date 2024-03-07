package Strings;
/*
 * The string valueOf () method converts any data type int a string
 */
public class ValueOfMethod {

    public static final int integer = 130;
    public static final boolean bool1 = true;
    public static final boolean boolean2 = false;
    public static final char character = 'a';

    public int  getInteger (){
        return integer;
    }

    public boolean getbool1 (){
        return bool1;
    }

    public boolean getBool2 () {
        return boolean2;
    }

    public char getChar () {
        return character;
    }

    public static void main(String[] args) {
        
        Example55 object = new Example55();
        Example56 object1 = new Example56();
        Example57 object3 = new Example57();
        Example58 object4 = new Example58();
        Example59 object5 = new Example59();
        Example60 object6 = new Example60();

        object.valueOfInt();
        object1.valueOfBool();
        object3.valueOfChar();
        object4.valueOfFloat();
        object5.valueOfDouble();
        object6.allApplication();
    }
}
class Example55 {
    public static void valueOfInt () {
        ValueOfMethod instance = new ValueOfMethod();
        int integer = instance.getInteger();
        String s1 = String.valueOf(integer);
        System.out.println(s1 + 10 ); //concatenates rather than adds 
    }
}

class Example56 {
    public static void valueOfBool () {
        ValueOfMethod instance = new ValueOfMethod();
        Boolean bool1 = instance.getbool1();
        Boolean bool2 = instance.getBool2();
        String s1 = String.valueOf(bool1);
        String s2 = String.valueOf(bool2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Example57 {
    public static void valueOfChar () {
        ValueOfMethod instance = new ValueOfMethod();
        char character = instance.getChar();
        String s1 = String.valueOf(character);
        System.out.println(s1);
    }
}

class Example58{
    public static void valueOfFloat () {
        float f1 = 10.05f;
        String s1 = String.valueOf(f1);
        System.out.println(s1);
    }
}

class Example59 {
    public static void valueOfDouble () {
        double d1 = 10.02;
        String s1 = String.valueOf(d1);
        System.out.println(s1);
    }
}
 class Example60 {
    public static void allApplication() {
        boolean b1 = true;
        byte b2 = 11;
        short sh = 12;
        int i = 10;
        long l = 14L;
        float f = 23.90f;
        double d = 16.5d;
        char chr[] = { 'a','b','c','d'};
    

        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

    }
 }