package org.pattern24.clase19;

import java.math.BigDecimal;

public class Helado extends Producto {
    @Override
    protected BigDecimal getDescuento() {
        return BigDecimal.ZERO;
    }

    @Override
    public Producto cambiarPrecio(BigDecimal precio) {
        return new Helado();
    }

    @Override
    public Producto aplicarCalificacion(Calificacion calificacion) {
        return new Helado();
    }
}
