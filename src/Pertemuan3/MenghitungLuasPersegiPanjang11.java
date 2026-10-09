package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang11  {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int panjang,lebar,luas;
        System.out.println("panjang");
        panjang = Diego.nextInt();
        System.out.println("lebar");
        lebar = Diego.nextInt();
        System.out.println("luas");

        luas = panjang * lebar;
        System.out.println("luas " + luas);

        Diego.close();
    }
    
}
