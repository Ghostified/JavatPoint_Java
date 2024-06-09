package JavaPrograms.Basic;

public class ComparingTwoObjects {

    //The equals method compares identinty of two objects 
   // The == comparator compares variables

    public static void main(String[] args) {


        Double x = new Double( 323454);
    Long y = new Long (323454);

    if ( x.equals(y) ){
        System.out.println("X and y are equal");
    } else {
        System.out.println("X & Y are not equal");

    }    
    }

}
