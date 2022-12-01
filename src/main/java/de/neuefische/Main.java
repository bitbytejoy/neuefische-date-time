package de.neuefische;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(ZoneId.getAvailableZoneIds());

        // LocalDate
        LocalDate localDate = LocalDate.now(ZoneId.of("Europe/Berlin"));

        String datePattern = "d MMM yy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern);
        System.out.println(localDate.format(dateFormatter));

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localDateTime);

        String dateTimePattern = "E, dd MMM yyyy HH:mm:ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimePattern);
        System.out.println(localDateTime.format(dateTimeFormatter));

        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(zonedDateTime);

        String zonedDateTimePattern = "'Elvedin hat gesagt' dd, MMM, yyyy, HH:mm:ss zzzz";
        DateTimeFormatter zonedDateTimeFormatter = DateTimeFormatter
                .ofPattern(zonedDateTimePattern)
                .withLocale(Locale.GERMAN);
        System.out.println(zonedDateTime.format(zonedDateTimeFormatter));

        // Unix Timestamp
        System.out.println("UNIX TIMESTAMP: " + zonedDateTime.toEpochSecond());
    }
}