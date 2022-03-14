package org.pattern24.clase18;

public class Persona implements Comparable<Persona> {
    int carnetIdentidad;
    String nombre;

    public Persona(int carnetIdentidad, String nombre) {
        this.carnetIdentidad = carnetIdentidad;
        this.nombre = nombre;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.carnetIdentidad + "-" + this.nombre;
    }

    @Override
    public int compareTo(Persona o) {
//        return this.getCarnetIdentidad() - o.getCarnetIdentidad();
//        return this.getNombre().compareTo(o.getNombre());
        return o.getNombre().length() - this.getNombre().length();
    }
}
