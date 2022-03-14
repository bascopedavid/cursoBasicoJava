package org.pattern24;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Clase3Ejercicio {
    public static void main(String [] args) {
        System.out.println("Mi cumpleaños:");
        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1983, 11,24);
        Duration days = Duration.between(birthDay.atStartOfDay(), today.atStartOfDay());
        System.out.println("\tHoy cumplo " + days.toDays() + " dias.");


        System.out.println("Año nuevo:");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newYear = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
        Duration countdown = Duration.between(now, newYear);
        System.out.println("\tFaltan " + countdown.toDaysPart() + " dias, "
                + countdown.toHoursPart() + " horas, "
                + countdown.toMinutesPart() + " minutos y "
                + countdown.toSecondsPart() + " segundos para año nuevo");


        System.out.println("Navidad:");
        LocalDate xmas = LocalDate.of(2021, 12, 25);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.ITALY);
        System.out.println("\tItalia: " + dateFormat.format(xmas));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.UK);
        System.out.println("\tGran Bretaña: " + dateFormat.format(xmas));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.JAPANESE);
        System.out.println("\tJapon: " + dateFormat.format(xmas));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.getDefault());
        System.out.println("\tDefault: " + dateFormat.format(xmas));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.forLanguageTag("es"));
        System.out.println("\tEspañol: " + dateFormat.format(xmas));
    }
}
