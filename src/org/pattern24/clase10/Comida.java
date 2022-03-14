package org.pattern24.clase10;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class Comida extends Producto {
    private LocalDate fechaElaboracion = LocalDate.now();

    public Comida() {
        super(200, "Pan", BigDecimal.valueOf(0.5), Calificacion.CINCO_ESTRELLAS);
//        this.fechaElaboracion = LocalDate.now();
    }

    @Override
    public BigDecimal getDescuento() {
        return BigDecimal.ZERO;
    }

    public Comida(int id, String nombre, BigDecimal precio, Calificacion calificacion, LocalDate fechaElaboracion) {
        super(id, nombre, precio, calificacion);
        this.fechaElaboracion = fechaElaboracion;
    }

    @Override
    public Comida cambiarPrecio(BigDecimal precio) {
        return new Comida(super.getId(), super.getNombre(), precio, super.getCalificacion(), this.fechaElaboracion);
    }

    public Comida(LocalDate fechaElaboracion) {
        this();
        this.fechaElaboracion = fechaElaboracion;
    }

    public LocalDate getFechaElaboracion() {
        return fechaElaboracion;
    }

    @Override
    public void mostrarInformacion(String lenguaje) {
        Locale locale = Locale.forLanguageTag(lenguaje);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", locale);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(MessageFormat.format(
                resourceBundle.getString("producto"),
                this.getNombre(),
                numberFormat.format(this.getPrecio()),
                this.getCalificacion().getEstrellas(),
                dateTimeFormatter.format(this.fechaElaboracion),
                this.getCalificacion().ordinal())
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        } else {
            if (obj instanceof Comida) {
                Comida p = (Comida) obj;
                if (this.getId() == p.getId()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
//        return this.getId();
    }
}
