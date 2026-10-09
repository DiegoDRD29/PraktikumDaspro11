package Pertemuan2;
import java.util.Scanner;
public class Segitiga11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner (System.in);
        int alas=10;
        int tinggi=20;
        float luas;
        System.out.println("masukkan alas: ");
        alas = Diego.nextInt();
        System.out.println("masukkan tinggi: ");
        tinggi = Diego.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("luas segitiga " + luas);

        Diego.close();
    }
}
