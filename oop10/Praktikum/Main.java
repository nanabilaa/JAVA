/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        OperasiHitung penjumlahan = (OperasiHitung) new Penjumlahan();
        OperasiHitung pengurangan = new Pengurangan();
        
        int resultPenjumlahan = penjumlahan.hitung(5, 3); // Example usage
        int resultPengurangan = pengurangan.hitung(5, 3); // Example usage

        System.out.println("Penjumlahan: " + resultPenjumlahan);
        System.out.println("Pengurangan: " + resultPengurangan);
    }
}

