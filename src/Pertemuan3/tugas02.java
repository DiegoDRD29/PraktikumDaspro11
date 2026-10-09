package Pertemuan3;

import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int jml_lembar;
        int biayacetak = 500;
        int biayajilid = 5000;
        int biayacetaktotal;
        int totalbiaya;

        System.out.println("jml_lembar: ");
        jml_lembar = Diego.nextInt(); 

        biayacetaktotal = jml_lembar * biayacetak;
        totalbiaya = biayacetaktotal + biayajilid;

        System.out.println("biaya cetak total: " + totalbiaya);

        
        Diego.close();
    }
    
}
