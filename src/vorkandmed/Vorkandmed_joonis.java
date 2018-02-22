package vorkandmed;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;

public class Vorkandmed_joonis extends JPanel {

    java.util.List<double[]> ounad;

    public java.util.List<double[]> kysiOunteAndmed() {
        if (ounad == null) {
            ounad=new ArrayList<>();
            try {
                String aadress = "http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        new URL(aadress).openStream()
                ));
                String rida = br.readLine();
                rida = br.readLine();
                while (rida != null) {
                    String[] m = rida.split(",");
                    double[] dm=new double[m.length];
                    for (int i = 0; i < m.length; i++) {
                        dm[i]=Double.parseDouble(m[i]);
                    }
                    ounad.add(dm);
                    rida = br.readLine();
                }
                br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return ounad;
    }
    
    void joonistaOunad(Graphics g){
        double koef=10;
        for(double[] m: kysiOunteAndmed()){
           g.fillOval(getHeight()-(int)(m[0]*10), (int)(m[1]*10), 5, 5);
        }
    }
    
    void ounteJoonisFaili(){
        try {
            BufferedImage bi=new BufferedImage (400, 300, BufferedImage.TYPE_INT_RGB);
            Graphics g=bi.createGraphics();
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, 400, 300);
            g.setColor(Color.RED);
            joonistaOunad(g);
            ImageIO.write(bi, "png", new File("Y:\\Krister Riska\\Programmeerimise põhikursus\\joonis.png"));
        }catch(Exception ex) {ex.printStackTrace();}
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        joonistaOunad(g);
        ounteJoonisFaili();        
    }

    public static void main(String[] arg) {
        JFrame f = new JFrame("Õunte joonis");
        f.getContentPane().add(new Vorkandmed_joonis());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}