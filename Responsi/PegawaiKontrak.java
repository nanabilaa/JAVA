/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class PegawaiKontrak extends Pegawai{
    int lamaKontrak;
    
    public PegawaiKontrak (String namaPegawai, int gaji, int lamaKontrak){
        super (namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Dengan durasi kontrak -->" + lamaKontrak +" "+ "bulan");
    }
}
