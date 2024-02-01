package Classes.WrapperClass;

import javax.crypto.interfaces.DHKey;

/*
 * The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below:

Primitive Type	Wrapper class
boolean	 Boolean
char	Character
byte	Byte
short	Short
int	   Integer
long	Long
float	Float
double	Double
 */

//program to convert all primitive classes to corresponding wrapper classes and vice versa

public class WrapperClassesExample {
    public static void main (String[]Args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: converting primitive to objects
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        //Printing object
        System.out.println("___Printing Object Values____");
        System.out.println("Byte Object: " + byteobj );
        System.out.println("Short Object: " + shortobj );
        System.out.println("Integer Object: " + intobj );
        System.out.println("Long Object: " + longobj );
        System.out.println("Float Object: " + floatobj );
        System.out.println("Double Object: " + doubleobj );
        System.out.println("Character Object: " + charobj );
        System.out.println("Boolean Object: " + boolobj );

        //unboxing: converting objects to primitives
        byte byteValue = byteobj;
        short shortValue = shortobj;
        int intValue = intobj;
        long longValue = longobj;
        float floatvalue = floatobj;
        double doublevalue= doubleobj; 
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        //printing primitives
        System.out.println();
        System.out.println("---Printing primitive Values");
        System.out.println("Byte Value: " + byteValue );
        System.out.println("short Value: " + shortValue );
        System.out.println("int Value: " + intValue );
        System.out.println(" long Value: " + longValue  );
        System.out.println(" float Value: " + floatvalue );
        System.out.println("double Value: " + doublevalue );
        System.out.println("char Value: " +  charvalue);
        System.out.println(" boolean Value: " + boolvalue );
        
    }

}
