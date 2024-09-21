/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NABILA
 */
public class Pekerja extends Manusia {
    int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan){
        super(nama, usia, pekerjaan);
    }
    public int getGaji(){
        return gaji;
    }
    public void setGaji(){
        this.gaji = gaji;
    }
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println("\n" + "gaji saya:" + gaji);
    }
}
