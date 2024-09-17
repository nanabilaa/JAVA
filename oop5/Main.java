/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author NABILA
 */
public class Main {
    public static void main(String[] args) {
       Mobil mobil = new Mobil ("Hyundai", 190);    
       mobil.nama = "Hyundai";
       mobil.kecepatan = 190;
       mobil.jumlahPintu = 4;
       mobil.BanyaknyaBan = 4;
       mobil.info();
       
       
       SepedaMotor motor = new SepedaMotor ("N-Max", 100);
       motor.nama = "N-max";
       motor.kecepatan = 100;
       motor.jenisMesin = "Matic";
       motor.BanyaknyaBan = 2;
       motor.info();
    }
}
