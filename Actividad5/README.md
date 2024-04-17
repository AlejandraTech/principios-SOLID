# Enunciado

5. ¿Qué principio SOLID viola esta clase? ¿Puedes aplicar el principio y escribir el código correctamente?

## Código a corregir

    public class GestorArchivos {

        public String leerArchivo(String path) {
            // Implementación de lectura
            return "contenido";
        }

        public void escribirArchivo(String contenido, String path) {
            // Implementación de escritura
        }

        public String encriptarContenido(String contenido) {
            // Implementación de encriptar
            return "encriptar";
        }
    
    }

# Explicación de mi solución

La clase GestorArchivos viola el **principio de interfaz segregada (ISP)** al proporcionar un único conjunto de métodos para leer, escribir y encriptar archivos. Esto puede ser problemático si un cliente solo necesita utilizar una parte de esta funcionalidad. Además, esta clase también viola el principio de responsabilidad única (SRP) al tener demasiadas responsabilidades relacionadas con la gestión de archivos.

He creado una interfaz GestorArchivos para abstraer las operaciones relacionadas con archivos. Luego, he implementado esta interfaz en la clase GestorArchivosImpl, cumpliendo así con el principio de responsabilidad única y permitiendo que las clases dependan de abstracciones en lugar de implementaciones concretas.
