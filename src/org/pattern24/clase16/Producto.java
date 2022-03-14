package org.pattern24.clase16;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class Producto implements Calificable<Producto> {
    public static final BigDecimal DESCUENTO = BigDecimal.valueOf(0.1);
//    private static Review[] reviews = new Review[5];
    private static List<Review> reviews = new ArrayList<>();
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

//        public Review[] getReviews() {
    public List<Review> getReviews() {
        return reviews;
    }

    //    public final BigDecimal getDescuento() {
//        return precio.multiply(DESCUENTO).setScale(2, RoundingMode.HALF_UP);
//    }

    protected abstract BigDecimal getDescuento();

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


    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        } else {
            if (obj instanceof Producto) {
                Producto p = (Producto) obj;
                return this.id == p.getId();
            }
        }
        return false;
    }

//    @Override
//    public Calificacion aplicarCalificacion(int estrellas) {
//        return  (estrellas >= 0 && estrellas <= 5) ? Calificacion.values()[estrellas] : CALIFICACION_POR_DEFECTO;
////        return  new Bebida(this.getId(), this.getNombre(), this.getPrecio(), calificacion);
//    }
//
//
//    @Override
//    public void functional() {
//
//    }

    public abstract Producto reviewProducto(Calificacion calificacion, String comentario);

    public void agregarReview(Review review) {
//        reviews[reviews.length - 1] = review;
        reviews.add(review);
    }
}
