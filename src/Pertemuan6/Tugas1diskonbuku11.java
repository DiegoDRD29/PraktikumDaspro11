package Pertemuan6;

import java.util.Scanner;

public class Tugas1diskonbuku11 {
    public static void main(String[] args) {
        Scanner Diego= new Scanner (System.in);

        int P = 11;

        double diskon = 0;

        System.out.print("Masukkan jenis buku (kamus/novel/lain): ");
        String jenis = Diego.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlah = Diego.nextInt();

        // Nested IF
        if (jenis.equals("kamus")) {
            diskon = 8 + (P % 5);
            if (jumlah > (2 + (P % 2))) {
                diskon += 2;
            }
        } else {
            if (jenis.equals("novel")) {

                diskon = 5 + (P % 4);
                if (jumlah > (3 + (P % 2))) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
            } else {

                if (jumlah > (3 + (P % 2))) {
                    diskon = 3 + (P % 4);
                } else {
                    diskon = 0;
                }

            }
        }
        System.out.println("Jenis buku : " + jenis);
        System.out.println("Jumlah buku: " + jumlah);
        System.out.println("Diskon     : " + diskon + "%");
        Diego.close();
    }
    
}
