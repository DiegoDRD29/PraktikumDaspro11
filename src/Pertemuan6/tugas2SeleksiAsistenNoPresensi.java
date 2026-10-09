package Pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
         int P = 11;
        int syaratNilaiDP = 75 + (P % 11);
        int syaratNilaiWawancara = 70 + (P % 11);

        // Input data mahasiswa
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean aktif = Diego.nextBoolean();

        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (true/false): ");
        boolean sanksi = Diego.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDP = Diego.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = Diego.nextBoolean();

        System.out.print("Masukkan nilai wawancara: ");
        int nilaiWawancara = Diego.nextInt();

        // Seleksi tahap 1
        if (aktif && !sanksi) {
            // Seleksi tahap 2
            if (nilaiDP >= syaratNilaiDP || sertifikat) {
                // Seleksi tahap 3
                if (nilaiWawancara >= syaratNilaiWawancara) {
                    System.out.println("Selamat! Anda diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal: Nilai wawancara kurang dari " + syaratNilaiWawancara);
                }
            } else {
                System.out.println("Gagal: Nilai Dasar Pemrograman kurang dari " + syaratNilaiDP +
                                   " dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal: Mahasiswa tidak aktif atau sedang mendapat sanksi akademik.");
            Diego.close();
        }

    }
}
