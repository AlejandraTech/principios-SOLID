# Enunciado

3. ¿Qué principio SOLID viola esta clase? ¿Puedes aplicar el principio y escribir el código correctamente?

## Código a corregir

    class EnviadorEmail {

        void enviarMensaje(String mensaje){
            // Lógica para enviar el mensaje por email.
        }

    }


    class GestorNotificaciones {

        private EnviadorEmail enviador = new EnviadorEmail();

        void notificar(String mensaje) {
            enviador.enviarMensaje(mensaje);
        }

    }

# Explicación de mi solución

La clase GestorNotificaciones viola el **principio de inversión de dependencias (DIP)** al depender directamente de la implementación concreta EnviadorEmail en lugar de depender de una abstracción más general. Este principio establece que las clases de alto nivel no deben depender de las clases de bajo nivel, sino que ambas deben depender de abstracciones. Al depender directamente de EnviadorEmail, GestorNotificaciones está violando este principio.

He introducido una interfaz EnviadorMensaje para abstraer la acción de enviar mensajes. Luego, he modificado la clase GestorNotificaciones para que dependa de la abstracción EnviadorMensaje, siguiendo así el principio de inversión de dependencias.

