/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author nabilakartika
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); 
        kucing.bersuara();             
        kucing.makan("ikan");          
        kucing.makan("ikan", 2);      
    }
}
