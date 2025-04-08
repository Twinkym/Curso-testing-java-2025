package org.certidevs;

public class FuncionesJava {

    // Función que suma dos números.
    public static int sumar(int a, int b) {
        return a +b;
    }

    // Función que calcula el factorial de un número.
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Función que retorna un saludo personalizado.
    public static String saludoPersonalizado(String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido/a a Java.";
    }

    // Función que verifica si un número es par.
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Metodo principal.
    public static void main(String[] args) {
        // Usar la función sumar
        int suma = sumar(7, 5);
        System.out.println("Suma de 7 + 5 = " + suma);

        // Usar la función factorial.
        int num = 5;
        long fact = factorial(num);
        System.out.println("Factorial de " + num + " es: " + fact);

        // Usar la función saludoPersonalizado.
        String saludo = saludoPersonalizado("David");
        System.out.println(saludo);

        // Usar la función esPar.
        int valor = 8;
        boolean par = esPar(valor);
        System.out.println("¿" + valor + " es par? " + par);
    }
}

