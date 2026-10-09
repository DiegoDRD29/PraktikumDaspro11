package Pertemuan2;

import java.util.Scanner;

public class PT_XYZ11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        int gajipokok,jumlahanak,totaltunjangan;
        double potongangaji = 0.1;
        int besartunjangan = 10000;
        double totalpotongan,gajibersih;

        System.out.println("besar gaji pokok: ");
        gajipokok = Diego.nextInt();
        System.out.println("jumlah anak");
        jumlahanak = Diego.nextInt();

        totaltunjangan = besartunjangan * jumlahanak;
        totalpotongan = gajipokok * potongangaji;
        gajibersih = gajipokok - totalpotongan + totaltunjangan;

        System.out.println("total tunjangan : "+totaltunjangan);
        System.out.println("total potongan : "+totalpotongan);
        System.out.println("gaji bersih : "+gajibersih);

        Diego.close();
    }
    
}
