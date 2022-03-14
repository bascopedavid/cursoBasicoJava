package org.pattern24.clase10;

public interface Calificable {
    public static final Calificacion CALIFICACION_POR_DEFECTO = Calificacion.SIN_CALIFICACION;

    public Producto aplicarCalificacion(int estrellas);
}
