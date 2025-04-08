package org.certidevs;
import java.util.Scanner;

public class MayorEnArray {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Declarar un array unidimensional de 5 enteros.
    int[] arrayNumeros = new int[5];

    // Asignar valores al array utilizando un bucle.
    System.out.println("Introduce 5 números enteros: ");
    for(
    int i = 0;
    i<arrayNumeros.length;i++)

    {
        System.out.print("Número en la posición " + i + ": ");
        arrayNumeros[i] = scanner.nextInt();
    }

    // Determinar cúal es el mayor número.
    int mayor = arrayNumeros[0];
    for(
    int i = 1;
    i<arrayNumeros.length;i++)

    {
        if (arrayNumeros[i] > mayor) {
            mayor = arrayNumeros[i];
        }
    }

    // Mostrar el número mayor.
    System.out.println("El número mayor es: "+mayor);

    scanner.close();
    }
}


