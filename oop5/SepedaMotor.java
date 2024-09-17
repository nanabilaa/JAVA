/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author NABILA
 */
public class SepedaMotor extends KendaraanDarat{
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan) {
        super(nama, kecepatan);
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("jenisMesin:" + "  "+ jenisMesin);
    }
}
