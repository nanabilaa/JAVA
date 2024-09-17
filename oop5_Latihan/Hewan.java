/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NABILA
 */
public class Hewan {
    String nama;
    String jenis;
    String warna;
    int usia;
    
    public Hewan(String nama, String jenis, String warna, int usia){
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.usia = usia;
    }
    public void getpetInfo(){
        System.out.println("Nama Hewan:" + " " + nama);
        System.out.println("Jenis nya:" + " " + jenis);
        System.out.println("Dan warna nya:" + " " + warna);
        System.out.println("Juga Berusia" + " " + usia);
             
    }
}
