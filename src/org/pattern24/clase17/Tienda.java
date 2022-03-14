package org.pattern24.clase17;

import java.math.BigDecimal;
import java.util.Iterator;

public class Tienda {
    public static void main(String[] args) throws CloneNotSupportedException {

        Producto p1 = new Bebida(201, "Te Helado", BigDecimal.valueOf(4.5));
        p1 = p1.reviewProducto(3, "El te no estaba helado");
        p1 = p1.reviewProducto(4, "Tardaron mucho");
        p1 = p1.reviewProducto(1, "No tenian azucar");
        p1 = p1.reviewProducto(5, "Excelente!");

//        p1.mostrarInformacion("en-US");
//        p1.mostrarInformacion("es");
//        p1.mostrarInformacion("fr-FR");
//        p1.mostrarInformacion("jp");
//        p1.mostrarInformacion("XXSXX");

        System.out.println(p1.getReviews());
        for (Review r : p1.getReviews()) {
            System.out.println(r.getEstrellas());
        }

        System.out.println("'TRADICIONAL'");
        for (int i = 0; i < p1.getReviews().size(); i++) {
            System.out.println(p1.getReviews().get(i).getEstrellas());
        }

        System.out.println("'ITERADOR'");
        Iterator<Review> iterator = p1.getReviews().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getEstrellas());
        }
    }
}
