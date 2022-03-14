package org.pattern24.clase8;

import java.math.BigDecimal;

public class Comida extends Producto {
    public Comida() {
        super(200, "Pan", BigDecimal.valueOf(0.5), Calificacion.CINCO_ESTRELLAS);
    }

    @Override
    public String toString() {
        System.out.println("Comida:");
        super.mostrarInformacion("es");
        return "";
    }
}
