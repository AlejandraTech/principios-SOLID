/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnviadorMensaje;

/**
 *
 * @author AlejandraTech
 */
public class GestorNotificaciones {

    private EnviadorMensaje enviador;

    public GestorNotificaciones(EnviadorMensaje enviador) {
        this.enviador = enviador;
    }

    void notificar(String mensaje) {
        enviador.enviarMensaje(mensaje);
    }

}
