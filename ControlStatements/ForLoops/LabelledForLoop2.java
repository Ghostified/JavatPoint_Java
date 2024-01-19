package ControlStatements.ForLoops;

public class LabelledForLoop2 {
    public static void main (String [] Args) {
        aa: 
        for (int i =1 ; i < 4; i++) {
            bb:
            for (int j = 1; j < 4; j++) {
                if(i == 2 && j ==2) {
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
