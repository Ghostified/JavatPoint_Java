package SerializationRelationships;
    //Serialization with Aggregation
    /*
     * Serialization converts an object into a byte stream
     * Deserialization converts a byte stream to an object
     * If we do not want an object to be serialized, we use the transient keyword
     * The transient keyword can also be used with class data members to prevent their serialization
     */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword{
    public static void main(String[] args) throws Exception{
        PersistExample.transientExample();
    }

}

class Student2 implements Serializable {
    int id;
    String name;
    transient int age; //This will not be serialized
public Student2 (String name, int id , int age) {
    this.name = name;
    this.id = id;
    this.age = age;
}
}

class PersistExample  {

     public static void transientExample () throws Exception {
        TransientKeyword obj = new TransientKeyword();
        Student2 S1 = new Student2("James", 11, 020);
        //writing the object into a file
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream bout = new ObjectOutputStream(fout);

        bout.writeObject(S1);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}