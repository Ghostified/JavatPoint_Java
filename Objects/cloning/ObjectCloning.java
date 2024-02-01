package Objects.cloning;
//Object Cloning is a way of creating a exct coppies of an object 
//the clone () method .of the object classis used to clone object
/*
 * the java.lang.clonable interface must be implementedby the class whose object clone we want to create
 * syntax:
 * protected Object clone () throws CloneNotSupportedException
 * 
 * advantages:
 * fastest way to coppy an array
 * efficient to copy objects 
 * reduces repetition
 */

 //example
 class Students implements Cloneable {
    int rollNo;
    String name;

    Students (int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    //public class ObjectCloning {

        public static void main(String[] Args) {
            try {
                Students s1 = new Students(101, "Harry Potter");

                Students s2 = (Students)s1.clone();

                System.out.println(s1.rollNo + " " + s1.name);
                System.out.println(s2.rollNo + " " + s2.name);
            } catch (CloneNotSupportedException c) {}
        }
    }

 //}
