package org.pattern24.clase7;

public enum Calificacion {
    SIN_CALIFICACION("\u2606\u2606\u2606\u2606\u2606"),
    UNA_ESTRELLA("\u2605\u2606\u2606\u2606\u2606"),
    DOS_ESTRELLAS("\u2605\u2605\u2606\u2606\u2606"),
    TRES_ESTRELLAS("\u2605\u2605\u2605\u2606\u2606"),
    CUATRO_ESTRELLAS("\u2605\u2605\u2605\u2605\u2606"),
    CINCO_ESTRELLAS("\u2605\u2605\u2605\u2605\u2605");

    private String estrellas;
    private Calificacion(String estrellas) {
        this.estrellas = estrellas;
    }
    public String getEstrellas() {
        return this.estrellas;
    }
}
