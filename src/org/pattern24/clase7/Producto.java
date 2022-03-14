package org.pattern24.clase7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Producto {
    public static final BigDecimal DESCUENTO = BigDecimal.valueOf(0.1);
    static {
        System.out.println("static context");
    }
    private int id;
    private String nombre;
    private BigDecimal precio;
    private String calificacion;
    {
        //valores por defecto
        System.out.println("instance context");
        nombre = "instance";
//        System.out.println("nombre:" + nombre);
    }

    public Producto(int id, String nombre, BigDecimal precio, String calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
    }

    public Producto() {
        this(0, "No definido", BigDecimal.valueOf(0), "\u2606\u2606\u2606\u2606\u2606");
//        this.id = 0;
//        this.nombre = "Cafe";
//        this.precio = BigDecimal.valueOf(0);
//        this.calificacion = "";
    }

    public Producto(int id, String nombre, BigDecimal precio) {
        this(id, nombre, precio, "\u2606\u2606\u2606\u2606\u2606");
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getNombre() {
        return nombre;
    }

//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    public BigDecimal getPrecio() {
        return precio;
    }

//    public void setPrecio(BigDecimal precio) {
//        this.precio = precio;
//    }

    public String getCalificacion() {
        return calificacion;
    }

//    public void setCalificacion(String calificacion) {
//        this.calificacion = calificacion;
//    }

    public BigDecimal getDescuento() {
        return precio.multiply(DESCUENTO).setScale(2, RoundingMode.HALF_UP);
    }

    public Producto cambiarPrecio(BigDecimal precio) {
        return new Producto(this.id, this.nombre, precio, this.calificacion);
    }

    public void mostrarInformacion(String lenguaje) {
        Locale locale = Locale.forLanguageTag(lenguaje);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", locale);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(MessageFormat.format(
                resourceBundle.getString("producto"),
                this.nombre, numberFormat.format(this.precio), this.calificacion, dateTimeFormatter.format(LocalDate.now())));
    }
}
