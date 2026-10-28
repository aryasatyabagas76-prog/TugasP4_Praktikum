package PrakP4;

import java.util.Scanner;


public class No7_BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("-Pilih Perhitungan Luas Bangun Datar-");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-Layang");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        
        
        switch(pilihan){
            case 1 :
                System.out.println("Hitung Luas Persegi");
                int sisi = 0;
                System.out.print("Masukan Sisi : ");
                sisi = input.nextInt();
                int luasP = sisi * sisi;
                
                System.out.println("Luas Perseginya Adalah : " + luasP);
                break;
            case 2 :
                System.out.println("Hitung Luas Segitiga");
                int alas;
                int tinggi;
                System.out.print("Masukan Alas : ");
                alas = input.nextInt();
                System.out.print("Masukan Tinggi :");
                tinggi = input.nextInt();
                
                double luasS = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga : " + luasS);
                break;
            case 3 :
                System.out.println("Hitung Luas Lingkaran");
                double phi = 3.14;
                int jari;
                System.out.print("Masukan Jari-Jari : ");
                jari = input.nextInt();
                
                double luasL = phi * jari * jari;
                System.out.println("Luas Lingkaran : " + luasL);
                break;
            case 4 :
                System.out.println("Hitung Luas Trapesium");
                int a;
                int b;
                int t;
                System.out.print("Masukan a : ");
                a = input.nextInt();
                System.out.print("Masukan B : ");
                b = input.nextInt();
                System.out.print("Masukan t : ");
                t = input.nextInt();
                
                double luasT = 0.5 * (a+b) * t;
                System.out.println("Luas Trapesium : " + luasT);
                break;
            case 5 :
                System.out.println("Hitung Luas Layang-Layang");
                int d1;
                int d2;
                System.out.print("Masukan Diagonal 1 : ");
                d1 = input.nextInt();
                System.out.print("Masukan Diagonal 2 : ");
                d2 = input.nextInt();
                
                double LuasLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-Layang : " + LuasLayang);
                break;
        }    
        
         
    }
}
