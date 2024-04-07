package Socket_Programming;

import java.net.URL;

public class URLClass {

    public static void main(String[] args) {
        example1();
        
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
}
