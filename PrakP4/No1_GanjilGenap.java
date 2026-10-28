package PrakP4;

import java.util.Scanner;

public class No1_GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        
        System.out.print("Masukan Bilangan : ");
        bil = input.nextInt();
        
        if(bil % 2 == 0){
            System.out.println(bil + " adalah bilangan Genap");
        }else{
            System.out.println(bil + " adalah bilangan ganjil");
        }
    }
    
}
