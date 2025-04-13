package org.certidevs;
import static org.certidevs.DatosCalificaciones.calificaciones;
public class Calificaciones {
    public static void main(String[] args) {
        for (int c : calificaciones)
            System.out.println(
                    "Calificación: " + c + " - " +
                            (c >= 90 ? "Sobresaliente" : c >= 80 ? "Notable" : c >= 60 ? "Bien" : "Suspenso"));
    }
}
