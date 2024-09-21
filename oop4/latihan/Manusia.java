/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NABILA
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    public Manusia(String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(){
        this.nama = nama;
    }
    public int getUsia(){
        return usia;
    }
    public void setUsia(){
        this.usia = usia;
    }
    public String getPekerjaan(){
        return pekerjaan;
    }
    public void setPekerjaan(){
        this.pekerjaan = pekerjaan;
    }

    void getinfo() {
       System.out.println("nama saya:" + nama + "\n" + "usia saya:" + usia + "\n" + "pekerjaan saya:" + pekerjaan);
    }

}

