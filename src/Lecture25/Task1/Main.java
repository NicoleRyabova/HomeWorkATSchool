package Lecture25.Task1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(Calendar.YEAR + 101, 8, 10, 10, 45, 0);
        LocalDate localDate = LocalDate.of(Calendar.YEAR + 2001, 9, 10);
        LocalDateTime localDateTime = LocalDateTime.of(2002, 9, 10, 10, 45);
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2002, 8, 10, 10, 45);

        //Форматирование Date
        System.out.println("Date:" + String.format("%n"));
        System.out.println(date);
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
        System.out.println(new SimpleDateFormat("HH-mm dd-MM-yy").format(date));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy HH-mm").format(date));
        System.out.println(new SimpleDateFormat().format(date));

        //Форматирование LocalDate
        System.out.println(String.format("%n") + "Local date:" + String.format("%n"));
        System.out.println(localDate);
        System.out.println(DateTimeFormatter.ofPattern("dd MM yyyy").format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy").format(localDate));
        System.out.println(DateTimeFormatter.ISO_ORDINAL_DATE.format(localDate));
        System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(localDate));

        //Форматирование LocalDateTime
        System.out.println(String.format("%n") + "Local date time:" + String.format("%n"));
        System.out.println(localDateTime);
        System.out.println(DateTimeFormatter.ofPattern("dd MM yyyy").format(localDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy").format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_DATE.format(localDateTime));

        //Форматирование ZonedDateTime
        System.out.println(String.format("%n") + "Zoned date time:" + String.format("%n"));
        System.out.println(zonedDateTime);
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_OFFSET_TIME.format(zonedDateTime));

        //Форматирование GregorianCalendar
        System.out.println(String.format("%n") + "Gregorian calendar:" + String.format("%n"));
        System.out.println(gregorianCalendar.getTime());
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(gregorianCalendar.toZonedDateTime()));
    }
}
