package Lecture25.Task1;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //1
        LocalDateTime countTimeOfFirstTaskStart = LocalDateTime.now(); //начало счета времени выполнения первого задания

        Date date = new Date(Calendar.YEAR + 101, 8, 10, 10, 45, 0);
        LocalDate localDate = LocalDate.of(Calendar.YEAR + 2001, 9, 10);
        LocalDateTime localDateTime = LocalDateTime.of(2002, 9, 10, 10, 45);
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2002, 8, 10, 10, 45);

        //Форматирование Date
        LocalDateTime timerDateStart = LocalDateTime.now();
        System.out.println("Date:" + String.format("%n"));
        System.out.println(date);
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
        System.out.println(new SimpleDateFormat("HH-mm dd-MM-yy").format(date));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy HH-mm").format(date));
        System.out.println(new SimpleDateFormat("dd:MM:yyyy HH:mm").format(date));
        LocalDateTime timerDateEnd = LocalDateTime.now();

        //Форматирование LocalDate
        LocalDateTime timerLocalDateStart = LocalDateTime.now();
        System.out.println(String.format("%n") + "Local date:" + String.format("%n"));
        System.out.println(localDate);
        System.out.println(DateTimeFormatter.ofPattern("dd MM yyyy").format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy").format(localDate));
        System.out.println(DateTimeFormatter.ISO_ORDINAL_DATE.format(localDate));
        System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(localDate));
        LocalDateTime timerLocalDateEnd = LocalDateTime.now();

        //Форматирование LocalDateTime
        LocalDateTime timerLocalDateTimeStart = LocalDateTime.now();
        System.out.println(String.format("%n") + "Local date time:" + String.format("%n"));
        System.out.println(localDateTime);
        System.out.println(DateTimeFormatter.ofPattern("dd MM yyyy").format(localDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy").format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_DATE.format(localDateTime));
        LocalDateTime timerLocalDateTimeEnd = LocalDateTime.now();

        //Форматирование ZonedDateTime
        LocalDateTime timerZonedDateTimeStart = LocalDateTime.now();
        System.out.println(String.format("%n") + "Zoned date time:" + String.format("%n"));
        System.out.println(zonedDateTime);
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_OFFSET_TIME.format(zonedDateTime));
        LocalDateTime timerZonedDateTimeEnd = LocalDateTime.now();

        //Форматирование GregorianCalendar
        LocalDateTime timerGregorianCalendarStart = LocalDateTime.now();
        System.out.println(String.format("%n") + "Gregorian calendar:" + String.format("%n"));
        System.out.println(gregorianCalendar.getTime());
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(gregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(gregorianCalendar.toZonedDateTime()));
        LocalDateTime timerGregorianCalendarEnd = LocalDateTime.now();

        LocalDateTime countTimeOfFirstTaskEnd = LocalDateTime.now(); //Окончания счета времени первого задания

        //2
        Date date1 = new Date();
        System.out.println(String.format("%n") + "Comparison between current time and birthday (Class date): ");
        System.out.println(Duration.ofMillis(date1.getTime() - date.getTime()));

        LocalDate localDate1 = LocalDate.now();
        System.out.println(String.format("%n") + "Comparison between current time and birthday (Class Local Date): ");
        System.out.println(Duration.between(localDate.atStartOfDay(), localDate1.atStartOfDay()));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(String.format("%n") + "Comparison between current time and birthday (Class Local Date Time): ");
        System.out.println(Duration.between(localDateTime, localDateTime1));

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(String.format("%n") + "Comparison between current time and birthday (Class date): ");
        System.out.println(Duration.between(zonedDateTime, zonedDateTime1));

        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        System.out.println(String.format("%n") + "Comparison between current time and birthday (Class Gregorian Calendar): ");
        System.out.println(Duration.between(gregorianCalendar.toZonedDateTime(), gregorianCalendar1.toZonedDateTime()));

        //3
        System.out.println(String.format("%n") + "Run time of first task:");
        double sumOfTimeOfFirstTask = (countTimeOfFirstTaskEnd.getNano() - countTimeOfFirstTaskStart.getNano());
        System.out.println(sumOfTimeOfFirstTask);

        //4
        double sumOfTimeDate = Duration.between(timerDateStart, timerDateEnd).toMillis();
        System.out.println("Run time of Date Class:" + sumOfTimeDate);

        double sumOfTimeLocalDate = Duration.between(timerLocalDateStart, timerLocalDateEnd).toMillis();
        System.out.println(String.format("%n") + "Run time of Local Date Class:" + String.format("%n") + sumOfTimeLocalDate);

        double sumOfTimeLocalDateTime = Duration.between(timerLocalDateTimeStart, timerLocalDateTimeEnd).toMillis();
        System.out.println(String.format("%n") + "Run time of Local Date Time Class: " + String.format("%n") + sumOfTimeLocalDateTime);

        double sumOfTimeZonedDateTime = Duration.between(timerZonedDateTimeStart, timerZonedDateTimeEnd).toMillis();
        System.out.println(String.format("%n") + "Run time of Zoned Date Time Class: " + String.format("%n") + sumOfTimeZonedDateTime);

        double sumOfTimeGregorianCalendar = Duration.between(timerGregorianCalendarStart, timerGregorianCalendarEnd).toMillis();
        System.out.println(String.format("%n") + "Run time of Gregorian Calendar Class: " + String.format("%n") + sumOfTimeGregorianCalendar);
    }
}
