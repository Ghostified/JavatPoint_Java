package CallByValue;

 class CallByValueExampleTwo {

    int data = 100;

    void change (CallByValueExampleTwo example) {
        example.data = example.data + 200; //changes would be in the instance variable

    }

    public static void main(String[] args) {
        CallByValueExampleTwo example = new CallByValueExampleTwo();

        System.out.println("Before Changes: " + example.data);

        //Passing object
        example.change(example);

        System.out.println("Before Changes: " + example.data);

    }
}
