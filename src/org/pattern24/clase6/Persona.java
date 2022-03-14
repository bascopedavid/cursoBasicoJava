package org.pattern24.clase6;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import static java.lang.Math.random;

public class Persona {
    private static int MAYORIA_EDAD;
    static {
        MAYORIA_EDAD = 21;
        System.out.println("static context");
    }
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
        System.out.println("Aleatorio: " + random());
    }

    public boolean esMayorDeEdad() {
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
//        if (edad.getYears() >= MAYORIA_EDAD) {
//            return true;
//        } else {
//            return false;
//        }
        return edad.getYears() >= MAYORIA_EDAD;
    }

    public static void  pruebaVarArgs(String... args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

    public static void pruebaVarArgs(Persona... args) {
        args[0].mostrarInformacion("es");
        args[1].mostrarInformacion("es");
        args[2].mostrarInformacion("es");
    }

}
