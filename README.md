# Los Principios SOLID: Fundamentos del Diseño de Software

Los principios SOLID son un conjunto de cinco principios de diseño de software que se consideran fundamentales para crear sistemas que sean fáciles de entender, mantener y ampliar. 

## Los 5 principios SOLID

- **Principio de Responsabilidad Única (SRP)**: Este principio establece que una clase debe tener una única razón para cambiar, es decir, una clase debe tener una única responsabilidad. Si una clase tiene más de una responsabilidad, se vuelve más difícil de entender, mantener y probar.
- **Principio de Abierto/Cerrado (OCP)**: Este principio establece que las clases deben estar abiertas para su extensión pero cerradas para su modificación. En otras palabras, se deben poder añadir nuevas funcionalidades a un sistema sin necesidad de modificar el código existente.
- **Principio de Sustitución de Liskov (LSP)**: Este principio establece que los objetos de un programa deben ser sustituibles por instancias de sus subtipos sin afectar a la corrección del programa. En términos más simples, las subclases deben ser sustituibles por sus clases base sin alterar el comportamiento del programa.
- **Principio de Segregación de Interfaces (ISP)**: Este principio establece que una clase no debe ser forzada a depender de métodos que no va a utilizar. En lugar de tener interfaces grandes y monolíticas, es mejor dividirlas en interfaces más pequeñas y específicas.
- **Principio de Inversión de Dependencias (DIP)**: Este principio establece que las clases de alto nivel no deben depender de las clases de bajo nivel, sino que ambas deben depender de abstracciones. Además, las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones.
