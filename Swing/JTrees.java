package Swing;
/*
 * JTree class is used to display the tree structured data or hierachial data with aroot node 
 */

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTrees {

    JFrame f;
    JTrees () {
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add (font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        JTree jt = new JTree(style);
        DefaultMutableTreeNode sans = new DefaultMutableTreeNode("Sans Serif");
        DefaultMutableTreeNode verdana = new DefaultMutableTreeNode("Verdana");
        DefaultMutableTreeNode times  = new DefaultMutableTreeNode("Times New Roman");
        DefaultMutableTreeNode calibri = new DefaultMutableTreeNode("Calibri");
        font.add(calibri);
        font.add(sans);
        font.add(verdana);
        font.add(times);
    
        f.add(jt);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTrees();
    }
}
