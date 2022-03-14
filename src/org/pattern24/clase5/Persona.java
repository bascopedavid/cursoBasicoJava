package org.pattern24.clase5;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Persona {
    private int carnetIdentidad;
    private String nombre;
    private LocalDate fechaNacimiento;
    private ResourceBundle resourceBundle;

    public Persona(int carnetIdentidad, String nombre, LocalDate fechaNacimiento) {
        this.carnetIdentidad = carnetIdentidad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(int carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarInformacion(String lenguaje) {
        Locale locale = Locale.forLanguageTag(lenguaje);
        resourceBundle = ResourceBundle.getBundle("mensajes", locale);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        System.out.println(MessageFormat.format(
                resourceBundle.getString("infoPersonal"),
                this.nombre, dateTimeFormatter.format(this.fechaNacimiento),
                edad.getYears(), String.valueOf(this.carnetIdentidad)));
    }
}
