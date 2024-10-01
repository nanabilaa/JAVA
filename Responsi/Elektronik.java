/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class Elektronik extends Produk{
    int warranty;
    
    public Elektronik(String namaProduk, int harga, int warranty){
        super (namaProduk, harga);
        this.warranty = warranty;
    }
    @Override
    public void tampilkanInfo(){
    super.tampilkanInfo();
    System.out.println("Dengan Warranty --> " + warranty + " " + "Bulan");
    }
}
