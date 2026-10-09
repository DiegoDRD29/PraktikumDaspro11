package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLabNoPresensi {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        boolean mahasiswaaktif;
        boolean sedangdisanksi;
        boolean punyaizindosen;
        boolean asistenlab;

        System.out.println("apakah mahasiswa aktif? (true/false) ");
        mahasiswaaktif = Diego.nextBoolean();

        System.out.println("apakah mahasiswa punya izin dosen? (true/false) ");
         punyaizindosen = Diego.nextBoolean();

        System.out.println("apakah mahasiswa adalah asisten lab? (true/false) ");
        asistenlab = Diego.nextBoolean();

        System.out.println("apakah mahasiswa sedang disanksi? ");
        sedangdisanksi = Diego.nextBoolean();

        if (mahasiswaaktif && !sedangdisanksi) {
            if (punyaizindosen || asistenlab) {
                System.out.println("akses labolatorium diberikan ");
            } else {
                System.out.println("akses ditolak membutuhkan status asisten lab");
            }
        }else{
            System.out.println("akses ditolak: status mahasiswa tidsk memenuhi syarat");
            Diego.close();
        }
    }
}
                

