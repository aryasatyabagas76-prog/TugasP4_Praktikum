package PrakP4;

import java.util.Scanner;

public class No5_pendapatanSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penjualan;
        int uangJasa;
        double komisi;
        double pendapatan;
        
        System.out.print("Masukan Pendapatan : ");
        penjualan = input.nextInt();
        
        if(penjualan <= 2000000){
            uangJasa = 100000;
            komisi = 0.10 * penjualan;  
        }else{
            if(penjualan <= 5000000){
                uangJasa = 200000;
                komisi = 0.15 * penjualan;
            }else{
                uangJasa = 300000;
                komisi = 0.20 * penjualan;
            }
        }
        
        pendapatan = uangJasa + komisi;
        
        System.out.println("Uang Jasa : " + uangJasa);
        System.out.println("Komisi : " + komisi);
        System.out.println("pemdapatan : " + pendapatan);
            
    }
}
