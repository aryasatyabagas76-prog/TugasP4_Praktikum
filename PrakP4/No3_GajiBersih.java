package PrakP4;

import java.util.Scanner;

public class No3_GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long NIK;
        String nama;
        int golongan;
        String status;
        int jumlahAnak = 0;
        long gajiPokok = 0;
        double tunjanganPasangan = 0, tunjanganAnak = 0, tunjangan, gajiBersih;

        System.out.print("NIK : ");
        NIK = input.nextLong();
        input.nextLine();

        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Kode Golongan : ");
        golongan = input.nextInt();

        // Status & gaji pokok ditentukan otomatis dari golongan
        if (golongan == 1) {
            status = "Menikah";
            gajiPokok = 1200000;
        } else if (golongan == 2) {
            status = "Belum menikah";
            gajiPokok = 1500000;
        } else if (golongan == 3) {
            status = "Cerai";
            gajiPokok = 1750000;
        } else if (golongan == 4) {
            status = "Menikah dan punya anak";
            gajiPokok = 2000000;
            System.out.print("Jumlah Anak : ");
            jumlahAnak = input.nextInt();
        } else {
            System.out.println("Data Error");
            return;
        }

        // Tunjangan pasangan (golongan 1 dan 4 = menikah)
        if (golongan == 1 || golongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        // Tunjangan anak (otomatis 0 kalau jumlahAnak = 0)
        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        tunjangan = tunjanganPasangan + tunjanganAnak;
        gajiBersih = gajiPokok + tunjangan;

        System.out.println();
        System.out.println("NIK              : " + NIK);
        System.out.println("Nama             : " + nama);
        System.out.println("Status Pernikahan: " + status);
        System.out.println("Jumlah Anak      : " + jumlahAnak);
        System.out.println("Gaji Pokok       : Rp" + gajiPokok);
        System.out.println("Tunjangan        : Rp" + tunjangan);
        System.out.println("Gaji Bersih      : Rp" + gajiBersih);
    }
}