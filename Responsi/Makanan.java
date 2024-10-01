/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class Makanan extends Produk {
    String expired;
    
    public Makanan(String namaProduk, int harga, String expired){
        super(namaProduk, harga);
        this.expired = expired;
}
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Akan expired dalam --> " + expired);
    }
    
}
