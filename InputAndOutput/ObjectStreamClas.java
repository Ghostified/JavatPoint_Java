package InputAndOutput;

import java.util.Calendar;
import java.io.*;
import java.io.ObjectStreamClass;

/*
 * The ObjectStreamClass is a serialization decriptor for class 
 * Serialization is a process  of writing the state of an object into a byte stream
 * 
 */
public class ObjectStreamClas {
 public static void main(String[] args) {

    objectStreamClassExample2();
    AnotherExample();

    }

    public static void objectStreamClassExample2 () {
        //Create an Object Stream Field Class  representing a serializable field
        //With the name age and type int
        ObjectStreamField ageField =  new ObjectStreamField("age", int.class);

        //Get the name of the field 
        String fieldName = ageField.getName();
        System.out.println("Field Name : " + fieldName);

        //Get type of the field 
        Class<?> fieldType = ageField.getType();
        System.out.println("FieldType: " + fieldType);

        //check if the field is primitive
        boolean isPrimitive = ageField.isPrimitive();
        System.out.println("Is primitive: " + isPrimitive);

        //check if the field is shared or unshared
        boolean isUnshared = ageField.isUnshared();
        System.out.println("Is unshared:  " + isUnshared);

        //Get the jvm type signature of the field 
        String typeString = ageField.getTypeString();
        System.out.println("Type String: " +typeString);
    }

    public static void AnotherExample() {

          // create a new object stream class for Integers  
          ObjectStreamClas osc = ObjectStreamClas.lookup(String.class);  
  
          // get the value field from ObjectStreamClass for integers  
          System.out.println("" + osc.getField("value"));  
  
          // create a new object stream class for Calendar  
          ObjectStreamClas osc2 = ObjectStreamClas.lookup(Calendar.class);  
  
          // get the Class instance for osc2  
          System.out.println("" + osc2.getField("isTimeSet")); 
    }

}
