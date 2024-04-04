package Socket_Programming.Sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket  (3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = " ", str2 = " ";
        while(!str.equals("stop")) {
            System.out.println("Client says " + str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.writeUTF(str2);
            dout.flush();
        }

        din.close();
        ss.close();
        s.close();

    }
}
