
package SerializationRelationships;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * If a class implements a Serializabele interface then all its sub classs will be serializable 
 */
public class SerializationWithInheritance {

    public static void main(String[] args) {
        SerializeISA.serializeISA();
        
        
    }
}



class Person implements Serializable {
    int id;
    String name;

    Person (int id , String name){
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    String course ;
    int fee;
    public Student (int id, String name, String course, int fee) {
        super (id,name);
        this.course = course;
        this.fee= fee;
    }
}

class SerializeISA {
    static void serializeISA () {
        SerializationWithInheritance instance = new SerializationWithInheritance();
        try {

            //Creattinga an object 
            Student s1 = new Student(211, "Potter", "DADA", 4000);

            //Creating a stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream bout = new ObjectOutputStream(fout);
            
            bout.writeObject(s1);
            bout.flush();

            //closing the stream
            bout.close();
            System.out.println("Done");



        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            //Creating a new stream to read the object
            ObjectInputStream bin = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student)bin.readObject();

            //printing the data of the serializable object
            System.out.println(s.id + " " + s.name+ " " + s.course +" " + s.fee);

            //close the stream
            bin.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}