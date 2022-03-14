package org.pattern24.clase24;

public class Empleado<T> {
    public void mostrarTipo(T argumento) {
        System.out.println("El argumento es:" + argumento);
    }
}
