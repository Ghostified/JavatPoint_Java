package Socket_Programming;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLClass {

    public static void main(String[] args) {
        example1();
        URLConnectionClass();
        
    }
    
    public static void example1 () {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("http://www.javatpoint.com/java-tutorial");

            System.out.println("Prorocol: " +url.getProtocol());
            System.out.println("Host Name: " +url.getHost());
            System.out.println("port number: " +url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void URLConnectionClass (){
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("http://www.javatpoint.com/java-tutorial");

            //open connection to url
            URLConnection urlcon = url.openConnection();

            //Get data from a webpage
            InputStream stream = urlcon.getInputStream();

            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char)i);
            }

            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
