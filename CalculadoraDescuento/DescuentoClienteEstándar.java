/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraDescuento;

/**
 *
 * @author AlejandraTech
 */
public class DescuentoClienteEstándar implements CalculadoraDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.05); // 5% de descuento
    }

}
