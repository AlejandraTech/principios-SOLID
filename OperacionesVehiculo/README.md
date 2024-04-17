# Enunciado

1. ¿Qué principio SOLID viola esta clase? ¿Puedes aplicar el principio y escribir el código correctamente?

## Código a corregir

    public interface OperacionesVehiculo {
        void conducir ();
        void volar ();
    }


    public class Auto implements OperacionesVehiculo {

        public void conducir(){
            System.out.println("Conduciendo un auto…");
        }


        public void volar(){
            throw new UnsupportedOperationException("Un auto no puede volar.")
        }

    }

# Explicación de mi solución

La clase Auto viola el **principio de responsabilidad única (SRP)** al implementar un método volar() que no tiene sentido en el contexto de un automóvil. Este principio establece que una clase debe tener una única razón para cambiar, y la clase Auto debería estar preocupada únicamente con la conducción.

He definido dos interfaces separadas, OperacionesVehiculo y OperacionesAereas, para dividir las responsabilidades. Luego, he implementado estas interfaces en las clases Auto y Avion respectivamente, cumpliendo así con el principio de responsabilidad única.
