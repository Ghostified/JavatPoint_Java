package JavaPrograms.ArrayPrograms;

public class ReverseString {

    public static void main(String[] args) {
        reverseString();
    }

    public static void reverseString () {

        String str = "James";
         int  size = str.length();
         String result = "";

         for (int i = size -1; i >= 0; i--) {
              //result = result + str.charAt(i);
              System.out.print(str.charAt(i));

         }
    }
}
