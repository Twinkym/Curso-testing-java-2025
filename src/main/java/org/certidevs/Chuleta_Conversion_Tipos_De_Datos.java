package org.certidevs;

public class Chuleta_Conversion_Tipos_De_Datos {
    // Buenas les comparto una chuletilla que he realizado de certidevs que quizas les sea util:
    /* public class TiposDeDatos {*/
    public static void main(String[] args) {
        // Declaración de variables primitivas con valores adecuados.
        byte miByte = 100;                  // byte: -128 a 127.
        short miShort = 30000;              // short: -32768 a 32767.
        int miInt = 150000;                 // int: valor entero común.
        long miLong = 123456789L;           // long: se añade sufijo L.
        float miFloat = 3.14f;              // float: se añade sufijo f.
        double miDouble = 3.1415926535;     // double: mayor precisión que float.
        char miChar = 'A';                  // char: un solo carácter Unicode.
        boolean miBoolean = true;           // boolean: true o false.

        // variable Strinig con mi nombre.
        String miNombre = "David De La Puente - KirgoDev";

        // Conversión de int a byte (casting explícito).
        byte intAByte = (byte) miInt;       // Para la conversión explicita se declara entre parentesis anterior al nombre de la variable, la palabra reservada del tipo de dato al cual queremos convertir.

        // Conversión de float a int (casting explícito).
        int floatAInt = (int) miFloat;

        // Conversión de char a int (implicita)
        // Para la conversion implícita como podemos ver en el ejemplo no se necesita declarar el tipo de dato a convertir antes del nombre de la variable. Tenemos que tener en cuenta

        // Conversión de String a int usando Integer.parseInt()
        int stringAInt = Integer.parseInt("123");

        // Conversión de int a String usando String.valueOf()
        String intAString = String.valueOf(miInt);

        // Crear un array de enteros con 5 elementos.
        int[] miArray = {10, 20, 30, 40, 50};

        // Mostrar todos los valores con descripción.
        System.out.println("=== Variables Primitivas ===");
        System.out.println("byte:" + miByte);
        System.out.println("sbort:" + miShort);
        System.out.println("int:" + miInt);
        System.out.println("long:" + miLong);
        System.out.println("float:" + miFloat);
        System.out.println("double:" + miDouble);
        System.out.println("char:" + miChar);
        System.out.println("boolean:" + miBoolean);
        System.out.println("String (nombre): " + miNombre);

        System.out.println("\n=== Conversiones ===");
        System.out.println("int a byte (casting): " + intAByte);
        System.out.println("float a int (casting): " + floatAInt);
        System.out.println("char a int (implícita): " + (int) miChar);
        System.out.println("String a int: " + stringAInt);
        System.out.println("int a String: " + intAString);

        System.out.println("\n=== Array de enteros ===");
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Elemento " + i + ": " + miArray[i]);
        }

        /*
        ==========================================================
        | CONVERSIONES ENTRE TIPOS DE DATOS EN JAVA              |
        ==========================================================

        1. CONVERSIONES IMPLÍCITAS (de menor a mayor capacidad):
            - Java permite convertir automaticamente algunos tipos de datos más
              pequeños a otros más grandes sin perdida de información.
            - Ejemplos:
              byte -> short -> int -> long -> float -> double
              char -> int -> long -> float -> double

            - Ejemplo práctico:
              int numero = 100;
              long grande = numero; // Esto es una conversión implícita.

        2. CONVERSIONES EXPLÍCITAS (CASTING):
            - Se requiere casting explícito cuando conviertes de un tipo de mayor capacidad
              a uno de menor (puede haber pérdida de datos).
            - Ejemplos:
              double -> float -> long -> int -> short -> byte
              También para pasar de float a int, o de int a byte, etc.

            - Sintaxsis:
              int miEntero = (int) 3.14; // se trunca a 3.

        3. USO DE Integer.parseInt(String):

            - Convierte un String que contiene solo digitos a un entero.
            - Solo se puede usar si el String representa un número entero.
            - Puede lanzar una excepción `NumberFormatException`si el contenido no es válido.

            - Ejemplo:
              int numero = Integer.parseInt("123"); // OK, todos los caracteres son números enteros.
              int error = Integer.parseInt("12a3"); // Aqui recibimos un error porque uno de
              caracteres no es un número, recordemos que parseInt mirar norma 2 apartado 3

        4. USO DE String.valueOf():
            - Convierte cualquier tipo de dato primitivo o incluso objetos a una representación en
              String.
            - Muy útil para mostrar datos en pantalla o concatenarlos.

            - Ejemplos:
              String texto = String.valueOf(100);       // int a String.
              String texto2 = String.valueOf(3.14f);    // float a String.
              String texto3 = String.valueOf(true);     // boolean a String.
              String texto4 = String.valueOf('A');      // char a String.


        5. RESTRICCIONES GENERALES:
            - Casting entre tipos incompatibles (como de boolean a int) **No está permitido**
            - Las conversiones con `parseInt()` **Solo funcionan con Strings que contengan números
              válidos.**.
            - `valueOf()` no lanza excepciones, pero el resultado siempre será una representación en
              String, no numérica.

            - Realizado con la mejor de las intenciones, deseo que les sea de ayuda y no duden en
              actualizar el documento si lo creen necesario, y compartan es la base del aprendizaje.
        =========================================================================
        */

    }
}

