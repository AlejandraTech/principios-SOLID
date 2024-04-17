/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnviadorMensaje;

/**
 *
 * @author AlejandraTech
 */
public class EnviadorEmail implements EnviadorMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        // Lógica para enviar el mensaje por email.
        System.out.println("Enviando mensaje por email: " + mensaje);
    }

}
