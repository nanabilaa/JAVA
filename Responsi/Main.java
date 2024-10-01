/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class Main {
    public static void main(String[] args) {
        
        Produk produk1 = new Elektronik("TV", 2000000, 2);
        Produk produk2 = new Makanan("Chips", 100000, "20/09/2025");

       
        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Agus", 2000000, 6);

        
        System.out.println("Informasi Produk I :");
        produk1.tampilkanInfo();
        System.out.println("Informasi Produk II :");
        produk2.tampilkanInfo();

        System.out.println("\nInformasi Pegawai:");
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}

