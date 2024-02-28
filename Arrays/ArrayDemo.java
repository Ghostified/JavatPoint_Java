package Arrays;

public class ArrayDemo {
public static void main(String[] args) {
    int data[] = new int[3];
    System.out.println("Arrays: ");
    for (int i =0; i < 3; i++) 
    {
        data[i] = i + 3;
        System.out.println("data[" + i + "] = " + data[i]);
    }
}
}
