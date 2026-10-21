# Ejercicios de Bucles y Validaciones (Actividad 7)

Programa de consola en Java que demuestra el uso práctico de diferentes tipos de estructuras iterativas y la validación robusta de entrada de datos mediante el manejo de excepciones.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **Iteración con bucle `while`:** Impresión secuencial de números del 1 al 100.
- **Iteración con bucle `for`:** Ejecución equivalente a la anterior utilizando la sintaxis de ciclo for.
- **Operaciones lógicas y de módulo:** Identificación e impresión de los números entre 1 y 100 que son divisibles de forma exacta entre 2 y 3 simultáneamente.
- **Validación robusta de datos:** Solicitud de un número mayor o igual a 0 al usuario. Emplea un ciclo `do-while` combinado con validación de tipo para garantizar que el programa no se detenga si el usuario ingresa letras o símbolos en lugar de números.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Manejo de entrada:** `Scanner`
- **Control de errores:** Bloques `try-catch` (`InputMismatchException`)
- **Estructuras de control y flujo:** `for`, `while`, `do-while`, `if-else`

## Estructura del Código

- `Numeros.java`: Única clase principal que contiene la ejecución de las cuatro operaciones solicitadas de forma secuencial dentro del método `main`, gestionando la limpieza del buffer del escáner en caso de entradas inválidas.
