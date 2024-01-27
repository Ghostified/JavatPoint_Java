package FinalKeyword;
/*
 * A static final variable that is not initialized at the time of declaration is known as 
 * static blank varuable
 * It can only be initialized in static block
 */
class One {

    //static blank final variable
    static final int data;
    static {data = 2000;}

    public static void main(String[]Args) {
        System.out.println(One.data);
    }
}
