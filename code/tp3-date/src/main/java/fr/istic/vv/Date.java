package fr.istic.vv;

import java.time.LocalDate;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Date invalide " + day + " " + month + " "  + year );
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }

    public Date nextDate() {
        LocalDate date = LocalDate.of(year, month, day).plusDays(1);
        return new Date(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    public Date previousDate() {
        LocalDate date = LocalDate.of(year, month, day).minusDays(1);
        return new Date(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    public int compareTo(Date other) {
        java.util.Date date = new java.util.Date(year, month, day);
        return date.compareTo(new java.util.Date(other.year, other.month, other.day));
    }
}
