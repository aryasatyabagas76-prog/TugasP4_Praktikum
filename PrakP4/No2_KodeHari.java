package PrakP4;

import java.util.Scanner;

public class No2_KodeHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kode;
        
        System.out.print("Masukan Kode Hari : ");
        kode = input.nextInt();
        switch(kode){
        case 1 :
                System.out.println("Senin");
        case 2 :
                System.out.println("Selasa");
        case 3 :
                System.out.println("Rabu");
        case 4 :
                System.out.println("Kamis");
        case 5 :
                System.out.println("Jumat");
        case 6 :
                System.out.println("Sabtu");
        case 7 :
                System.out.println("Minggu");
        }
    }
}
