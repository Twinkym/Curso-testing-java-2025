package org.certidevs;

import java.util.Scanner;

public class CalculadoraBasicaScanner {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // 1. Suma
        int suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        // 2. Resta
        int resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resta);

        // 3. Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);

        // 4. División
        if (numero2 != 0) { // Verificar que no haya división por cero
            int division = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // 5. Módulo (resto de la división)
        if (numero2 != 0) { // Verificar que no haya división por cero
            int modulo = numero1 % numero2;
            System.out.println(numero1 + " % " + numero2 + " = " + modulo);

            // Verificación si el primer número es divisible por el segundo
            boolean esDivisible = (modulo == 0);
            System.out.println("¿" + numero1 + " es divisible por " + numero2 + "? " + esDivisible);
        } else {
            System.out.println("No se puede calcular el módulo con divisor cero.");
        }

        // Incrementar y decrementar
        numero1++; // Incrementa en 1
        numero2--; // Decrementa en 1

        System.out.println("Después de incrementar, numero1 = " + numero1);
        System.out.println("Después de decrementar, numero2 = " + numero2);

        // Cerrar el scanner
        scanner.close();
    }
}

