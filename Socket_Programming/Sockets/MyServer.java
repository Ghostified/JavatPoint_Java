package Socket_Programming.Sockets;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Example, a client sents a text and server receives and prints
 * 
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept(); //tablishes a connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println(" message " + str);
            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
