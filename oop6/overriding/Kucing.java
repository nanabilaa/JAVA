/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author nabilakartika
 */
class Kucing extends Hewan {
    // Overriding metode bersuara() pada kelas Kucing
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

