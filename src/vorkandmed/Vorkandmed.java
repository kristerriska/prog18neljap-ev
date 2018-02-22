package vorkandmed;
import java.net.*;
import java.io.*;
public class Vorkandmed {
    public static void main(String[] arg) throws Exception {
        String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
        BufferedReader br=new BufferedReader (new InputStreamReader (
            new URL(aadress) .openStream()
        ));
        String rida=br.readLine();
        System.out.println("Tulbad: "+rida);
        rida=br.readLine();
        double[] summad=new double[rida.split(",").length];
        int kogus=0;
        while(rida!=null) {
            String[] m=rida.split (",");
            for(int i=0; i<m.length; i++) {
                summad[i]+=Double.parseDouble(m[i]);
            }
            kogus++;
            System.out.println(m[0]);
            rida=br.readLine();
        }
        br.close();
        System.out.println("Augusti summa: "+summad[0]);
        System.out.println("Septembri keskmine: "+summad[1]/kogus);
        //Kuvage augusti diameetrite summa ning septembri diameetrite keskmine
        
    }
    
}
