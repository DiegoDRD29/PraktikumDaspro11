package Pertemuan5;

import java.util.Scanner;

public class Tugas2pemilihan11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int jumlahSKS;

        System.out.println("masukkan jumlah SKS: ");
        jumlahSKS = Diego.nextInt();

         if (jumlahSKS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
 Diego.close();
    }
}
