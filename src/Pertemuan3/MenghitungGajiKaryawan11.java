package Pertemuan3;

import java.util.Scanner;

public class MenghitungGajiKaryawan11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int gajipokok;
        double bonus,totgaji;
        double tunjtrasp=600000;
        double tunjmkn=400000;

        System.out.println("gajipokok: ");
        gajipokok=Diego.nextInt();
        bonus= 0.05*gajipokok;

        totgaji=gajipokok+tunjtrasp+tunjmkn+bonus-(0.1*gajipokok);
        System.out.println("bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("gaji yang anda terima adalah Rp." + (int) totgaji);
        
        Diego.close();
    }
    
}
