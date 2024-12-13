/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();  
        hewan = new Anjing();
        hewan.bersuara();  
        Kucing kucing = new Kucing();
        kucing.makan("ikan");   
        kucing.makan("ikan", 2);  

        Anjing anjing = new Anjing();
        anjing.makan("daging");    
        anjing.makan("daging", 3); 
    }
}
