package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        System.out.println("cetak KRS siakad: ");
        System.out.println("apakah UKT sudah lunas? (true/false): " );
        boolean uktLunas = Diego.nextBoolean();
        String pesan = uktLunas ? "Pembayaran UKT Terverifikasi. Silahkan cetak KRS anda dan minta tanda tangan DPA: " : "Registrasi anda ditolak silahkan lunasi UKT anda terlebih dahulu: ";
        System.out.println(pesan);
            Diego.close();
        }
    }
    
