/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komposisi;

/**
 *
 * @author nabilakartika
 */
public class Buku {
    private String judul;
    
    public Buku(String judul, String string){
        this.judul = judul;
    }
    public void infoBuku(){
        System.out.println("Judul Buku: " + judul);
    }
    
}
