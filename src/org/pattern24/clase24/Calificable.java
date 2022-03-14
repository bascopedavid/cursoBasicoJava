package org.pattern24.clase24;

@FunctionalInterface
public interface Calificable<T> { //functional interface
    public static final Calificacion CALIFICACION_POR_DEFECTO = Calificacion.SIN_CALIFICACION;

    static Calificacion convertir(int estrellas) {
        return  (estrellas >= 0 && estrellas <= 5) ? Calificacion.values()[estrellas] : CALIFICACION_POR_DEFECTO;
    }

    //GENERICS
    T aplicarCalificacion(Calificacion calificacion);

    default T aplicarCalificacion(int estrellas) {
        return aplicarCalificacion(convertir(estrellas));
    }

    private void test() {
        System.out.println("private");
    }

//    public void functional();

}
