# Enunciado

2. ¿Qué principio SOLID viola esta clase? ¿Puedes aplicar el principio y escribir el código correctamente?

## Código a corregir

    public class Vehiculo {

        public void mover() {
            System.out.println("El vehículo se está moviendo.");
        }

    }

    public class Auto extends Vehiculo {

        @Override
        public void mover() {
            System.out.println("El auto se está moviendo.");
        }

    }

    public class VehiculoEstacionado extends Vehiculo {

        @Override
        public void mover() {
            throw new UnsupportedOperationException("No se puede mover un vehículo estacionado.");
        }

    }

# Explicación de mi solución

La clase VehiculoEstacionado viola el **principio de sustitución de Liskov (LSP)** al lanzar una excepción en su método mover(). Este principio establece que los objetos de un programa deben ser sustituibles por instancias de sus subtipos sin afectar a la corrección del programa. Al lanzar una excepción en lugar de proporcionar una implementación válida del método mover(), VehiculoEstacionado rompe este principio.

He creado una clase abstracta Vehiculo con un método abstracto mover(). Luego, he implementado este método en las clases Auto y VehiculoEstacionado, cumpliendo así con el principio de responsabilidad única y el principio de sustitución de Liskov.
