package TugasMatDas;
import java.util.Scanner;
public class tugasmatdasdiego {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        double nilai,kehadiran;
        System.out.println("masukkan nilai");
        nilai = Diego.nextDouble();
        System.out.println("masukkan kehadiran");
        kehadiran = Diego.nextDouble();
        if(nilai >=60 && kehadiran >=80){
        System.out.println("mahasiswa lulus");
     } else {
        System.out.println("mahasiswa tidak lulus"); 
        Diego.close();
    }
}  
}
