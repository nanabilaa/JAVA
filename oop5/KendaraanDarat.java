/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author NABILA
 */
public class KendaraanDarat extends Kendaraan{
    int BanyaknyaBan;
    public KendaraanDarat (String nama, int kecepatan){
        super(nama, kecepatan);
    }
    @Override   
    public void info(){
    super.info();
    System.out.println("banyak ban pada kendaraan:" +" "+ nama +"  "+ "adalah:" +" "+ BanyaknyaBan);
    }
}
