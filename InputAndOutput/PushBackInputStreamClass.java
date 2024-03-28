package InputAndOutput;

import java.io.ByteArrayInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.PushbackInputStream;

/* 
 * The pushbck input stream overrides input stream
 */
public class PushBackInputStreamClass {

    public static void main(String[] args) {
        
        pushBackInputStreamClass();
    }

    public static void pushBackInputStreamClass () {
        try {
            String srg = "1#####33###2443";
            byte  arr[] = srg.getBytes();
            ByteArrayInputStream array = new ByteArrayInputStream(arr);
            PushbackInputStream push = new PushbackInputStream(array);

            int i;
            while ((i = push.read()) != -1){
                if ( i == '#') {
                    int j;
                    if ((j = push.read()) == '#'){
                        System.out.println("**");
                    } else {
                        push.unread(j);
                        System.out.println((char)i);
                    }
                }else
                 {
                    System.out.println((char) i);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
