package org.pattern24.clase11;

@FunctionalInterface
public interface Calificable { //functional interface
    public static final Calificacion CALIFICACION_POR_DEFECTO = Calificacion.SIN_CALIFICACION;

    public default Calificacion aplicarCalificacion(int estrellas) {
        return  (estrellas >= 0 && estrellas <= 5) ? Calificacion.values()[estrellas] : CALIFICACION_POR_DEFECTO;
    }


    private void test() {
        System.out.println("private");
    }

    public void functional();

}
