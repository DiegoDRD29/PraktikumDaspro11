package Pertemuan7;

import java.util.Scanner;

public class studikasus2_11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = Diego.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        String jenis = Diego.nextLine().trim().toUpperCase();

        String status;
        String alasan;

        // Tingkat 1: cek jenis kegiatan
        if (jenis.equals("LAINNYA")) {
            status = "TIDAK DIBERIKAN";
            alasan = "Kegiatan kategori Lainnya tidak memperoleh dana penghargaan.";
        } else if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            int dokumen = Diego.nextInt();
            System.out.print("Masukkan peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            int juara = Diego.nextInt();

            // Tingkat 2: cek status juara
            if (juara >= 1 && juara <= 3) {
                // Tingkat 3: cek kelengkapan dokumen
                if (dokumen == 4) {
                    status = "DIBERIKAN";
                    alasan = "Peraih Juara " + juara + " dan keempat dokumen lengkap.";
                } else {
                    status = "TIDAK DIBERIKAN";
                    alasan = "Dokumen tidak lengkap, masih kurang " + (4 - dokumen) + " dokumen.";
                }
            } else {
                status = "TIDAK DIBERIKAN";
                alasan = "Bukan peraih Juara 1, 2, atau 3 (Juara Harapan/peserta tidak mendapat dana).";
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            int dokumen = Diego.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int pkm = Diego.nextInt();

            // Tingkat 2: cek lolos pendanaan
            if (pkm == 1) {
                // Tingkat 3: cek kelengkapan dokumen
                if (dokumen == 4) {
                    status = "DIBERIKAN";
                    alasan = "Tim PKM lolos pendanaan dan keempat dokumen lengkap.";
                } else {
                    status = "TIDAK DIBERIKAN";
                    alasan = "Dokumen tidak lengkap, masih kurang " + (4 - dokumen) + " dokumen.";
                }
            } else {
                status = "TIDAK DIBERIKAN";
                alasan = "Tim PKM tidak lolos pendanaan.";
            }
        } else {
            status = "TIDAK VALID";
            alasan = "Jenis kegiatan tidak dikenali.";
        }

        System.out.println("\n===== HASIL PENGECEKAN =====");
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + jenis);
        System.out.println("Status dana    : " + status);
        System.out.println("Alasan         : " + alasan);

          Diego.close();
    }
}
    
