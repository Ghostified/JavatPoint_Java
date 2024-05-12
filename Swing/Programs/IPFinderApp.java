package Swing.Programs;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Swing.JavaJOptionPane;

/*
 * Program to Find the IP adress of any host 
 */
public class IPFinderApp  extends JFrame implements ActionListener{
    JTextField textField;
    JButton button1 , button2;
    JLabel label1;

    public IPFinderApp() {
        super ("IP Finder");
        textField = new JTextField();
        textField.setBounds(100, 100, 200, 20);
        button1 = new JButton("Search IP");
        button1.setBounds(100, 200, 100,30);
        button2 = new JButton("Exit");
        button2.setBounds(220, 200, 80, 30);
        label1 = new JLabel("IP FINDER");
        label1.setBounds(120,40,300,20);
        label1.setFont(new Font("Time New Roman", Font.BOLD, 28));
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(textField);
        add(button1);
        add(button2);
        add(label1);
        setSize(400,400);
        setLayout(new BorderLayout());
        setTitle("IP Finder by Branson A.");
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new IPFinderApp();
        
    }

    public void actionPerformed (ActionEvent e) {
        String stringInput = e.getActionCommand();
        if (stringInput. equals("Search IP")) {
            try {
                String url = textField.getText ();
                InetAddress inet = InetAddress.getByName(url);
                String ip = inet.getHostAddress();
                JOptionPane.showMessageDialog(this, ip);
            } catch (UnknownHostException eh) {
                JOptionPane.showMessageDialog(this, "Enter a valid URL", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }

        else if (stringInput.equals("EXIT")){
            dispose();
            repaint();
        }
    }

}
