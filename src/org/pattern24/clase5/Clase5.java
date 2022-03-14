package org.pattern24.clase5;

import org.pattern24.Clase4;

public class Clase5 {
    //    int id;
//    String nombre;
    public static void main (String[]args) {
        Clase4 ejemplo = new Clase4(2, "Ejemplo");
//        System.out.println(ejemplo.id + ":" + ejemplo.nombre);
        var ejemplo6 = new Clase4(3, "Local Variable Inference");
        ejemplo6.mostrar("Los valores son:");
    }
}
