package org.pattern24.clase9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class Producto {
    public static final BigDecimal DESCUENTO = BigDecimal.valueOf(0.1);
    static {
        System.out.println("static context");
    }
    private int id;
    private String nombre;
    private BigDecimal precio;
    private Calificacion calificacion;
    {
        //valores por defecto
        System.out.println("instance context");
        nombre = "instance";
//        System.out.println("nombre:" + nombre);
    }

    public Producto(int id, String nombre, BigDecimal precio, Calificacion calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
    }

    public Producto() {
        this(0, "No definido", BigDecimal.valueOf(0), Calificacion.SIN_CALIFICACION);
    }

    public Producto(int id, String nombre, BigDecimal precio) {
        this(id, nombre, precio, Calificacion.SIN_CALIFICACION);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

//    public final BigDecimal getDescuento() {
//        return precio.multiply(DESCUENTO).setScale(2, RoundingMode.HALF_UP);
//    }

    public abstract BigDecimal getDescuento();

//    public Producto cambiarPrecio(BigDecimal precio) {
//        return new Producto(this.id, this.nombre, precio, this.calificacion);
//    }

    public abstract Producto cambiarPrecio(BigDecimal precio);

    public void mostrarInformacion(String lenguaje) {
        Locale locale = Locale.forLanguageTag(lenguaje);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", locale);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(MessageFormat.format(
                resourceBundle.getString("producto"),
                this.nombre, numberFormat.format(this.precio), this.calificacion.getEstrellas(), dateTimeFormatter.format(LocalDate.now()), this.calificacion.ordinal()));
    }

//    @Override
//    public String toString() {
//        Locale locale = Locale.forLanguageTag("en-US");
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", locale);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
//        return MessageFormat.format(
//                resourceBundle.getString("producto"),
//                this.nombre, numberFormat.format(this.precio), this.calificacion.getEstrellas(), dateTimeFormatter.format(LocalDate.now()), this.calificacion.ordinal());
//    }


//    @Override
//    public boolean equals(Object obj) {
//        if (super.equals(obj)) {
//            return true;
//        } else {
//            return this.id == () obj.getId();
//        }
//    }
}
