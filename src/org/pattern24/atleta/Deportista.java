package org.pattern24.atleta;

public interface Deportista {
    String nombre = "NOMBRE";

    public default String getNombre() {
        return nombre;
    }

}
