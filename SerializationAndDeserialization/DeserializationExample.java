package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/*
 * This is the process of deconstructing a an object from a serialized state
 * In  the example below we are readfing the data from a deserialization object
 */
public class DeserializationExample {
    public static void main(String[] args) {
        try{
        //creating a stream to read the object
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("f.txt"));
        SerializableInterface s = (SerializableInterface)obj.readObject();

        //Printing the data from the serialized object
        System.out.println(s.id + " " + s.name);

        //Close the stream
        obj.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
