package Socket_Programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * DatagramSocket Class is used for connection - less class UDP instead of TCP
 * DtagramSocketClass is used to a connection less class used to used for sending and receiving datagram
 */
//Example sending DtagramPacket by Datagram
public class DatagramSocketClass {
    public static void main(String[] args) {
        datagramSending();
        
    }

    //send Datagram packet using datagram class
    public static void datagramSending () {
        try {
            DatagramSocket  ds = new DatagramSocket();
            String str = "Welcome to Hogwarts";
            InetAddress ip = InetAddress.getByName("127.0.0.1");

            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip ,3000);
            ds.send(dp);
            ds.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
