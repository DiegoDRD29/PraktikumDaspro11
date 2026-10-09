package Pertemuan2;
import java.util.Scanner;
public class Bank11 {
    public static void main(String[] args) {
        int jml_tabungan_awal,lama_menabung;
        double bunga;
        double presentase_bunga =0.02;
        double jml_tabungan_akhir;
        Scanner Diego = new Scanner(System.in);
        System.out.print("masukkan jumlah awal tabungan anda :");
        jml_tabungan_awal = Diego.nextInt();
        System.out.println("masukkan lama menabung anda:");
        lama_menabung = Diego.nextInt();
        bunga= lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        System.out.println("bunga yang dihasilkan : " +bunga);
        System.out.println("jumlah tabungan akhir anda : " +jml_tabungan_akhir);
        Diego.close();
    }
}
