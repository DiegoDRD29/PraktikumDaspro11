package Pertemuan7;

import java.util.Scanner;

public class studikasus111 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
    int P = 11;
 // Nilai yang disesuaikan dengan P
        int hargaPerCup = 15000 + (P % 6) * 1000;       // Rp20.000
        int minimalBelanja = 80000 + (P % 5) * 10000;   // Rp90.000
        int persenDiskon = 5 + (P % 6);                 // 10%

        // Input jumlah cup
        System.out.print("Masukkan jumlah cup: ");
        int jumlahCup = Diego.nextInt();

        // Hitung total belanja
        int totalBelanja = jumlahCup * hargaPerCup;
        double diskon = 0;

        // Cek syarat diskon
        if (totalBelanja >= minimalBelanja) {
            diskon = totalBelanja * persenDiskon / 100.0;
        }

        double totalBayar = totalBelanja - diskon;

        // Output
        System.out.println("\n=== Kedai Kopi Senja ===");
        System.out.println("Harga per cup  : Rp" + hargaPerCup);
        System.out.println("Jumlah cup     : " + jumlahCup);
        System.out.println("Total belanja  : Rp" + totalBelanja);
        System.out.println("Diskon (" + persenDiskon + "%)  : Rp" + (int) diskon);
        System.out.println("Total bayar    : Rp" + (int) totalBayar);

        Diego.close();
    }
}