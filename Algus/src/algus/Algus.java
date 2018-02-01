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
        ilmaKommentaar(3);
    }
    
}