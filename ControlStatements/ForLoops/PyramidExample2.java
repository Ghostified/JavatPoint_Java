package ControlStatements.ForLoops;

public class PyramidExample2 {

    public static void main (String [] Args) {

        int term = 6 ; 
        for (int i = 1; i <= term ; i++) {
            for (int j = term ; j>= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
