package Pertemuan2;
import java.util.Scanner;
public class TanahPakTono11 {
    public static void main(String[] args) {
       Scanner Diego = new Scanner(System.in); 

       int lebartanah,panjangtanah,panjangtaman,luastanah,luastaman;
       double sisaluastanah,luaskolam,diameterkolam,jarijari;
       double phi = 3.14;

       System.out.println("lebar tanah : ");
       lebartanah = Diego.nextInt();
       System.out.println("panjang tanah : ");
       panjangtanah = Diego.nextInt();
       System.out.println("diameter kolam : ");
       diameterkolam = Diego.nextInt();
       System.out.println("panjang taman : ");
       panjangtaman = Diego.nextInt();

       luastanah = lebartanah * panjangtanah;
       jarijari = diameterkolam / 2;
       luaskolam = phi * jarijari * jarijari;
       luastaman = panjangtaman * panjangtaman;
       sisaluastanah = luastanah - (luaskolam + luastaman);

       System.out.println("luas tanah : "+luastanah);
       System.out.println("luaskolam : "+luaskolam);
       System.out.println("luas taman : "+luastaman);
       System.out.println("sisa luas tanah : "+sisaluastanah);

       Diego.close();
    }
}
