package Pertemuan5;

import java.util.Scanner;

public class PemilihanSwitch11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        System.out.println("Cetak KRS Siakad: ");
        System.out.println("Masukkan Semester saat ini: ");
        int Semester = Diego.nextInt();
        switch (Semester) {
            case 1:
                System.out.println("KRS semester 1 ditampilkan: ");
                break;
            case 2:
                System.out.println("KRS semester 2 ditampilkan: ");
                break;
            case 3:
                System.out.println("KRS semester 3 ditampilkan: ");
                break;
            case 4:
                System.out.println("KRS semester 4 ditampilkan: ");
                break;
            case 5:
                System.out.println("KRS semester 5 ditampilkan: ");
                break;
            case 6:
                System.out.println("KRS semester 6 ditampilkan: ");
                break;
            case 7:
                System.out.println("KRS semester 7 ditampilkan: ");
                break;
            case 8:
                System.out.println("KRS semester 8 ditampilkan: ");
                break;
            default:
                System.out.println("semester tidak valid: ");
                
                Diego.close();
        }
    }
    
}
