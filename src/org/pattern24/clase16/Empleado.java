package org.pattern24.clase16;

public class Empleado<T> {
    public void mostrarTipo(T argumento) {
        System.out.println("El argumento es:" + argumento);
    }
}
