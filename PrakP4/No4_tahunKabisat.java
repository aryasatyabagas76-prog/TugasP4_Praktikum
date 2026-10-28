/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakP4;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class No4_tahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;
        
        System.out.print("Tahun Berapa : ");
        tahun = input.nextInt();
        
        if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        }
        else
        {
            System.out.println(tahun + " bukan tahun kabisat");
        } 
    }
}
