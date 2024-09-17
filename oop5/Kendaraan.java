/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author NABILA
 */
public class Kendaraan {
    String nama;
    int kecepatan;
    
    public Kendaraan(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
public void info(){
    System.out.println(" \n"+ nama +" " + "dan" + " "+ kecepatan + " " + "km/h");
}
}
