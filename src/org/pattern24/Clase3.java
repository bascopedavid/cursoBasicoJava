package org.pattern24;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Clase3 {
    public static void main(String [] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.atTime(2, 32));
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.withYear(1992).getDayOfWeek());
        System.out.println(localDate.plusDays(25).getDayOfYear());

        System.out.println("-------------");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.isBefore(LocalTime.now()));
        System.out.println(LocalTime.now().atDate(localDate));
        System.out.println(localTime.minusMinutes(90));

        System.out.println("-------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.plusHours(48));

        System.out.println("-------------");
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.plusMillis(1));
        System.out.println(instant.minusMillis(10));

        System.out.println("-------------");
        Duration duration = Duration.between(LocalDate.now().atStartOfDay(), LocalDateTime.now());
        System.out.println(duration);
        duration = Duration.between(LocalTime.now(), LocalTime.now());
        System.out.println(duration);
        duration = Duration.between(Instant.now(), Instant.now());
        System.out.println(duration);
        duration = Duration.between(LocalDateTime.now(), LocalDate.now().atStartOfDay());
        System.out.println(duration);

        System.out.println("-------------");
        Period period = Period.of(2, 5, 23);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        ZoneId zoneId = ZoneId.of("GMT-2");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        System.out.println(localDateTime.atZone(ZoneId.of("GMT+3")));
        System.out.println(localDateTime.atZone(ZoneId.of("Europe/Paris")));
        System.out.println(localDateTime.atZone(ZoneId.of("Asia/Almaty")));
        System.out.println(zonedDateTime.toLocalDate());
        System.out.println(zonedDateTime.toOffsetDateTime());
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("GMT+3")));
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris")));
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Almaty")));

        System.out.println("-------------");
        Locale locale = Locale.US;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        System.out.println(dateFormat.format(LocalDate.now()));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.CHINA);
        System.out.println(dateFormat.format(LocalDate.now()));
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.FRENCH);
        System.out.println(dateFormat.format(LocalDate.now()));
    }
}
