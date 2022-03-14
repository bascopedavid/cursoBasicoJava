package org.pattern24;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Clase4 {
    final double DESCUENTO_IVA = 0.13; //constantes
    private int id;
    private String nombre;

    public Clase4() {
//        this.id = 1;
//        this.nombre = "Prueba";
    }

    public Clase4(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Clase4(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String [] args) {
        double precio = 123.432;
        System.out.println("El precio es: " + precio + "Bs");
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println("El precio es: " + format.format(precio));
        Locale locale = Locale.GERMAN;
        format = NumberFormat.getCurrencyInstance(locale);
        System.out.println("El precio es: " + format.format(precio));
        locale = Locale.UK;
        format = NumberFormat.getCurrencyInstance(locale);
        System.out.println("El precio es: " + format.format(precio));
        locale = Locale.JAPAN;
        format = NumberFormat.getCurrencyInstance(locale);
        System.out.println("El precio es: " + format.format(precio));


        System.out.println("--------------");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", Locale.forLanguageTag("us"));
        System.out.println(MessageFormat.format(resourceBundle.getString("precio"), precio));

        Clase4 ejemplo = new Clase4();
        System.out.println(ejemplo.id + ":" + ejemplo.nombre);
        Clase4 ejemplo1 = new Clase4(2, "Ejemplo");
        System.out.println(ejemplo1.id + ":" + ejemplo1.nombre);
        Clase4 ejemplo2 = new Clase4("Ejemplo");
        System.out.println(ejemplo2.id + ":" + ejemplo2.nombre);
    }

    public void mostrar(final String mensaje) {
        System.out.println(mensaje);
        System.out.println(id + ":" + nombre);
        System.out.println("Descuento:" + DESCUENTO_IVA);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
