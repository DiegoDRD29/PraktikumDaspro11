package Pertemuan1;
public class RobotArm11 {
    public static void main(String[] args) {
        String A = "Bola Bintang";
        String B = "Bola Bulan";
        String C = "";
        String temp = "";

        temp = A;
        A = C;
        C = temp; 

        System.out.println("Setelah Langkah 1: ");
        System.out.println("nampan A : " + A);
        System.out.println("nampan B : " + B);
        System.out.println("nampan C : " + C);
        
        temp = B;
        B = A;
        A = temp;

        System.out.println("Setelah Langkah 2: ");
        System.out.println("nampan A : " + A);
        System.out.println("nampan B : " + B);
        System.out.println("nampan C : " + C);

        temp = B;
        B = C;
        C = temp;
        
        System.out.println("Setelah Langkah 3: ");
        System.out.println("nampan A : " + A);
        System.out.println("nampan B : " + B);
        System.out.println("nampan C : " + C);

        System.out.println("kesimpulan 1:bola bintang dan bola bulan bertukar tempat");
        System.out.println("kesimpulan 2:nampan C=kosong");
    }
}
