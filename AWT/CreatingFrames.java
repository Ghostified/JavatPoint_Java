package AWT;

import java.awt.*;
/*
 * Creatinga  a GUI using Frame in AWT by:
 * Extending a Frame Class : Inheritance
 * By creating the object of Frame class : association
 * 
 *  
 */
public class CreatingFrames {

    public static void main (String [] Args) {
        
        CreateFrameByInheritance obj = new CreateFrameByInheritance();
        obj.AWTEXample1();

    }

    //Create  a Frame by association means creating an object  of the Frame class
}

//Creating a Frame by inheritance
//Done by extending a Frame class

class CreateFrameByInheritance extends Frame {

    CreatingFrames obj = new CreatingFrames();

    //Initializing the constructor 
     void AWTEXample1 () {

        //sety title of the Frame
        setTitle("Baic AWT");

        //set Layout
        setLayout(null);

        //set visible
        setVisible(true);

        //Creating a button

        Button b = new Button ("Click Me");

        //set button position on screan
        b.setBounds (30,100,80,30);

        //Add component on the frame
        add(b);

        //set size of the frame
        setSize(300,300);

    }
}

