package com.greenhand.classstudy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class ClassStudy {

    private static int monDay = 1;

    private void calendarPrint(LocalDate now){
        int nowDay = now.getDayOfMonth();
        LocalDate date = now.minusDays(nowDay - 1);
        int startWeek = date.getDayOfWeek().getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < startWeek; i++) {
            System.out.print("    ");
        }

        int nowMonth = date.getMonthValue();
        while (date.getMonthValue() == nowMonth){
            int dateDay = date.getDayOfMonth();
            if (date.getDayOfWeek().getValue() == monDay){
                System.out.println();
            }
            System.out.printf("%3d", dateDay);

            if (dateDay == nowDay){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }

            date = date.plusDays(1);
        }
        System.out.println();
    }

    public void getCalendar(){
        this.calendarPrint(LocalDate.now());
    }

    public void getCalendar(int year, int month, int day){
        calendarPrint(LocalDate.of(year, month, day));
    }

    public void getCalendar(int month, int day){
        calendarPrint(LocalDate.of(LocalDate.now().getYear(), month, day));
    }

    public static void main(String[] args) {
        Date date;
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        ClassStudy classStudy = new ClassStudy();

        classStudy.getCalendar();
        classStudy.getCalendar(1, 2);
        System.out.println();
    }
}
