package org.pattern24.clase17;

public class Review {
    private int calificacion;
    private String estrellas;
    private String comentario;

    public Review(int calificacion, String comentario) {
        Calificacion calificacionObj = Calificable.convertir(calificacion);
        this.calificacion = calificacion;
        this.estrellas = calificacionObj.getEstrellas();
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public String getComentario() {
        return comentario;
    }
}
