package uk.co.andymccall.codility;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import static java.lang.Math.toIntExact;


public class HolidayWeeks {

    public int solution(int Y, String A, String B, String W) {

        int year = Y;
        int startMonth = Month.valueOf(A.toUpperCase()).getValue();
        int endMonth = Month.valueOf(B.toUpperCase()).getValue();

        if (startMonth > endMonth) {
            int tempMonth = endMonth;
            endMonth = startMonth;
            startMonth = tempMonth;
        }

        return toIntExact((ChronoUnit.DAYS.between(getFirstMonday(year, startMonth),
                getLastSunday(year, endMonth))+1)/7);
    }

    private LocalDate getFirstMonday(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            if ("Monday".equalsIgnoreCase(date.getDayOfWeek().toString())) {
                break;
            } else {
                date = date.plusDays(1);
            }
        }
        return date;
    }

    private LocalDate getLastSunday(int year, int month) {
        LocalDate date = LocalDate.of(year, month+1, 1);
        date=date.minusDays(1);
        for (int i = date.lengthOfMonth(); i > 1; i--) {
            if ("Sunday".equalsIgnoreCase(date.getDayOfWeek().toString())) {
                break;
            } else {
                date = date.minusDays(1);
            }
        }
        return date;
    }



}
