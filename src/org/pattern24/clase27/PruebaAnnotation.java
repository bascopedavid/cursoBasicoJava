package org.pattern24.clase27;

import java.lang.reflect.Method;

public class PruebaAnnotation {
    static class Hola {
        @MiAnotacion(valor = 10000, nombre = "Adios")
        public void prueba() {
            System.out.println("Prueba de anotacion");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Hola h = new Hola();
        Method m = h.getClass().getMethod("prueba");
        MiAnotacion ma = m.getAnnotation(MiAnotacion.class);
        System.out.println(ma.valor());
        System.out.println(ma.nombre());
    }
}
