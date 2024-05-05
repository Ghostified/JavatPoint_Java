package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * JSlider class is used to create a slider  
 */
public class JSliders {
    public static void main(String[] args) {
        new SlideeExample1();
        new SliderExample2();
    }

}

//Example one 
class SlideeExample1 extends JFrame {
    public SlideeExample1 () {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 050,25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        pack();
        setVisible(true);
    }
}

//Example 2 slider with Paint ticks
 class SliderExample2 extends JFrame {
    public SliderExample2 () {
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        pack();
        setVisible(true);
    }
 }
