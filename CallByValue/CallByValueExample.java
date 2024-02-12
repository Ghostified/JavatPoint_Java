package CallByValue;
/*
 * If we call a method by calling a value, its called call by value
 * The changes being done in the called method , is not affected by the calling method
 */
class CallByValueExample {

    int data = 50;

    void change (int data) {
        data = data + 100; //changes will be in the local variable only
    }

    public static void main(String[] args) {
        CallByValueExample example = new CallByValueExample();

        System.out.println("Before change" + example.data);
        
        example.change(1000);

        System.out.println("After change" + example.data);
    }

}
