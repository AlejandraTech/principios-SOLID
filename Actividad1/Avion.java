/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author AlejandraTech
 */
public class Avion implements OperacionesVehiculo, OperacionesAereas {

    @Override
    public void conducir() {
        System.out.println("Volando un avión…");
    }

    @Override
    public void volar() {
        System.out.println("Volando un avión…");
    }
    
}
