package org.pattern24.clase23;

import java.math.BigDecimal;

public class Tienda {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Method references
//        Collections::sort; //static method
//        lista::size; //instance method
//        List::size; //instance method
//        Comparator::new; // new
        ManejadorProducto mp = new ManejadorProducto("es");
        mp.crearProducto(201, "Te Helado", BigDecimal.valueOf(4.5), Calificacion.SIN_CALIFICACION);
        mp.crearProducto(202, "Cafe", BigDecimal.valueOf(5), Calificacion.SIN_CALIFICACION);
        mp.crearProducto(203, "Leche", BigDecimal.valueOf(3.5), Calificacion.SIN_CALIFICACION);

        mp.calificarProducto(201, 2, "El te no estaba helado");
        mp.calificarProducto(201, 4, "Muy Bueno");
        mp.calificarProducto(201, 3, "Le Faltaba azucar");

        mp.calificarProducto(202, 4, "Le faltaba un pococ de azucar");
        mp.calificarProducto(202, 5, "Excelente");

        mp.calificarProducto(203, 3, "Pasable");

        mp.imprimirProductos();
        mp.cambiarLocale("en-US");
        mp.imprimirProductos();

        //JAVA STREAMS API
    }
}
