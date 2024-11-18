/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_11;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("Silvarani");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");
        Pengarang pengarang3 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang pengarang4 = new Pengarang("Ahmad Fuadi");
        Pengarang pengarang5 = new Pengarang("Dee Lestari");
        Pengarang pengarang6 = new Pengarang("Hamka");
        Pengarang pengarang7 = new Pengarang("Habiburrahman El Shirazy");
        Pengarang pengarang8 = new Pengarang("Tere Liye");
        Pengarang pengarang9 = new Pengarang("Pidi Baiq");
        Pengarang pengarang10 = new Pengarang("Donny Dhirgantoro");
        Pengarang pengarang11 = new Pengarang("Eka Kurniawan");
        Pengarang pengarang12 = new Pengarang("Y.B. Mangunwijaya");
        Pengarang pengarang13 = new Pengarang("Ratih Kumala");

        // Membuat buku dengan agregasi ke pengarang
        Buku buku1 = new Buku("Ada Apa Dengan Cinta?", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        Buku buku3 = new Buku("Bumi Manusia", pengarang3);
        Buku buku4 = new Buku("Negeri 5 Menara", pengarang4);
        Buku buku5 = new Buku("Perahu Kertas", pengarang5);
        Buku buku6 = new Buku("Tenggelamnya Kapal Van Der Wijck", pengarang6);
        Buku buku7 = new Buku("Ayat-Ayat Cinta", pengarang7);
        Buku buku8 = new Buku("Hujan", pengarang8);
        Buku buku9 = new Buku("Sang Pemimpi", pengarang2);
        Buku buku10 = new Buku("Rindu", pengarang8);
        Buku buku11 = new Buku("Dilan 1990", pengarang9);
        Buku buku12 = new Buku("5 Cm", pengarang10);
        Buku buku13 = new Buku("Supernova", pengarang5);
        Buku buku14 = new Buku("Aroma Karsa", pengarang5);
        Buku buku15 = new Buku("Bidadari-Bidadari Surga", pengarang8);
        Buku buku16 = new Buku("Filosofi Kopi", pengarang5);
        Buku buku17 = new Buku("Cantik Itu Luka", pengarang11);
        Buku buku18 = new Buku("Orang-Orang Biasa", pengarang2);
        Buku buku19 = new Buku("Burung-Burung Manyar", pengarang12);
        Buku buku20 = new Buku("Gadis Kretek", pengarang13);

        // Membuat perpustakaan dan menambahkan buku
        Perpustakaan perpustakaan = new Perpustakaan(20);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        perpustakaan.tambahBuku(buku5);
        perpustakaan.tambahBuku(buku6);
        perpustakaan.tambahBuku(buku7);
        perpustakaan.tambahBuku(buku8);
        perpustakaan.tambahBuku(buku9);
        perpustakaan.tambahBuku(buku10);
        perpustakaan.tambahBuku(buku11);
        perpustakaan.tambahBuku(buku12);
        perpustakaan.tambahBuku(buku13);
        perpustakaan.tambahBuku(buku14);
        perpustakaan.tambahBuku(buku15);
        perpustakaan.tambahBuku(buku16);
        perpustakaan.tambahBuku(buku17);
        perpustakaan.tambahBuku(buku18);
        perpustakaan.tambahBuku(buku19);
        perpustakaan.tambahBuku(buku20);

        // Menampilkan semua buku di perpustakaan
        perpustakaan.tampilkanSemuaBuku();
        
    }
}
