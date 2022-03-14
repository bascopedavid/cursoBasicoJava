package org.pattern24.clase24;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.stream.Collectors;

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
        return productos.keySet().stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Producto calificarProducto(int id, int calificacion, String comentario) {
        return calificarProducto(buscarProducto(id), calificacion, comentario);
    }

    public Producto calificarProducto(Producto producto, int calificacion, String comentario) {
        List<Review> reviews = productos.get(producto);
        productos.remove(producto);
        reviews.add(new Review(calificacion, comentario));

        int promedio = (int) Math.round(
                reviews.stream()
                        .mapToInt(r -> r.getCalificacion())
                        .average()
                        .orElse(0));
//        int suma = reviews.stream().mapToInt(r -> r.getCalificacion()).sum();
//        long cant = reviews.stream().mapToInt(r -> r.getCalificacion()).count();
//        int promedio1 = (int) Math.round(suma/cant);
//        int min = reviews.stream().mapToInt(r -> r.getCalificacion()).min().orElse(Integer.MIN_VALUE);
//        int max = reviews.stream().mapToInt(r -> r.getCalificacion()).max().orElse(Integer.MAX_VALUE);
        producto = producto.aplicarCalificacion(Calificable.convertir(promedio));
        productos.put(producto, reviews);
        return producto;
    }

    public void imprimirProductos() {
        StringBuilder txt = new StringBuilder();
        productos.keySet().forEach(p -> {
            txt.append(formateador.formatearProducto(p))
                .append('\n');
            productos.get(p).stream()
//                    .filter(p0 -> p0.getCalificacion() > 3)
//                    .skip(1)
//                    .limit(2)
                    .sorted((c1, c2) -> c2.getCalificacion() - c1.getCalificacion())
//                    .skip(1)
//                    .limit(10)
                    .forEach(r -> {
                txt.append(formateador.formatearReview(r))
                    .append('\n');
            });
        });
        System.out.println(txt);
    }

    public Map<String, String> getDescuentos() {
        return productos.keySet().stream()
                .collect(Collectors.groupingBy(
                        p -> p.getCalificacion().getEstrellas(),
                        Collectors.collectingAndThen(
                                Collectors.summingDouble(pr -> pr.getDescuento().doubleValue()),
                                d -> formateador.moneyFormat.format(d)
                        ))
                );
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
