/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author AlejandraTech
 */
public class DescuentoClientePremium implements CalculadoraDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.15); // 15% de descuento
    }

}
