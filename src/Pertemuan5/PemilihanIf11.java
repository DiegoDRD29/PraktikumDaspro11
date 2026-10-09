package Pertemuan5;

import java.util.Scanner;

public class PemilihanIf11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        System.out.println("Cetak KRS: ");
        System.out.println("Apakah UKT Lunas? (true/false): ");
        boolean uktLunas = Diego.nextBoolean();
        if(uktLunas){
            System.out.println("pembayaran UKT terverivikasi");
            System.out.println("silahakan cetak KRS dan minta tanda tangan DPA");
             } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        Diego.close();
    }
    
}
