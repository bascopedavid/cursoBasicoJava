package org.pattern24.clase20;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ManejadorProducto {

    private Formateador formateador;
    private Map<Producto, List<Review>> productos = new HashMap<>();
    private static Map<String, Formateador> formateadores =
            Map.of("en-US", new Formateador(Locale.US),
                    "es", new Formateador(new Locale("es")),
                    "fr-FR", new Formateador(Locale.FRANCE),
                    "jp", new Formateador(new Locale("jp")));

    public ManejadorProducto(String lenguaje) {
        cambiarLocale(lenguaje);
    }

    public void cambiarLocale(String lenguaje) {
        formateador = formateadores.getOrDefault(lenguaje, formateadores.get("es"));
    }

    public Producto crearProducto(int id, String nombre, BigDecimal precio, Calificacion calificacion, LocalDate fechaElaboracion) {
        Producto producto = new Comida(id, nombre, precio, calificacion, fechaElaboracion);
        productos.put(producto, new ArrayList<>());
        return producto;
    }

    public Producto crearProducto(int id, String nombre, BigDecimal precio, Calificacion calificacion) {
        Producto producto = new Bebida(id, nombre, precio, calificacion);
        productos.put(producto, new ArrayList<>());
        return producto;
    }

    public Producto buscarProducto(int id) {
        Producto resultado = null;
        for (Producto producto : productos.keySet()) {
            if (producto.getId() == id) {
                resultado = producto;
                break;
//                return producto;
            }
        }
        return resultado;
    }

    public Producto calificarProducto(int id, int calificacion, String comentario) {
        return calificarProducto(buscarProducto(id), calificacion, comentario);
    }

    public Producto calificarProducto(Producto producto, int calificacion, String comentario) {
        List<Review> reviews = productos.get(producto);
        productos.remove(producto);
        reviews.add(new Review(calificacion, comentario));
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getCalificacion();
        }
        producto = producto.aplicarCalificacion(Calificable.convertir(Math.round((float) sum / reviews.size())));
        productos.put(producto, reviews);
        return producto;
    }

    public void imprimirProductos() {
        List<Producto> listaProductos = new ArrayList<>(productos.keySet());
        StringBuilder txt = new StringBuilder();
        for (Producto producto : listaProductos) {
            txt.append(formateador.formatearProducto(producto));
            txt.append('\n');
            for (Review review : productos.get(producto)) {
                txt.append(formateador.formatearReview(review));
                txt.append('\n');
            }
        }
        System.out.println(txt);
    }

    private static class Formateador {
        private Locale locale;
        private ResourceBundle recursos;
        private DateTimeFormatter dateFormat;
        private NumberFormat moneyFormat;

        private Formateador(Locale locale) {
            this.locale = locale;
            recursos = ResourceBundle.getBundle("mensajes", locale);
            dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
        }

        private String formatearProducto(Producto producto) {
            return MessageFormat.format(
                    recursos.getString("producto"),
                    producto.getNombre(),
                    moneyFormat.format(producto.getPrecio()),
                    producto.getCalificacion().getEstrellas(),
                    dateFormat.format(LocalDate.now()),
                    producto.getCalificacion().ordinal());
        }

        private String formatearReview(Review review) {
            return MessageFormat.format(
                    recursos.getString("calificacion"),
                    review.getEstrellas(),
                    review.getCalificacion(),
                    review.getComentario());
        }
    }
}
