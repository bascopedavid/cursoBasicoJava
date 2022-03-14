package org.pattern24.clase8;

import java.math.BigDecimal;

public class Bebida extends Producto {
    public Bebida() {
        super(100, "Agua", BigDecimal.valueOf(0.5), Calificacion.CINCO_ESTRELLAS);
    }

    public Bebida(int id, String nombre, BigDecimal precio, Calificacion calificacion) {
        super(id, nombre, precio, calificacion);
    }

    @Override
    public void mostrarInformacion(String lenguaje) {
        System.out.println("Bebida:");
        super.mostrarInformacion(lenguaje);
    }
}
