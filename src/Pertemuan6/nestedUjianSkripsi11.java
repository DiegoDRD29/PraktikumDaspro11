package Pertemuan6;

import java.util.Scanner;
//no absen=11
//Syarat minimal log bimbingan Pembimbing 1 =6 + (11 mod 5)=  7
 //Syarat minimal log bimbingan Pembimbing 2 =3 + (11 mod 3)= 5 

public class nestedUjianSkripsi11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebaskompen = Diego.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = Diego.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = Diego.nextInt();
        if (bebaskompen.equalsIgnoreCase("ya")){
        if (bimbinganP1 >= 7 && bimbinganP2 >= 5){
                pesan = "semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi ";
            }else if (bimbinganP1 < 7 && bimbinganP2 <5){
                pesan = "Gagal! log bimbingan P1 belum mencapai 8 kali: ";
            }else if (bimbinganP1 < 7){ 
                pesan = "Gagal! log bimbingan P1 belum mencapai 8 kali ";
            } else {
                pesan = "Gagal! log bimbingan P2 belum mencapai 4 kali ";
        }
    }else{
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen ";
}
System.out.println(pesan);
Diego.close();
 }
}