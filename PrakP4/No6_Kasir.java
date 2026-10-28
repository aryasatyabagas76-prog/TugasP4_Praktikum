package PrakP4;

import java.util.Scanner;

public class No6_Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBelanja;
        int uangDiberikan;
        boolean member;
        int diskon;
        int totalBayar;
        int kembalian = 0;
        
        System.out.print("Total Belanja : ");
        totalBelanja = input.nextInt();
        input.nextLine();
        System.out.print("Uang Di Berikan : ");
        uangDiberikan = input.nextInt();
        input.nextLine();
        System.out.print("Member (Ya/Tidak) : ");
        member = input.nextLine().equalsIgnoreCase("ya");
        
        if(member){
            if(totalBelanja > 500000){
                diskon = 50000;
            }else if(totalBelanja >100000){
                diskon = 15000;
            }else{
                diskon = 0;
            }
        }else if(totalBelanja > 100000){
            diskon = 10000;
        }else{
            diskon = 0;
        }
        
        totalBayar = totalBelanja - diskon;
        
        if(uangDiberikan >= totalBayar){
            kembalian = uangDiberikan - totalBayar;
        System.out.println("Kembalian : " +kembalian);
        }else{
            System.out.println("Uang Kurang!");
        }
        
        System.out.println("Total Belanja : " +totalBelanja);
        System.out.println("Total Bayar : " + totalBayar);
        System.out.println("Diskon : " + diskon);
        
    }
    
}
