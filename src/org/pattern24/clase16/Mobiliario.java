package org.pattern24.clase16;

public class Mobiliario implements Calificable<String> {
    @Override
    public String aplicarCalificacion(Calificacion calificacion) {
        return calificacion.getEstrellas();
    }
}
