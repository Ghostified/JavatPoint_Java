package Socket_Programming;
import java.net.*;
/*
 * Works oly for the HTTP protocol only
 */
public class HTTPClass {
    public static void main(String[] args) {
        try {

            @SuppressWarnings("deprecation")
            URL url =  new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();

            for (int i = 1; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
