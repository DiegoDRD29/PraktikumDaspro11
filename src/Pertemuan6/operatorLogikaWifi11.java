package Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi11 {
    public static void main(String[] args) {
       Scanner Diego = new Scanner (System.in);
       boolean mahasiswa;
       boolean dosen;
       boolean akundiblokir;

       System.out.println("Apakah pengguna mahasiswa? (true/false:) ");
       mahasiswa = Diego.nextBoolean();

       System.out.println("Apakah pengguna dosen? (true?false): ");
       dosen = Diego.nextBoolean();

       System.out.println("Apakah akun sedang diblokir? (true/false): ");
       akundiblokir = Diego.nextBoolean();

       if ((mahasiswa && dosen) && !akundiblokir) {
        System.out.println("akses wifi diberikan");
       }else{
        System.out.println("akses wifi ditolak");
        Diego.close();
        
       }


        
    }
    
}
