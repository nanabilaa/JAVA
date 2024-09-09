package Latihan3;
public class Main {
   public  static void main(String[] args){
       Mobil sportCar = new Mobil("Porsche", "carerra", 2024,"Blue");
       sportCar.setModel("carerra");
       sportCar.setTahun(2024);
       sportCar.getInfo();
       sportCar.startEngine();
       sportCar.displayInfo();
        
       Mobil sportCar2 = new Mobil("Mazda", "mx-5 miata", 2018,"Red");
      sportCar2.setMerk("Mazda");
      sportCar2.setModel("mx-5 miata");
      sportCar2.setTahun(2018);
      sportCar2.getInfo();
      sportCar2.startEngine();
      sportCar2.displayInfo();
        
    }
      
}
