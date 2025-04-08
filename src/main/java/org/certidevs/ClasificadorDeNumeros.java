package org.certidevs;
import java.util.Scanner;

public class ClasificadorDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número al usuario.
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Clasificación por signo.
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        } else {
            System.out.println("El número es cero.");
        }

        // Verificación de número primo.
        if (esPrimo(numero)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        // Mostrar la tabla de multiplicar.
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }

    // Función para verificar si un número es primo.
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
