/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komposisi;

/**
 *
 * @author nabilakartika
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan beberapa buku ke dalam perpustakaan
        perpustakaan.tambahBuku(new Buku("Ada Apa Dengan Cinta?", "978-1234567890"));
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "978-0987654321"));
        perpustakaan.tambahBuku(new Buku("Bumi Manusia", "978-1234512345"));
        perpustakaan.tambahBuku(new Buku("Negeri 5 Menara", "978-5432154321"));
        perpustakaan.tambahBuku(new Buku("Perahu Kertas", "978-6789056789"));
        perpustakaan.tambahBuku(new Buku("Tenggelamnya Kapal Van Der Wijck", "978-1122334455"));
        perpustakaan.tambahBuku(new Buku("Ayat-Ayat Cinta", "978-9988776655"));
        perpustakaan.tambahBuku(new Buku("Hujan", "978-3344556677"));
        perpustakaan.tambahBuku(new Buku("Sang Pemimpi", "978-4455667788"));
        perpustakaan.tambahBuku(new Buku("Rindu", "978-5566778899"));
        perpustakaan.tambahBuku(new Buku("Dilan 1990", "978-6677889900"));
        perpustakaan.tambahBuku(new Buku("5 Cm", "978-7788990011"));
        perpustakaan.tambahBuku(new Buku("Supernova", "978-8899001122"));
        perpustakaan.tambahBuku(new Buku("Aroma Karsa", "978-9900112233"));
        perpustakaan.tambahBuku(new Buku("Bidadari-Bidadari Surga", "978-0011223344"));
        perpustakaan.tambahBuku(new Buku("Filosofi Kopi", "978-2233445566"));
        perpustakaan.tambahBuku(new Buku("Cantik Itu Luka", "978-3344556678"));
        perpustakaan.tambahBuku(new Buku("Orang-Orang Biasa", "978-4455667789"));
        perpustakaan.tambahBuku(new Buku("Burung-Burung Manyar", "978-5566778890"));
        perpustakaan.tambahBuku(new Buku("Gadis Kretek", "978-6677889901"));

        // Menampilkan semua buku di perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
