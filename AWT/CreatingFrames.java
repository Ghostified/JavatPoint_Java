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
        
       // CreateFrameByInheritance obj = new CreateFrameByInheritance();
        //obj.AWTEXample1();

        createFrameByAssociation();

    }

    //Create  a Frame by association means creating an object  of the Frame class

    public static void createFrameByAssociation () {

        //Creating a new Fame
        Frame f = new Frame();

        //Creating a label
        Label l = new Label("Eployee ID:");

        //Creating a buttton
        Button b= new Button("Submit");

        //Create a text filed
        TextField tf = new TextField();

        //Setting  the frame  details
        f.setResizable(false);
        f.setTitle("AWT Example");
        //f.setBackground("Blue");
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);

        //Setting position of the components on the frame
        l.setBounds(20,80,80,30);
        b.setBounds(100,100,80,30);
        tf.setBounds(20,100,80,30);
        //tf.setFont(null);
        

        //Add components to the frame
        f.add(b);
        f.add(tf);
        f.add(l);

    }
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

