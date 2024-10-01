/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class Produk {
   private String namaProduk;
   private int harga;
   
   public Produk(String namaProduk, int harga){
       this.namaProduk = namaProduk;
       this.harga = harga;
   }
    
    void tampilkanInfo(){
    System.out.println(" Nama Produk --> " + namaProduk + " \n" + " Dan Harganya --> " + harga);
    }
    
    public String getProduk(){
        return namaProduk;
    }
    public void setProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
}
