package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 24.07.2015.
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    private static String[] strMonths = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Noc","Dec"};
    private static String[] strDays = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static int[] daysInMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//    public MyDate(int year, int month, int day){
//        setDate(year, month, day);
//    }

    public static boolean isLeapYear(int year){
        return ((year%4 == 0 && year%100 != 0) || year%400 == 0);
    }

//    TODO: public static boolean isValidDate(int year, int month, int day)
//
//    TODO: public static int getDayOfWeek(int year, int month, int day)

//    public void setDate(int year, int month, int day){
//        if(isValidDate(year, month, day)){
//            this.year = year;
//            this.month = month;
//            this.day = day;
//        }
//        else{
//            throw new IllegalArgumentException("Invalid year, month or day!");
//        }
//    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1 && year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 && month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 && day > 31) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }
}
