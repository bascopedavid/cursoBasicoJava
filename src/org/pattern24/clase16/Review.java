package org.pattern24.clase16;

public class Review {
    private String calificacion;
    private String comentario;

    public Review(String calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }
}
