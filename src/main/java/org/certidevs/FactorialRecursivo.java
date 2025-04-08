package org.certidevs;

public class FactorialRecursivo {

    // Método público que inicia la recursión con acumulador en 1.
    public static long factorialRecursivo(int n) {
        return factorialTail(n, 1);
    }

    // Método privado que implementa la recursión de cola.
    private static long factorialTail(int n, long acumulador) {
        if (n <= 1) {
            return acumulador;  // Caso base.
        }
        return factorialTail(n - 1, n * acumulador); // Llamada de cola (Tail call).
    }

    // Método main para probar la función.
    public static void main(String[] args) {
        int numero = 5;  // Aqui se puede cambiar el valor para probar otros casos o se puede implementar la variable con Scanner para que sea el usuario quien participe activamente en la selección del valor.
        long resultado = factorialRecursivo(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}

/* Explicación breve:
 * · factorialRecursivo(int n): función pública que inicia el proceso con el acumulador en 1.
 * · factorialTail(int n, long acumulador): función recusiva auxiliar que realiza la operación como última instrucción (tail call).
 * · Caso base: cuando n <= 1, se devuelve acumulador.
 * · No se usa for, while, ni metodos de librerías.
 */
