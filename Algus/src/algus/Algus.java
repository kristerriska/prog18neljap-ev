/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 * Esimene katsetus. Muutujad, valik, massiiv
 * @author provisional
 */
public class Algus {
    
    /**
     * Alamprogramm toa soojuse hindamiseks vastavalt temperatuurile.
     * vähemalt kolm taset
     */
    public static void toatemperatuur(int temperatuur){      
        if(temperatuur<18){System.out.println("Külm");}
        if(temperatuur>30){System.out.println("Palav");}
        if(temperatuur>18){System.out.println("Paras");}
    }
    
    /**
     * Arvamus ilma kohta 
     */
    public static void ilmaKommentaar(int temperatuur){      
        if(temperatuur>0){System.out.println("sulab");}
        else{System.out.println("Jäätab");}    
    }
    
    /**
     * Programmi töö alguskoht. Siit alustatakse käivitamisel
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Hello, Web!");

        ilmaKommentaar(-2);
        toatemperatuur(9);
    }
    
    
}
