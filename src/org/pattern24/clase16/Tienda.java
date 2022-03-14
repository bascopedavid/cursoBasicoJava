package org.pattern24.clase16;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Tienda {
    //COMPARABLE, COMPARATOR
    public static void main(String[] args) throws CloneNotSupportedException {
//
        Producto p1 = new Bebida(201, "Te Helado", BigDecimal.valueOf(4.5));
        p1 = p1.reviewProducto(Calificable.convertir(3), "El te no estaba helado");
        p1 = p1.reviewProducto(Calificable.convertir(4), "Tardaron mucho");
        p1 = p1.reviewProducto(Calificable.convertir(1), "No tenian azucar");
        p1 = p1.reviewProducto(Calificable.convertir(5), "Excelente!");
        p1 = p1.reviewProducto(Calificable.convertir(3), "El te no estaba helado");
        p1 = p1.reviewProducto(Calificable.convertir(4), "Tardaron mucho");
        p1 = p1.reviewProducto(Calificable.convertir(1), "No tenian azucar");
        p1 = p1.reviewProducto(Calificable.convertir(5), "Excelente!");
        p1 = p1.reviewProducto(Calificable.convertir(3), "El te no estaba helado");
        p1 = p1.reviewProducto(Calificable.convertir(4), "Tardaron mucho");
        p1 = p1.reviewProducto(Calificable.convertir(1), "No tenian azucar");
        p1 = p1.reviewProducto(Calificable.convertir(5), "Excelente!");
        p1.mostrarInformacion("en-US");
        for (Review r : p1.getReviews()) {
//            if (r == null) {
//                continue;
//            }
            System.out.println("Estrellas:" + r.getCalificacion() + " Comentario:" + r.getComentario());
        }
        p1.mostrarInformacion("es");
        p1.mostrarInformacion("fr-FR");
        p1.mostrarInformacion("jp");
    }
}
