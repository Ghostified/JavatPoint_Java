package ThisKeyword;
class A{  
    A getA(){  
    return this;  
    }  
    void msg(){System.out.println("Hello java");}  
    }
public class ThisToReturnCurrentClassInstance {
    public static void main(String args[]){  
        new A().getA().msg();  
        }  
}
