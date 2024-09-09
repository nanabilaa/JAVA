/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;
/**
 *
 * @author NABILA
 */
public class Mobil {
   private String merk;
   private String model;
   private int tahun;
   public String warna;
   
  public Mobil(String merk, String model, int tahun, String warna){ //konstruktor class 
      this.merk = merk;
      this.model = model;
      this.tahun = tahun;
      this.warna = warna;
  }
  public String getMerk(){  //getter 
      return merk;
  }
  public void setMerk (String merk){ //setter
       this.merk = merk;
  }         
  public String getModel(){ //getter
      return model;
  }
  public void setModel (String Model){//setter
      this.model = model;
  }
  public int getTahun(){
      return tahun;
  }
  public void setTahun(int tahun){
      this.tahun = tahun;
  }

  void getInfo(){
  System.out.println(" "+ "Mobil ini adalah :" +" "+ getMerk() +" "+ "dengan model:" + " " + getModel()+" " + "dan keluar pada tahun" +" " + getTahun());
  }
  void displayInfo(){
  System.out.print("Warna mobil saat ini adalah" + " "+ warna + " ");
  }
   void startEngine(){
  System.out.println("Mesin mobil" + "  " + getModel() + "  "+ "menyala");
  }
}


