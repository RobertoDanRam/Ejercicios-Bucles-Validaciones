import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        // 1. Números del 1 al 100 con bucle while
        System.out.println("Números del 1 al 100 (while):");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); 



        // 2. Números del 1 al 100 con bucle for
        System.out.println("Números del 1 al 100 (for):");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); 


        // 3. Números divisibles entre 2 y 3
        System.out.println("Números divisibles entre 2 y 3:");
        for (int k = 1; k <= 100; k++) {
            if (k % 2 == 0 && k % 3 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println(); 


        // 4. Módulo para leer número por teclado y validar
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        do {
            System.out.print("Introduce un número mayor o igual a 0: ");
            try {
                numero = scanner.nextInt();
                if (numero >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: El número debe ser mayor o igual a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debes introducir un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (!entradaValida);

        System.out.println("Número válido: " + numero);

        scanner.close();
    }
}