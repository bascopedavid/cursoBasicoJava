package org.pattern24;

import java.io.FileInputStream;

public class Clase5 {
//    int id;
//    String nombre;
    public static void main (String[]args) {
        Clase4 ejemplo = new Clase4(2, "Ejemplo");
//        System.out.println(ejemplo.id + ":" + ejemplo.nombre);
        //Local Variable Inference
        var ejemplo2 = false;
        var ejemplo3 = 0;
        var ejemplo4 = "Hola Mundo";
        var ejemplo5 = 'A';
//        System.out.println(ejemplo2);
//        System.out.println(ejemplo3);
//        System.out.println(ejemplo4);
//        System.out.println(ejemplo5);
        final String prueba = "ABC";
        var var = 123;
        final var ejemplo6 = new Clase4(3, "Local Variable Inference");
        ejemplo6.mostrar("Los valores son:");
        ejemplo6.setId(12);
        ejemplo6.setNombre("cambio");
        ejemplo6.mostrar("Los valores luego del cambio son:");
        System.out.println("________________");
        System.out.println("Descuento:" + ejemplo6.DESCUENTO_IVA);
        System.out.println(ejemplo6.getId() + ":" + ejemplo6.getNombre());
    }
}
