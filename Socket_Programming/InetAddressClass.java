package Socket_Programming;

import java.net.InetAddress;

/*
 * The InetAddress Class represents the IP address i.e get the ip address of any host name 
 */
//get ip address of a domain
public class InetAddressClass {

    public static void main(String[] args) {
        getIP();
        
    }

    public static void getIP () {
        try {

            InetAddress ip = InetAddress.getByName("calltronix.com");

            System.out.println("Hostname: " +ip.getHostName());
            System.out.println("IP address: " + ip.getHostAddress());


        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    //Methods in the class:

}
 