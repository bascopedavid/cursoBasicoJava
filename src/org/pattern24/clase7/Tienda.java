package org.pattern24.clase7;

import java.math.BigDecimal;

public class Tienda {
    public static void main(String[] args) {
//        var caracter = '\u2605';
//        caracter = 64;
        Producto p1 = new Producto(1, "Te", BigDecimal.valueOf(2.5), "\u2605\u2605\u2605\u2606\u2606");
        p1.mostrarInformacion("en-US");
        p1.mostrarInformacion("es");
        p1.mostrarInformacion("fr-FR");
        p1.mostrarInformacion("jp");

        Producto p2 = new Producto();
        p2.mostrarInformacion("es");

        Producto p3 = new Producto(2, "Cafe", BigDecimal.valueOf(2));
        p3.mostrarInformacion("en-US");
        p3 = p3.cambiarPrecio(BigDecimal.valueOf(3));
        p3.mostrarInformacion("en-US");

        Producto p4 = new Producto(3, "Sandwich", BigDecimal.valueOf(5.0), "\u2605\u2605\u2605\u2605\u2606");
        p4.mostrarInformacion("en-US");

        Producto p5 = new Producto(4, "Donut", BigDecimal.valueOf(4.0), "\u2605\u2606\u2606\u2606\u2606");
        p5.mostrarInformacion("en-US");
        Producto p6 = new Producto(5, "Leche", BigDecimal.valueOf(3), Calificacion.DOS_ESTRELLAS.getEstrellas());
        p6.mostrarInformacion("en-US");
    }
}
