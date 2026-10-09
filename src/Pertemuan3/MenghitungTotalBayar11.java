package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        double harga;
        double potongan;
        double diskon=0.15;
        double jml_harga;

         System.out.println("harga: ");
         harga = Diego.nextDouble();

         potongan = diskon*harga;
         System.out.println("potongan : " +potongan);
         jml_harga=harga-potongan;
         System.out.println("jumlah yang anda harus bayar adalah RP" + jml_harga);

         Diego.close();
            }
    
}
