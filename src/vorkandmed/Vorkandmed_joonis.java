package vorkandmed;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Vorkandmed_joonis extends JPanel{
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.fillOval(30, 40, 5, 5);
    }
    public static void main(String[] arg) {
        JFrame f=new JFrame ("Õunte joonis");
        f.getContentPane().add(new Vorkandmed_joonis());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
