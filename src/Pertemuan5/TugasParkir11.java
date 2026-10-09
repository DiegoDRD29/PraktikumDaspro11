package Pertemuan5;

import java.util.Scanner;

public class TugasParkir11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
         int lamaparkir,biayaawal=2000,biayatambahan=1000;
         int totalparkir;
        System.out.println("masukkan lama parkir: ");
        lamaparkir = Diego.nextInt();
        if ( lamaparkir >= 2 ) {
            totalparkir = biayaawal + (biayatambahan *(lamaparkir-2));
            System.out.println("total parkir anda adalah" + totalparkir);
        } else {
            System.out.println("biaya parkir 2000");
        }
        Diego.close();
    } 
}
