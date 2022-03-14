package org.pattern24.clase10;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Bebida extends Producto { //INTERFACES
    public Bebida() {
        super(100, "Agua", BigDecimal.valueOf(0.5), Calificacion.CINCO_ESTRELLAS);
    }

    @Override
    public BigDecimal getDescuento() {
        LocalTime ahora = LocalTime.now();
//        if (ahora.isAfter(LocalTime.of(17, 30)) && ahora.isBefore(LocalTime.of(18, 30))){
//            return super.DESCUENTO;
//        } else {
//            return BigDecimal.ZERO;
//        }
        return (ahora.isAfter(LocalTime.of(17, 30))
                && ahora.isBefore(LocalTime.of(23, 30))) ? getPrecio().multiply(super.DESCUENTO) : BigDecimal.ZERO;
    }

    @Override
    public Bebida cambiarPrecio(BigDecimal precio) {
        return new Bebida(super.getId(), super.getNombre(), precio, super.getCalificacion());
    }

    public Bebida(int id, String nombre, BigDecimal precio) {
        super(id, nombre, precio);
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
