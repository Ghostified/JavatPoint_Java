package Socket_Programming;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.sound.midi.Soundbank;

/*
 * The InetAddress Class represents the IP address i.e get the ip address of any host name 
 */
//get ip address of a domain
public class InetAddressClass {

    public static void main(String[] args) {
        getIP();
        inetAddressClassMethods();
        
    }

    public static void getIP () {
        try {

            InetAddress ip = InetAddress.getByName("google.com");

            System.out.println("Hostname: " +ip.getHostName());
            System.out.println("IP address: " + ip.getHostAddress());


        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    //Methods in the class:
    
    public static void inetAddressClassMethods () {

        try {

            InetAddress ip = Inet4Address.getByName("google.com");
            InetAddress ip1 [] = InetAddress.getAllByName("google.com");
            byte addr [] = {72, 3,2,12};
            System.out.println("ip : " + ip);
            System.out.print("\nip1 : " + ip1);
            InetAddress ip2 = InetAddress.getByAddress(addr);
            System.out.print("\nip2 : " + ip2);
            System.out.print("\nAdresss : " + Arrays.toString(ip.getAddress()));
            System.out.println("Host Name : " + ip.getHostAddress());
            System.out.println("isAny Local Adress: " + ip.isAnyLocalAddress() );
            System.out.println("isLink Local Adress: " + ip.isLinkLocalAddress());
            System.out.println("isLoopBacKAdress: " + ip.isLoopbackAddress());
            System.out.println("isMCGlobal : " + ip.isMCGlobal());
            System.out.println("isMCLinkLocal : " + ip.isMCLinkLocal());
            System.out.println("isMCNOdeLocal: " + ip.isMCNodeLocal());
            System.out.println("isMCOrgLocal : " + ip.isMCOrgLocal());
            System.out.println("isMCSiteLocal:  "+ip.isMCSiteLocal());
            System.out.println("isMulticastAdress: " + ip.isMulticastAddress());
            System.out.println("isSiteLocalAdress: " + ip.isSiteLocalAddress());
            System.out.println("HashCode: " +ip.hashCode() );
            System.out.println("is ip1 == ip2: " + ip.equals(ip2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 