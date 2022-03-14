package org.pattern24.clase12;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Tienda {
    //COMPARABLE, COMPARATOR
    public static void main(String[] args) throws CloneNotSupportedException {
//        var caracter = '\u2605';
//        caracter = 64;
//        Producto p1 = new Producto(1, "Te", BigDecimal.valueOf(2.5), Calificacion.TRES_ESTRELLAS);
//        p1.mostrarInformacion("en-US");
//        p1.mostrarInformacion("es");
//        p1.mostrarInformacion("fr-FR");
//        p1.mostrarInformacion("jp");

//        Producto p2 = new Producto();
//        p2.mostrarInformacion("es");

//        Producto p3 = new Producto(2, "Cafe", BigDecimal.valueOf(2));
//        p3.mostrarInformacion("en-US");
//        p3 = p3.cambiarPrecio(BigDecimal.valueOf(3));
//        p3.mostrarInformacion("en-US");
//
//        Producto p4 = new Producto(3, "Sandwich", BigDecimal.valueOf(5.0), Calificacion.CUATRO_ESTRELLAS);
//        p4.mostrarInformacion("en-US");
//
//        Producto p5 = new Producto(4, "Donut", BigDecimal.valueOf(4.0), Calificacion.CINCO_ESTRELLAS);
//        p5.mostrarInformacion("en-US");
//        Producto p6 = new Producto(5, "Leche", BigDecimal.valueOf(3), Calificacion.DOS_ESTRELLAS);
//        p6.mostrarInformacion("en-US");

//        for (Calificacion calificacion : Calificacion.values()) {
//            System.out.println(calificacion.getEstrellas() + " " + calificacion.getValor() + " " + calificacion.getValorLiteral());
//        }
//        System.out.println(Calificacion.values()[3].getValorLiteral());
//        System.out.println("--------------");
//        System.out.println(p6.toString());
//        System.out.println(p6);

//        Object p7 = new Producto(6, "Chocolate", BigDecimal.valueOf(3.2), Calificacion.CINCO_ESTRELLAS);
//        p7.mostrarInformacion("en-US"); XX
//        Producto p7 = (Producto) new Object();
//        p7.mostrarInformacion("en-US");

        Producto b1 = new Bebida();
        b1.mostrarInformacion("es");
        Producto c1 = new Comida();
        c1 = c1.cambiarPrecio(BigDecimal.valueOf(5));
        c1.mostrarInformacion("es");
//        Producto px = new Producto();
//        px.mostrarInformacion("es");
        Producto b2 = new Bebida(6, "Chocolate", BigDecimal.valueOf(3.2), Calificacion.CUATRO_ESTRELLAS);
        b2.mostrarInformacion("es");
        b2 = b2.cambiarPrecio(BigDecimal.valueOf(3.5));
        b2.mostrarInformacion("es");
        System.out.println(b2.getDescuento());
//        System.out.println("---------");
//        System.out.println(c1);

        Producto p8 = new Comida(LocalDate.of(2021, 7, 20));
        p8.mostrarInformacion("en-US");
        System.out.println(p8.getDescuento());

        Comida c3 = new Comida();
        Producto c4 = new Comida();

        Bebida b3 = new Bebida(200, "Agua Mineral", BigDecimal.valueOf(1.2), Calificacion.CUATRO_ESTRELLAS);

//        boolean resultado = new String("hola").equals(new String("hola"));
        boolean resultado = c3.equals(b3);
        System.out.println(c3.toString());
        System.out.println(b3.toString());
        System.out.println("comparacion: " + resultado);

        System.out.println("Hash:" + c3.hashCode());

        Bebida b4 = new Bebida(201, "Te Helado", BigDecimal.valueOf(4.5));
        b4.mostrarInformacion("es");
        Bebida b5;
        if (b4 instanceof Cloneable) {
            b5 = b4.clone();
        } else {
            System.out.println("no se puede clonar");
            b5 = new Bebida();
        }
        b4 = (Bebida) b4.aplicarCalificacion(Calificable.convertir(3));
        b4.mostrarInformacion("es");
        b4.getDescuento();
        System.out.println("class:" + b4.getClass());
        b5.mostrarInformacion("es");

        c4.mostrarInformacion("es");
        c4 = c4.aplicarCalificacion(1);
        c4.mostrarInformacion("es");
        c4.getDescuento();
        System.out.println("class:" + c4.getClass());

        Mobiliario m0 = new Mobiliario();
        String calificacion = m0.aplicarCalificacion(Calificable.convertir(5));
        System.out.println("Mobiliario:" + calificacion);

        Empleado<String> e = new Empleado<>();
        e.mostrarTipo("empleado del mes");

        Empleado<Boolean> e1 = new Empleado<>();
        e1.mostrarTipo(false);

        Empleado<Producto> e2 = new Empleado<>();
        e2.mostrarTipo(c4);

        Empleado<Bebida> e3 = new Empleado<>();
        e3.mostrarTipo(b5);
    }
}
