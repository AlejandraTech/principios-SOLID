# Enunciado

4. ¿Qué principio SOLID viola esta clase? ¿Puedes aplicar el principio y escribir el código correctamente?

## Código a corregir

    public class CalculadoraDescuentoOriginal {

        public double aplicarDescuento(double monto, String tipoCliente) {

            if ("ClienteEstándar".equals(tipoCliente)) {
                return monto - (monto * 0.05); // 5% de descuento
            } else if ("ClientePremium".equals(tipoCliente)) {
                return monto - (monto * 0.15); // 15% de descuento
            }

        }

    }

# Explicación de mi solución

La clase CalculadoraDescuentoOriginal viola el **principio de responsabilidad única (SRP)** al tener la responsabilidad de determinar qué tipo de descuento aplicar dentro del método aplicarDescuento(). Esto hace que la clase sea más propensa a cambios, ya que cada vez que se agregue un nuevo tipo de cliente o un cambio en las reglas de descuento, esta clase necesitará ser modificada.

He creado una interfaz CalculadoraDescuento para abstraer el cálculo de descuentos. Luego, he implementado esta interfaz en las clases DescuentoClienteEstándar y DescuentoClientePremium, cumpliendo así con el principio de responsabilidad única y el principio de sustitución de Liskov.
