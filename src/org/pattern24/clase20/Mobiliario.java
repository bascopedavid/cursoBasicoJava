package org.pattern24.clase20;

public class Mobiliario implements Calificable<String> {
    @Override
    public String aplicarCalificacion(Calificacion calificacion) {
        return calificacion.getEstrellas();
    }
}
