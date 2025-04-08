package org.certidevs;

// Clase que realiza operaciones aritméticas básicas
public class CalculadoraBasica {

    public static void main(String[] args) {

        // Declaración e inicialización de las variables
        int numero1 = 10;
        int numero2 = 5;

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
        int division = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + division);

        // 5. Módulo (resto de la división)
        int modulo = numero1 % numero2;
        System.out.println(numero1 + " % " + numero2 + " = " + modulo);

        // Verificación si el primer número es divisible por el segundo
        boolean esDivisible = (modulo == 0);
        System.out.println("¿" + numero1 + " es divisible por " + numero2 + "? " + esDivisible);

        // Incrementar y decrementar
        numero1++; // Incrementa en 1
        numero2--; // Decrementa en 1

        System.out.println("Después de incrementar, numero1 = " + numero1);
        System.out.println("Después de decrementar, numero2 = " + numero2);
    }
}

