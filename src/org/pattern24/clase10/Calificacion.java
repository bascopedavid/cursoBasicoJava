package org.pattern24.clase10;

public enum Calificacion {
    SIN_CALIFICACION("\u2606\u2606\u2606\u2606\u2606", 0, "-"),
    UNA_ESTRELLA("\u2605\u2606\u2606\u2606\u2606", 1, "D"),
    DOS_ESTRELLAS("\u2605\u2605\u2606\u2606\u2606", 2, "C"),
    TRES_ESTRELLAS("\u2605\u2605\u2605\u2606\u2606", 3, "B"),
    CUATRO_ESTRELLAS("\u2605\u2605\u2605\u2605\u2606", 4, "A"),
    CINCO_ESTRELLAS("\u2605\u2605\u2605\u2605\u2605", 5, "A+");

    private String estrellas;
    private int valor;
    private String valorLiteral;

    private Calificacion(String estrellas, int valor, String valorLiteral) {
        this.estrellas = estrellas;
        this.valor = valor;
        this.valorLiteral = valorLiteral;
    }
    public String getEstrellas() {
        return this.estrellas;
    }
    public int getValor() {
        return this.valor;
    }
    public String getValorLiteral() {
        return this.valorLiteral;
    }
}
