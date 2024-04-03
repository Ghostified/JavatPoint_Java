package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Enscapulation.Example1.Student;

/*
 *Serialization is a the process of  writing the state of an object into a byte stream
 *Deserialization is the opposite of serialization
 //Serialization is a marker interface , has no data memeber or mnethods
 // A serializable interface must be implemented by the class whose object needs to be persisted

 *  
 */

public class SerializableInterface  implements Serializable{ //SerializableInterface Class implements Serializable Inteerface 
    //Objects of the class can be converted into stream

    int id;
    String name;
    

    public SerializableInterface (int id, String name) {
        this.id = id;
        this.name = name; 
    
    }

}

class Persist {
    public static void main(String[] args) {
        try {

        //Creating the object
            SerializableInterface s1 = new SerializableInterface(211, "Jame");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);

            obj.writeObject(s1);
            obj.flush();
            System.out.println("Done");
        } catch (IOException EX) {

        };
        //Student S1 = new Student();
    }
}