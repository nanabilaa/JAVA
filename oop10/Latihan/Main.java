/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();
        
        double hargaElektronik = 10000; 
        double hargaMakanan = 5000; 

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("Pajak Elektronik: Rp" + pajakElektronik);
        System.out.println("Pajak Makanan: Rp" + pajakMakanan);
    }
}
