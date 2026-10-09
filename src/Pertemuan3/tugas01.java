package Pertemuan3;

import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        double hargalaptop;
        double uangmuka;
        double cicilanperbulan;
        double sisaharga;
        double bungaperbulan;
        double totalcicilanperbulan;
        int jml_bulan;

        System.out.println("hargalaptop: ");
        hargalaptop = Diego.nextDouble();
        
        System.out.println("uangmuka: ");
        uangmuka = Diego.nextDouble();

        System.out.println("jml_bulan: ");
        jml_bulan = Diego.nextInt();

         sisaharga = hargalaptop - uangmuka;
         cicilanperbulan = sisaharga / jml_bulan;
         bungaperbulan = 0.02 * sisaharga;
         totalcicilanperbulan = cicilanperbulan + bungaperbulan;

        System.out.println("jadi cicilan yang harus anda bayar adalah sebesar RP: " + totalcicilanperbulan);

         Diego.close();

        
    }
    
}
