/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NABILA
 */
public class Anjing extends Hewan {
    String SuaraKhas;
    
    public Anjing (String nama, String jenis, String warna, int usia){
        super (nama, jenis, warna, usia);
    }
    
    @Override
    public void getpetInfo(){
         super.getpetInfo();
         System.out.println("Suara nya" + SuaraKhas);
             
     }
       
}