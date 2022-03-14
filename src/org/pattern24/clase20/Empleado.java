package org.pattern24.clase20;

public class Empleado<T> {
    public void mostrarTipo(T argumento) {
        System.out.println("El argumento es:" + argumento);
    }
}
