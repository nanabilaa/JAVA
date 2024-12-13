/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author nabilakartika
 */
class Hewan {
    // Metode bersuara yang akan dioverride oleh kelas turunan
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Metode makan yang di-overload
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}
