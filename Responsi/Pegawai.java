/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author NABILA
 */
public class Pegawai {
  private  String namaPegawai;
   private int gaji;
    
    void tampilkanInfo(){
    System.out.println("Nama Pegawai adalah --> " + namaPegawai +" \n" +"Gaji --> " + gaji);
    }
    public Pegawai(String namaPegawai, int gaji){
    this.namaPegawai = namaPegawai;
    this.gaji = gaji;
    }
    public String getnamaPegawai(){
        return namaPegawai;
    }
    public void setnamaPegawai(String namaPegawai){
        this.gaji = gaji;
    }
    public int gaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
}
