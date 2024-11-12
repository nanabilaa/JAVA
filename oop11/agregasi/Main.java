/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_11.Agregasi;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        // nama klub
        Klub klubKomputer = new Klub("Klub Komputer");

        // anggota klub
        Anggota anggota1 = new Anggota("Aldi");
        Anggota anggota2 = new Anggota("Dina");
        Anggota anggota3 = new Anggota("Budi");

        // inset anggota ke klub
        klubKomputer.tambahAnggota(anggota1);
        klubKomputer.tambahAnggota(anggota2);
        klubKomputer.tambahAnggota(anggota3);
        
        klubKomputer.infoKlub();
    }
}
