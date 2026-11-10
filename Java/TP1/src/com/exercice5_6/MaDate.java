package com.exercice5_6;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MaDate {
    public static int calculateAge(LocalDate birthDate) {

        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static String formatDate(LocalDateTime dateTime) {
        //Solution 1
            /*return dateTime.getDayOfMonth()+"/"
				+dateTime.getMonthValue() + "/"
				+dateTime.getYear()+ " "
				+dateTime.getHour()+ ":"
				+dateTime.getMinute();*/
        //Solution optimale
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:mm");

        return dateTime.format(formatter);

    }
/*
    public static long daysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
*/
    public static LocalDate addDaysToDate(LocalDate date, int days) {
        return date.plusDays(days);
    }
}
