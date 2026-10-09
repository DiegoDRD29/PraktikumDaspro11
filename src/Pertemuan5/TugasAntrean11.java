package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        System.out.println("Masukkan kode layanan 1-4");
        System.out.println("1. legalisir ijazah");
        System.out.println("2. Surat keterangan aktif kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan cuti akademik");
        int layanan = Diego.nextInt();
        switch (layanan) {
            case 1:
                System.out.println("anda bisa menuju loket A untuk pelayanan lebih lanjut ");
                break;
            case 2:
                System.out.println("anda bisa menuju loket B untuk pelayanan lebih lanjut ");
                break;
            case 3:
                System.out.println("anda bisa menuju loket C untuk pelayanan lebih lanjut ");
                break;
            case 4:
                System.out.println("anda bisa menuju loket D untuk pelayanan lebih lanjut ");
                break;
                 default:
                System.out.println("maaf menu atau kode yang anda pilih tidak tersedia: ");
    }
    Diego.close();
    }
    }
