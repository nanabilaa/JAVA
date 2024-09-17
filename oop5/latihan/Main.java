/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NABILA
 */
public class Main {
    public static void main (String[] args){
    Anjing anjing = new Anjing ("Moky", "Puddle", "Brown", 2);
    anjing.SuaraKhas = " Guk.. Guk.. Guk..";
    anjing.getpetInfo();
    
    Kucing kucing = new Kucing ("Hooky", "Persia", "Grey", 1 );
     kucing.SuaraKhas = " Meow.. Meoww..";
     kucing.getpetInfo();
    }
    
}
